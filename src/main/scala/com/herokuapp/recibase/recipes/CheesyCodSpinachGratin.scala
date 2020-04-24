package com.herokuapp.recibase.recipes

import com.herokuapp.recibase.{Ingredient, Recipe}

object CheesyCodSpinachGratin extends
Recipe(
  "Cheesy Cod and Spinach Gratin",
  "cheesy-cod",
  None,
  None,
  None,
  List(
    Ingredient("Cod", Some("2 110g fillets")),
    Ingredient("Stock cube", Some("1")),
    Ingredient("Spinach", Some("80g"), Some("torn or chopped")),
    Ingredient("Panko breadcrumbs", Some("30g")),
    Ingredient("Cheddar", Some("40g"), Some("grated")),
    Ingredient("Soft cheese", Some("50g")),
    Ingredient("Water", Some("150ml"), Some("boiling"))
  ),
  List(
    "Dissolve the stock cube and soft cheese in the boiling water.",
    "Place the spinach in an ovenproof dish and pour over the cheesy stock.",
    "Place the cod fillets on top of the spinach.",
    "Sprinkle the cheddar and breadcrumbs over the cod.",
    "Put in the oven for 15-20 mins or until the fish is cooked through."
  )
)