package com.herokuapp.recibase.recipes

import com.herokuapp.recibase.{Ingredient, Recipe}

object CheesyCodSpinachGratin {
  val recipe = Recipe(
    "Cheesy Cod and Spinach Gratin",
    "cheesy-cod",
    List(
      Ingredient("Cod", "2 110g fillets"),
      Ingredient("Stock cube", "1"),
      Ingredient("Spinach", Some("80g"), Some("torn or chopped")),
      Ingredient("Panko breadcrumbs", "30g"),
      Ingredient("Cheddar", Some("40g"), Some("grated")),
      Ingredient("Soft cheese", "50g"),
      Ingredient("Water", Some("150ml"), Some("boiling"))
    ),
    List(
      "Heat the oven to 200C.",
      "Dissolve the stock cube and soft cheese in the boiling water.",
      "Place the spinach in an ovenproof dish and pour over the cheesy stock.",
      "Place the cod fillets on top of the spinach.",
      "Sprinkle the cheddar and breadcrumbs over the cod.",
      "Put in the oven for 15-20 mins or until the fish is cooked through."
    )
  )
}
