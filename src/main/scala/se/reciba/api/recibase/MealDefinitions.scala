package se.reciba.api

import se.reciba.api.model.{
  GoogleDrive,
  Meal,
  MealStub,
  Online,
  Recipe,
  Source,
  Tag
}

object MealDefinitions {
  val mealStubs: Set[MealStub] =
    Recipe.recipes.map(MealStub.apply).toSet ++ Set(
      MealStub(
        "Apple & Sausage Filo Casserole",
        Set(Tag.Vegan, Tag.Scales, Tag.Slow),
        Online(
          "https://www.bbc.co.uk/food/recipes/vegan_apple_and_sausage_48574"
        )
      ),
      MealStub(
        "Aubergine & Halloumi Lasagne",
        Set(Tag.Slow, Tag.Vegetarian, Tag.Scales)
      ),
      MealStub("Aubergine curry", Set(Tag.Vegan, Tag.Scales, Tag.Slow)),
      MealStub(
        "Avocado & coconut soup",
        Set(Tag.Vegan, Tag.Soup, Tag.Scales, Tag.Freezes),
        GoogleDrive(
          "170P50UetqQPkrqqYvthtt3FBXsjCAYU_"
        )
      ),
      MealStub(
        "Baked potatoes",
        Set(Tag.Slow, Tag.Vegetarian, Tag.ColdWeather, Tag.LowEffort)
      ),
      MealStub(
        "Banana Curry",
        Set(Tag.Slow, Tag.Vegan, Tag.Scales, Tag.Freezes),
        Online(
          "https://www.theendlessmeal.com/banana-curry/"
        )
      ),
      MealStub(
        "Bean & Broccoli Pasta",
        Set(Tag.VeganIsh, Tag.Scales),
        Online(
          "https://www.themediterraneandish.com/mediterranean-broccoli-pasta-bean/"
        )
      ),
      MealStub("Truffle Burgers", Set(Tag.Vegetarian, Tag.Quick, Tag.Stodge)),
      MealStub("Butternut squash risotto", Set(Tag.Vegan, Tag.HotWeather)),
      MealStub(
        "Butternut & Blue Cheese Risotto",
        Set(
          Tag.Vegetarian,
          Tag.StephaniUnhealthy,
          Tag.LowEffort,
          Tag.Scales,
          Tag.Slow
        ),
        GoogleDrive("1e34QA2s94VJSNVQYxW_hRL3mKjNZtKlS")
      ),
      MealStub("Carbonara", Set(Tag.VegetarianIsh, Tag.Quick, Tag.Scales)),
      MealStub(
        "Carrot & Coriander Burgers",
        Set(Tag.Vegetarian, Tag.Slow, Tag.HighEffort)
      ),
      MealStub(
        "Cashew Curry",
        Set(Tag.Vegan, Tag.Scales),
        Online(
          "https://vegancocotte.com/cashew-curry/"
        )
      ),
      MealStub("Cheese & olive tarts", Set(Tag.Vegetarian)),
      MealStub(
        "Chipotle Mac 'n' Cheese",
        Set(Tag.Vegetarian, Tag.Scales, Tag.Stodge),
        Online(
          "https://drive.google.com/drive/folders/1eFm2usuBrtrDgqYtzRrFIZYe77VKVTu5"
        )
      ),
      MealStub(
        "Coconut & egg curry",
        Set(Tag.Vegetarian),
        Online("https://www.bbc.co.uk/food/recipes/whole_eggs_in_coconut_23624")
      ),
      MealStub(
        "Cod in tomato sauce",
        Set(Tag.Pescatarian, Tag.Quick),
        GoogleDrive("1jiyXj9imR452VqEE299DlRU1ao5K-gVi")
      ),
      MealStub("Egg & Mozzarella Toasts", Set(Tag.Vegetarian, Tag.Quick)),
      MealStub(
        "Fish Pie",
        Set(Tag.Pescatarian, Tag.Scales, Tag.ColdWeather, Tag.Slow)
      ),
      MealStub(
        "Fettucine with Dolcelatte and Spinach",
        Set(Tag.Vegetarian, Tag.Quick, Tag.HotWeather, Tag.LowEffort)
      ),
      MealStub("Fishcakes", Set(Tag.Pescatarian)),
      MealStub(
        "Full Scottish Breakfast",
        Set(Tag.VegetarianIsh, Tag.HighEffort, Tag.Quick, Tag.Stodge)
      ),
      MealStub(
        "Garlic Spaghetti",
        Set(Tag.Vegan, Tag.Scales, Tag.Quick, Tag.HotWeather, Tag.LowEffort)
      ),
      MealStub("Gnocchi & Tomato Bake", Set(Tag.Vegetarian, Tag.Scales)),
      MealStub(
        "Gnocchi & Broccoli Bake",
        Set(Tag.Vegetarian, Tag.Scales, Tag.LowEffort, Tag.Quick),
        Online("https://www.bbc.co.uk/food/recipes/gnocchi_pasta_bake_51351")
      ),
      MealStub(
        "Goan-Style King Prawn Balchão Curry",
        Set(
          Tag.Pescatarian,
          Tag.LowEffort,
          Tag.Quick,
          Tag.Spicy,
          Tag.Scales
        ),
        Online(
          "https://www.gousto.co.uk/cookbook/fish-recipes/goan-prawn-balchao-curry-with-basmati-rice"
        )
      ),
      MealStub(
        "Goats cheese, leek and spinach pasta bake",
        Set(Tag.Vegetarian, Tag.Scales, Tag.HotWeather),
        Online(
          "https://www.gousto.co.uk/cookbook/recipes/goats-cheese-leek-spinach-pasta-bake"
        )
      ),
      MealStub("Grilled aubergine", Set(Tag.Quick, Tag.Vegan, Tag.LowEffort)),
      MealStub(
        "Haddock Moqueca",
        Set(Tag.Pescatarian, Tag.Spicy),
        Online(
          "https://www.gousto.co.uk/cookbook/fish-recipes/brazilian-haddock-moqueca-zesty-lime-rice"
        )
      ),
      MealStub(
        "Haggis",
        Set(
          Tag.Vegetarian,
          Tag.Slow,
          Tag.HighEffort,
          Tag.Scales,
          Tag.Stodge,
          Tag.ColdWeather
        )
      ),
      MealStub(
        "Harira Soup",
        Set(Tag.Soup, Tag.Scales, Tag.Vegan, Tag.Freezes, Tag.ColdWeather),
        Online(
          "https://www.onegreenplanet.org/vegan-recipe/harira-soup-with-hummus-pitas/"
        )
      ),
      MealStub(
        "Honey Mustard Roast Salmon",
        Set(Tag.Stephani, Tag.LowEffort, Tag.Pescatarian, Tag.Scales),
        GoogleDrive("1vhTDuRPfPYHme_T9u2NnTakE1avfdoLk")
      ),
      MealStub(
        "Homemade Pizza",
        Set(Tag.HighEffort, Tag.Slow, Tag.Vegetarian, Tag.Stodge)
      ),
      MealStub(
        "Jamaican Squash & Coconut Stew",
        Set(Tag.Scales, Tag.Vegan, Tag.Spicy, Tag.Freezes, Tag.BetterNextDay),
        Online(
          "https://www.gousto.co.uk/cookbook/vegan-recipes/jamaican-squash-coconut-stew"
        )
      ),
      MealStub(
        "Kedgeree",
        Set(Tag.Pescatarian, Tag.Scales),
        Online("https://www.bbcgoodfood.com/recipes/smoked-haddock-kedgeree")
      ),
      MealStub(
        "Kidney Bean & Vegetable gratin",
        Set(Tag.VegetarianIsh, Tag.Scales)
      ),
      MealStub("Lentil & Vegetable Pilaf", Set(Tag.Vegan, Tag.Scales)),
      MealStub(
        "Macaroni",
        Set(Tag.Scales, Tag.Vegetarian, Tag.ColdWeather, Tag.Stodge),
        GoogleDrive("1aiAdl0JqdR6rU0Y-vJgsLre6IbJGhG8iCyD7HzP5Cvc")
      ),
      MealStub(
        "Vegetarian Meatballs",
        Set(Tag.Scales, Tag.Vegetarian)
      ),
      MealStub(
        "Mediterranean Fish Stew",
        Set(Tag.Pescatarian),
        Online(
          "https://www.gousto.co.uk/cookbook/fish-recipes/mediterranean-fish-stew-sunny-aioli"
        )
      ),
      MealStub(
        "Mediterranean Vegetable Gnocchi",
        Set(Tag.Vegetarian, Tag.Scales, Tag.Quick, Tag.HotWeather),
        Online(
          "https://www.gousto.co.uk/cookbook/vegetarian-recipes/mediterranean-veg-gnocchi-with-basil"
        )
      ),
      MealStub(
        "Mexican Polenta Pie",
        Set(Tag.Vegetarian, Tag.Slow, Tag.Scales),
        GoogleDrive(
          "1JC2oUMsAtRLRCyyy8bdqKo1BdwuD-1X0"
        )
      ),
      MealStub(
        "Mexican Tofu with Refried Beans",
        Set(Tag.Vegetarian, Tag.Spicy),
        GoogleDrive(
          "12RZq9w7CGKFZdxvGPUfMVhcjAXm1tdJI"
        )
      ),
      MealStub(
        "Mild Paneer Curry",
        Set(Tag.Vegetarian),
        Online("https://www.gousto.co.uk/cookbook/recipes/mild-paneer-curry")
      ),
      MealStub(
        "Mozzarella & spinach pancakes",
        Set(Tag.HighEffort, Tag.Vegetarian),
        GoogleDrive("1L7CueEwwXy6ObWx7A2AjIxO4FdsI-YB_")
      ),
      MealStub(
        "Mozzarella Burgers",
        Set(Tag.Vegetarian, Tag.LowEffort, Tag.Stodge)
      ),
      MealStub("Mushroom Lasagne", Set(Tag.Vegetarian, Tag.Slow, Tag.Stodge)),
      MealStub(
        "Mushroom Soup",
        Set(
          Tag.Vegan,
          Tag.Soup,
          Tag.Slow,
          Tag.Scales,
          Tag.Freezes,
          Tag.ColdWeather
        ),
        GoogleDrive("1mxBjlql91Kxo6lHZL-LnmHmhGlRYThCk")
      ),
      MealStub(
        "Mushroom & parsnip rösti pie",
        Set(Tag.Vegetarian, Tag.Slow, Tag.HighEffort),
        GoogleDrive("1-YvovgTwMtwqYvuEBAz3gb2shqaTRtY69i5zJjNsbd8")
      ),
      MealStub(
        "N Bean Chilli",
        Set(Tag.Vegan, Tag.Freezes, Tag.BetterNextDay, Tag.Slow, Tag.Scales)
      ),
      MealStub(
        "Nutty Sweet Potato & Spinach Pie",
        Set(Tag.Vegetarian, Tag.HighEffort, Tag.ColdWeather),
        GoogleDrive("1dM9T4Bu7Hj3fbLplX3NYKnCFqvuNrFC4tgWhhgWYTUE")
      ),
      MealStub(
        "Paneer Butter Masala",
        Set(Tag.Vegetarian, Tag.Quick, Tag.LowEffort, Tag.Spicy, Tag.Scales),
        Online(
          "https://www.gousto.co.uk/cookbook/vegetarian-recipes/paneer-butter-masala-with-coriander-naan"
        )
      ),
      MealStub(
        "Paneer Lababdar",
        Set(Tag.Vegetarian, Tag.Spicy, Tag.Scales),
        Online("https://www.indianhealthyrecipes.com/paneer-lababdar-recipe/")
      ),
      MealStub(
        "Pasta & Pesto",
        Set(
          Tag.VegetarianIsh,
          Tag.Quick,
          Tag.Scales,
          Tag.HotWeather,
          Tag.LowEffort
        )
      ),
      MealStub(
        "Penne with Walnut sauce",
        Set(Tag.Quick, Tag.Vegetarian, Tag.HotWeather, Tag.LowEffort),
        GoogleDrive("1-dIvRInPYyiUT1y6Y6cb7bZpnabubuIe")
      ),
      MealStub(
        "Pepper & goats cheese tart",
        Set(Tag.Vegetarian, Tag.Slow, Tag.Stodge, Tag.HotWeather)
      ),
      MealStub(
        "Pies",
        Set(Tag.LowEffort, Tag.Vegetarian, Tag.Stodge)
      ),
      MealStub(
        "Pomegranate Persian Halloumi",
        Set(
          Tag.LowEffort,
          Tag.Quick,
          Tag.HotWeather,
          Tag.Vegetarian,
          Tag.Scales,
          Tag.StephaniIsh
        ),
        Online(
          "https://drive.google.com/drive/folders/1sIZae-25brxIrc6KeWuOTf2uXE7lLvbQ"
        )
      ),
      MealStub(
        "Potato gratin",
        Set(
          Tag.Vegetarian,
          Tag.Slow,
          Tag.HighEffort,
          Tag.Stodge,
          Tag.Scales,
          Tag.ColdWeather
        )
      ),
      MealStub(
        "Ricotta spinach pitas",
        Set(Tag.Quick, Tag.Vegetarian, Tag.HotWeather, Tag.LowEffort),
        GoogleDrive("1mwrdX7b3hk3AArjnDNWjbyMavuJ6JyI5")
      ),
      MealStub(
        "Roast Aubergine & Basil Risotto",
        Set(Tag.Vegetarian),
        Online(
          "https://www.gousto.co.uk/cookbook/recipes/tomato-risotto-with-crispy-roast-aubergine"
        )
      ),
      MealStub(
        "Roast Carrot Soup",
        Set(Tag.Vegan, Tag.Scales, Tag.Slow, Tag.Freezes),
        Online(
          "https://cookieandkate.com/roasted-carrot-soup-recipe/#tasty-recipes-35404-jump-target"
        )
      ),
      MealStub("Roast Nut Omelette", Set(Tag.Quick, Tag.Vegetarian)),
      MealStub(
        "Roast veg & chickpeas tomato sauce",
        Set(Tag.Vegan, Tag.Freezes, Tag.Slow, Tag.Scales)
      ),
      MealStub(
        "Roast vegetable risotto",
        Set(Tag.Vegetarian, Tag.Slow, Tag.Scales)
      ),
      MealStub(
        "Roasted Vegetable Tart",
        Set(Tag.Vegetarian, Tag.HotWeather),
        GoogleDrive("1nIIXKu72Kohy6UDK_PwiMYYSp7I3Wcou")
      ),
      MealStub(
        "Satay Sweet Potato Curry",
        Set(Tag.Vegan, Tag.Scales, Tag.Spicy, Tag.Quick, Tag.BetterNextDay),
        Online(
          "https://www.bbc.co.uk/food/recipes/satay_sweet_potato_curry_59527"
        )
      ),
      MealStub(
        "Sausage & Bean Casserole",
        Set(Tag.VegetarianIsh, Tag.Scales, Tag.Slow, Tag.ColdWeather),
        Online("https://www.bbcgoodfood.com/recipes/sausage-bean-casserole")
      ),
      MealStub(
        "Sausages & Mash",
        Set(Tag.Vegetarian, Tag.Quick, Tag.Scales, Tag.LowEffort)
      ),
      MealStub(
        "Scotch Pancakes",
        Set(Tag.Pudding, Tag.Quick, Tag.LowEffort, Tag.Scales),
        Online(
          "https://www.reddit.com/r/Scotland/comments/uhaqax/what_do_you_mean_you_dont_know_how_to_make_drop/"
        )
      ),
      MealStub(
        "Seitan Tagine",
        Set(Tag.Vegan, Tag.Freezes, Tag.Slow, Tag.Scales),
        Online(
          "https://www.onegreenplanet.org/vegan-recipe/seitan-tagine-with-apricots-and-dates/"
        )
      ),
      MealStub(
        "Shahi Paneer",
        Set(Tag.Vegetarian, Tag.Spicy, Tag.Scales),
        Online(
          "https://www.indianhealthyrecipes.com/shahi-paneer-recipe/"
        )
      ),
      MealStub(
        "Smoky sausage casserole",
        Set(
          Tag.VegetarianIsh,
          Tag.ColdWeather,
          Tag.Slow,
          Tag.Scales,
          Tag.BetterNextDay
        ),
        Online("https://www.bbcgoodfood.com/recipes/smoky-sausage-casserole")
      ),
      MealStub(
        "Spiced Parsnip & Apple Soup",
        Set(Tag.Soup, Tag.Scales, Tag.VeganIsh, Tag.Spicy, Tag.Freezes),
        Online(
          "https://www.bbcgoodfood.com/recipes/curried-lentil-parsnip-apple-soup"
        )
      ),
      MealStub(
        "Broccoli & Cauliflower Bake",
        Set(
          Tag.Vegetarian,
          Tag.Quick,
          Tag.Scales,
          Tag.HotWeather,
          Tag.LowEffort
        ),
        GoogleDrive("1P-i6q_AgZXCtIBWoBIm3fst70VeJNFqK")
      ),
      MealStub(
        "Spicy Butternut & Coconut Soup",
        Set(Tag.Soup, Tag.Scales, Tag.Vegan, Tag.Freezes),
        Online("https://www.bbc.co.uk/food/recipes/pumpkin_soup_45815")
      ),
      MealStub(
        "Spicy Chilli Paneer Noodles",
        Set(Tag.Vegetarian, Tag.Scales, Tag.Quick, Tag.Spicy),
        Online(
          "https://www.gousto.co.uk/cookbook/vegetarian-recipes/10-min-spicy-chilli-paneer-noodles"
        )
      ),
      MealStub("Stir fry", Set(Tag.Quick, Tag.Vegetarian)),
      MealStub(
        "Supermarket Pizza",
        Set(Tag.LowEffort, Tag.Quick, Tag.Vegetarian, Tag.Stodge)
      ),
      MealStub(
        "Sweet Potato & Smoked Paprika Soup",
        Set(
          Tag.Vegetarian,
          Tag.ColdWeather,
          Tag.Scales,
          Tag.Spicy,
          Tag.Freezes
        ),
        Online(
          "https://www.italianfoodforever.com/2020/11/creamy-sweet-potato-soup/"
        )
      ),
      MealStub(
        "Sweet Potato, Peanut Butter and Coconut Curry",
        Set(Tag.Vegetarian, Tag.HotWeather)
      ),
      MealStub(
        "Sweetcorn & spinach polenta",
        Set(
          Tag.VegetarianIsh,
          Tag.Quick,
          Tag.Scales,
          Tag.HotWeather,
          Tag.LowEffort
        ),
        GoogleDrive("1sbycCsoWJSO8ETeg_AQ-2rHE4Ea6UYvi")
      ),
      MealStub(
        "Thai Green Curry",
        Set(Tag.VeganIsh, Tag.Slow, Tag.Scales, Tag.Spicy)
      ),
      MealStub(
        "Tofu Katsu Curry",
        Set(Tag.Vegan),
        Online(
          "https://drive.google.com/drive/u/0/folders/1nGGpfNdO6Qivu3n8E-3f0BwyLS-PpyX2"
        )
      ),
      MealStub(
        "Tofu & cashew nut stir fry",
        Set(Tag.Vegan, Tag.Quick, Tag.HotWeather),
        GoogleDrive("1nNWYsSiKtMubmN3VeXgGpIX8_RniCOlp")
      ),
      MealStub(
        "Tomato & Mozzarella Salad",
        Set(Tag.Vegetarian, Tag.Quick, Tag.HotWeather, Tag.LowEffort)
      ),
      MealStub(
        "Tomato sauce",
        Set(
          Tag.Freezes,
          Tag.Scales,
          Tag.Slow,
          Tag.BetterNextDay,
          Tag.LowEffort,
          Tag.VeganIsh
        )
      ),
      MealStub("Tuna & rice peppers", Set(Tag.Pescatarian, Tag.Slow)),
      MealStub(
        "Tuna Fish Pie",
        Set(Tag.Pescatarian, Tag.Scales),
        Online(
          "https://www.taste.com.au/recipes/tuna-pie-potato-topping/53c34dd0-edf6-4db9-929f-ac2fd4b65667"
        )
      ),
      MealStub(
        "Tuna in tomato sauce",
        Set(Tag.Pescatarian),
        GoogleDrive("1nDEnSpUpKG2a3tIL4VklxJrzAVO5GFkX")
      ),
      MealStub("Tuna Pasta", Set(Tag.Pescatarian, Tag.Quick, Tag.LowEffort)),
      MealStub(
        "Tuna steaks with salsa verde",
        Set(Tag.Pescatarian, Tag.Stephani),
        Online("https://www.bbc.co.uk/food/recipes/tunasteakswithsalsav_74789")
      ),
      MealStub(
        "Vegan Brownies (Alt Recipe)",
        Set(Tag.Vegan, Tag.Pudding, Tag.Baking),
        Online(
          "https://www.cheapskatecook.com/eggless-brownies-no-weird-ingredients/"
        )
      ),
      MealStub(
        "Vegetable Hotpot with dumplings",
        Set(Tag.Vegetarian, Tag.Slow, Tag.HighEffort, Tag.ColdWeather),
        GoogleDrive("1jsxu4biuRi3ewRQ4g5HDGEpoKw-aMf0e")
      ),
      MealStub(
        "Vegetable Pad Thai",
        Set(
          Tag.LowEffort,
          Tag.Quick,
          Tag.Vegan
        ),
        Online(
          "https://drive.google.com/drive/folders/1Uz9NU3ffJVFppHr0ZOdYoJ_h-TjVmIkB"
        )
      ),
      MealStub(
        "Vegetable Sambar",
        Set(Tag.Vegetarian, Tag.Spicy, Tag.Scales),
        Online(
          "https://www.gousto.co.uk/cookbook/vegan-recipes/fragrant-vegetable-sambar-with-coconut-yoghurt"
        )
      ),
      MealStub(
        "Veggie Goulash",
        Set(
          Tag.Vegetarian,
          Tag.Slow,
          Tag.Spicy,
          Tag.Scales,
          Tag.BetterNextDay,
          Tag.ColdWeather
        ),
        Online(
          "https://www.gousto.co.uk/cookbook/recipes/veggie-goulash-potato-cakes-sour-cream"
        )
      ),
      MealStub(
        "Venetian Style Pasta",
        Set(Tag.Quick, Tag.Vegan, Tag.Scales, Tag.HotWeather, Tag.LowEffort),
        Online("https://www.bbcgoodfood.com/recipes/12135/venetianstyle-pasta")
      )
    )
}
