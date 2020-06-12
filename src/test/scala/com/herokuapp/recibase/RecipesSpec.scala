package com.herokuapp.recibase

import cats.effect.IO
import org.http4s._
import org.http4s.implicits._

class RecipesSpec extends org.specs2.mutable.Specification {
    "list" >> {
      "return 200" >> {
        recipesQuery.status must beEqualTo(Status.Ok)
      }

      "return a link to each recipe" >> {
        recipesQuery.as[String].unsafeRunSync() must contain("{\"name\":\"Vegetable Primavera\",\"url\":\"vegetable-primavera\"}")
      }
    }

    "single recipe" >> {
      "if recipe doesn't exist" >> {
        lazy val request = recipeQuery("i-do-not-exist")

        "returns 404" >> {
          request.status must beEqualTo(Status.NotFound)
        }

        "returns a useful error message" >> {
          request.as[String].unsafeRunSync() must beEqualTo("Recipe not found")
        }
      }
    }

  private def recipeQuery(url: String): Response[IO] = {
    val getRecipe = Request[IO](Method.GET, Uri.unsafeFromString(s"/recipes/$url"))
    val recipeController = RecipeController.impl[IO]
    RecibaseRoutes.recipeRoutes(recipeController).orNotFound(getRecipe).unsafeRunSync()
  }

  private lazy val recipesQuery: Response[IO] = {
    val getRecipes = Request[IO](Method.GET, uri"/recipes/")
    val recipeController = RecipeController.impl[IO]
    RecibaseRoutes.recipeRoutes(recipeController).orNotFound(getRecipes).unsafeRunSync()
  }
}
