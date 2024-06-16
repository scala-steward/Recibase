package com.herokuapp.recibase.recipes

import com.herokuapp.recibase.model.{Ingredient, Recipe, Tag}

case object RoastedArtichokePasta extends Recipe {
  override val name: String = "Roasted Artichoke Pasta"

  override val source: Option[String] = Some(
    "Stephani"
  )
  override val tags =
    Set(Tag.Vegetarian, Tag.Scales, Tag.LowEffort, Tag.Stephani)

  override val notes = Some(
    """Ingredients are per person, so scale it appropriately.
      |
      |12 minutes for tomatoes and 27 for (Waitrose) artichokes at 200C in your oven. Can probably -2 to +5 on artichokes without much trouble.
      |
      |Waiting for the pasta and vegetables to cool before mixing with the ricotta is optional. It depends how to feel about heat affecting the ricotta's texture.
      |""".stripMargin
  )

  override val ingredients: List[Ingredient] = List(
    Ingredient("Sun-dried Tomatoes", "100g"),
    Ingredient("Roasted Artichokes", "140g"),
    Ingredient("Pine Nuts", None, None, Some("optional")),
    Ingredient("Ricotta", "80-125g"),
    Ingredient("Pasta", None, None, Some("preferably fresh")),
    Ingredient(
      "Mixed Herbs",
      None,
      None,
      Some("I use a Herbes de Provence blend")
    ),
    Ingredient("Salt")
  )

  override val method: List[String] = List(
    "Preheat the oven to 200 C (400 F, gas mark 6).",
    "Find a roasting tray with space for the artichokes and sun-dried tomatoes.",
    "Drain the jar of artichokes and lay them on the tray. Roast for 20-30 minutes.",
    "Drain the jar of sun-dried tomatoes and add them to the tray for the last 8-12 minutes.",
    "While the other ingredients are roasting add the ricotta and herbs to a mixing bowl. Mix well.",
    "If you're adding pine nuts then gently fry them in oil in a small frying pan.",
    "Cook the pasta per packet instructions then drain and leave to cool.",
    "Take the baking tray out of the oven and add all ingredients to the mixing bowl. Mix well and serve."
  )
}
