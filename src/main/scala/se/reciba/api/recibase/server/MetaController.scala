package se.reciba.api.server

import cats.Applicative
import cats.implicits._
import se.reciba.api.model.Manifest

trait MetaController[F[_]] {
  def manifest: F[Manifest]
  def docs: F[Map[String, String]]
}

object MetaController {
  def impl[F[_]: Applicative]: MetaController[F] =
    new MetaController[F] {
      override def manifest: F[Manifest] = Manifest(
        sys.env.getOrElse("RENDER_GIT_COMMIT", "latest")
      ).pure[F]
      override def docs: F[Map[String, String]] = Map(
        "docs" -> "/",
        "recipes_list" -> "/recipes/?hasIngredient={ingredient_name}",
        "recipe" -> "/recipes/{recipe_permalink}",
        "meals_list" -> "/meals/",
        "meal_names_text" -> "/meals/raw",
        "service_info" -> "/manifest"
      ).pure[F]
    }
}
