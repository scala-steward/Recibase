package com.herokuapp.recibase.recipes

import com.herokuapp.recibase.{Ingredient, Recipe}

object ChilliConCarne extends
Recipe(
  "Chilli con Carne",
  "chilli-con-carne",
  None,
  None,
  None,
  List(
    Ingredient("Oil"),
    Ingredient("Salt"),
    Ingredient("Pepper"),
    Ingredient("Chilli Powder", Some("1 tsp")),
    Ingredient("Crushed or whole dried chillies", Some("1 tsp")),
    Ingredient("Paprika"),
    Ingredient("Tomato Puree"),
    Ingredient("Tinned tomatoes"),
    Ingredient("Italian Herbs"),
    Ingredient("Brown Sauce"),
    Ingredient("Beef stock cube or Bovril"),
    Ingredient("Rice"),
    Ingredient("Olive Oil"),
    Ingredient("Onion", Some("1")),
    Ingredient("Garlic Clove", Some("1")),
    Ingredient("Tinned Kidney Beans"),
    Ingredient("Honey", Some("1 tbsp"), None, Some("Optional")),
    Ingredient("Mince", Some("500g"))
  ),
  List(
    "Slice onions, crush garlic then brown in 2 tsp olive oil.",
    "Add the mince in batches and brown then stir in chilli powder and paprika.",
    "Add the stock cube/Bovril dissolved in a small amount of water and stir.",
    "Then add 2 inches or so of tomato purée and stir again, followed by the tinned tomatoes.",
    "Simmer for half an hour then check for taste.",
    "Add chilli powder or tomato purée depending on flavour, also salt/pepper if needed.",
    "A tablespoon of honey can improve the flavour.",
    "Serve with rice (preferably) or pasta."
  )
)