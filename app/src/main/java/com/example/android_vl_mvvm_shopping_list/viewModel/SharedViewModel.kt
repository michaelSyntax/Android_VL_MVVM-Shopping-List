package com.example.android_vl_mvvm_shopping_list.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android_vl_mvvm_shopping_list.model.Food
import com.example.android_vl_mvvm_shopping_list.model.Respository

class SharedViewModel: ViewModel() {

    private val repo = Respository()

    private val _foodList = MutableLiveData<List<Food>>(repo.groceries)
    val foodList: LiveData<List<Food>>
        get() = _foodList

    private val _selectedFoodItem = MutableLiveData<Food>()
    val selectedFoodItem: LiveData<Food>
        get() = _selectedFoodItem

    fun showOnlyFruits() {
        _foodList.value = repo.groceries.filter { it.category == "fruit" }
    }

    fun showAll() {
        _foodList.value = repo.groceries
    }

    fun showVeg() {
        _foodList.value = repo.groceries.filter { it.category == "vegetable" }
    }

    fun selectFoodItem(foodItem: Food) {
        _selectedFoodItem.value = foodItem
    }
}