package com.example.android_vl_mvvm_shopping_list.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.android_vl_mvvm_shopping_list.R
import com.example.android_vl_mvvm_shopping_list.databinding.FragmentFruitDetailBinding
import com.example.android_vl_mvvm_shopping_list.viewModel.SharedViewModel

class FoodDetailFragment : Fragment() {

    private lateinit var vb: FragmentFruitDetailBinding
    private val viewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        vb = FragmentFruitDetailBinding.inflate(layoutInflater)
        return vb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.selectedFoodItem.observe(viewLifecycleOwner) {
            vb.ivFood.setImageResource(it.imageId)
            vb.tvFoodTitle.text = it.name
            vb.tvFoodCategory.text = it.category
        }
    }
}