package com.herokuapp.recibase.recipes

import com.herokuapp.recibase.{Ingredient, Recipe, Tag}

object CranberryRelish extends Recipe {
  val name = "Cranberry & Cinnamon Relish"
  val permalink = "cranberry-relish"

  override val source: Option[String] = Some("Kit's Mum")
  override val notes: Option[String] = Some(
    "This is best made in advance, to give the flavours time to mix"
  )
  override val tags = Set(Tag.Christmas)

  val ingredients = List(
    Ingredient("Red onions", Some("2"), Some("thinly sliced")),
    Ingredient("Brown sugar", "3 tbsp"),
    Ingredient("Cranberries", "450g"),
    Ingredient("Redcurrant jelly", "2 tbsp"),
    Ingredient("Cinnamon stick", "1"),
    Ingredient("Vegetable oil", "tbsp")
  )
  val method = List(
    "Gently cook the onions in the oil and sugar for about 20 minutes, stirring frequently, until soft and caramelised.",
    "Add the remaining ingredients along with 150ml boiling water.",
    "Simmer gently for about 10 minutes until the cranberries are softened but not completely broken down.",
    "Add additional sugar if needed, but don't overdo it. The relish should have a tart flavour.",
    "Serve warm or cold."
  )
}
