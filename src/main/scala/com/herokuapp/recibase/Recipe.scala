package com.herokuapp.recibase

import io.circe.generic.JsonCodec
import StringUtils._
import io.circe.Encoder

@JsonCodec
case class Ingredient(
    name: String,
    quantity: Option[String] = None,
    prep: Option[String] = None,
    notes: Option[String] = None
)

trait Recipe {
  def name: String
  def permalink: String
  def source: Option[String] = None
  def description: Option[String] = None
  def tagline: Option[String] = None
  def notes: Option[String] = None
  def tags: Set[Tag] = Set.empty
  def image: Option[Image] = None
  def ingredients: List[Ingredient]
  def method: List[String]

  def hasIngredient(ingredient: String): Boolean = {
    val normalisedIngredient = ingredient.toLowerCase.unpluralise

    if (normalisedIngredient.startsWith("!")) {
      val filteredIngredient = normalisedIngredient.stripPrefix("!")
      !ingredients.exists(_.name.toLowerCase.contains(filteredIngredient))
    } else {
      ingredients.exists(_.name.toLowerCase.contains(normalisedIngredient))
    }
  }
}

object Recipe {
  implicit val encodeRecipe: Encoder[Recipe] =
    Encoder.forProduct10(
      "name",
      "permalink",
      "source",
      "description",
      "tagline",
      "notes",
      "tags",
      "image",
      "ingredients",
      "method"
    )(r =>
      (
        r.name,
        r.permalink,
        r.source,
        r.description,
        r.tagline,
        r.notes,
        r.tags,
        r.image,
        r.ingredients,
        r.method
      )
    )
}

object Ingredient {
  def apply(name: String, quantity: String): Ingredient =
    new Ingredient(name, Some(quantity))

  def apply(name: String, quantity: String, prep: String): Ingredient =
    new Ingredient(name, Some(quantity), Some(prep))
}
