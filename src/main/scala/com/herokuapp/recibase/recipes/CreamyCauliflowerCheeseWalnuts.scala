package com.herokuapp.recibase.recipes

import com.herokuapp.recibase.{Ingredient, Recipe}

object CreamyCauliflowerCheeseWalnuts {
  val recipe = Recipe(
    "Creamy cauliflower cheese with walnuts",
    "creamy-cauliflower-cheese",
    Some(
      "https://docs.google.com/document/d/1A0bgFOwirLW2mct8KNrxYdk4OEsGZtY23mFdgOljHFA"
    ),
    None,
    None,
    None,
    List.empty,
    None,
    List(
      Ingredient("Cauliflower", Some("1"), Some("cut into 1cm pieces")),
      Ingredient(
        "Creme Fraiche",
        Some("300g"),
        None,
        Some("or Cream Cheese")
      ),
      Ingredient("Dijon Mustard", "1 tsp"),
      Ingredient("Blue Cheese", Some("125g"), Some("crumbled")),
      Ingredient("Walnuts", Some("25g"), Some("roughly chopped")),
      Ingredient("Cheddar Cheese", Some("50g"), Some("grated")),
      Ingredient("Salt"),
      Ingredient("Black pepper")
    ),
    List(
      "Steam the cauliflower until tender, drain, then place in a grill-suitable dish",
      "Mix the cream cheese and mustard with the cauliflower, then stir in the blue cheese. Season with a little salt if necessary and plenty of pepper.",
      "Scatter the walnuts on top, then cover with the cheddar (this helps to prevent the walnuts from burning).",
      "Place under a preheated hot grill for 10-15 minutes, or until the top is golden brown and the inside hot and bubbling."
    )
  )
}
