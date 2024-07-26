package com.example.android_vl_mvvm_shopping_list.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.android_vl_mvvm_shopping_list.databinding.FragmentFoodListBinding
import com.example.android_vl_mvvm_shopping_list.model.Food
import com.example.android_vl_mvvm_shopping_list.viewModel.SharedViewModel

class FoodListFragment : Fragment() {

    private lateinit var vb: FragmentFoodListBinding
    private val viewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        vb = FragmentFoodListBinding.inflate(layoutInflater)
        return vb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.foodList.observe(viewLifecycleOwner) { updatedFoodList: List<Food> ->
            vb.rvFood.adapter = AdapterFoodList(updatedFoodList, viewModel)
        }

        vb.btFruit.setOnClickListener {
            viewModel.showOnlyFruits()
        }

        vb.btAll.setOnClickListener {
            viewModel.showAll()
        }

        vb.btVeg.setOnClickListener {
            viewModel.showVeg()
        }
    }
}