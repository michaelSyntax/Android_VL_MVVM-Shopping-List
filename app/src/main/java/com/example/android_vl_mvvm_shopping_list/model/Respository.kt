package com.example.android_vl_mvvm_shopping_list.model

import com.example.android_vl_mvvm_shopping_list.R

class Respository {
    val groceries: List<Food> = listOf(
        Food("fruit", "apples", R.drawable.apples),
        Food("fruit", "avocado", R.drawable.avocado),
        Food("fruit", "banana", R.drawable.banana),
        Food("fruit", "oranges", R.drawable.blood_orange),
        Food("fruit", "tomatoes", R.drawable.tomatoes),
        Food("vegetable", "brocoli", R.drawable.brocoli),
        Food("vegetable", "cabbage", R.drawable.cabbage),
        Food("vegetable", "grapes", R.drawable.grapes),
        Food("vegetable", "limes", R.drawable.limes),
        Food("vegetable", "mushroom", R.drawable.mushroom),
        Food("vegetable", "onion", R.drawable.onions),
        Food("vegetable", "peppers", R.drawable.peppers),
        Food("vegetable", "strawberry", R.drawable.strawberry)
    )
}