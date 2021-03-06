package com.herokuapp.recibase.recipes

import com.herokuapp.recibase.{Ingredient, Recipe}

object ParsnipLentilLasagne {
  val recipe = Recipe(
    "Parsnip and Lentil Lasagne",
    "parsnip-and-lentil-lasagne",
    List(
      Ingredient("Lasagne sheets", Some("200g"), None, Some("12 sheets")),
      Ingredient("Soft Goats cheese", Some("150g"), None, Some("or ricotta")),
      Ingredient("Feta", "200g"),
      Ingredient(
        "Milk",
        Some("100ml"),
        None,
        Some("Full fat or semi-skimmed")
      ),
      Ingredient("Parsnips", Some("400g"), Some("sliced into sticks")),
      Ingredient("Red Onion", Some("1 large"), Some("thinly sliced")),
      Ingredient("Red lentils", "100g"),
      Ingredient("Red peppers", Some("2 large"), Some("diced")),
      Ingredient("Carrot", Some("1 large"), Some("thinly sliced")),
      Ingredient("Vegetable Stock", "300ml"),
      Ingredient("Passata", "250ml"),
      Ingredient(
        "Kidney Beans",
        Some("2 400g tins"),
        Some("drained and rinsed")
      ),
      Ingredient("Sunflower Oil", None, None, Some("or olive oil")),
      Ingredient("Bay Leaf"),
      Ingredient("Salt"),
      Ingredient("Pepper"),
      Ingredient("Nutmeg", None, Some("grated"), Some("Optional"))
    ),
    List(
      "Preheat the oven the 190C/gas mark 5.",
      "Heat the oil in a large saucepan.",
      "Add the onion and soften for about 10 minutes.",
      "Add the lentils, red peppers, carrot, vegetable stock, bay leaf and pasatta.",
      "Bring the mixture to the boil, then reduce the heat and simmer for 25 minutes or until the lentils/vegetables are soft.",
      "Oil and season the parsnips then roast in the oven for about 25 minutes.",
      "Remove the bay leaf and partially puree with a hand blender.",
      "Season with salt/pepper to taste then mix in the beans.",
      "Spoon 1/4 of the sauce over the bottom of a large greaseproof dish then cover with lasagne sheets.",
      "Add two more layers like so: spread half the sauce on top of the lasagne sheets, arrange half the roast parsnips in the sauce then finally cover with lasagne sheets.",
      "Put the ricotta cheese in a bowl and stir in the milk until smooth. If the ricotta is too firm/cold try giving the mixture a second or two in the microwave. Season with pepper.",
      "Spoon the ricotta mixture over the dish then scatter with crumbled goats cheese and nutmeg.",
      "Bake for 40 minutes or until bubbly and golden.",
      "Take out of the oven and leave to stand for 5 minutes before serving."
    )
  )
}
