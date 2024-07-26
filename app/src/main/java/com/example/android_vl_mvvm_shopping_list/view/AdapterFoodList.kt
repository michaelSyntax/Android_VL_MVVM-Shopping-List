package com.example.android_vl_mvvm_shopping_list.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.android_vl_mvvm_shopping_list.R
import com.example.android_vl_mvvm_shopping_list.databinding.ListItemFoodBinding
import com.example.android_vl_mvvm_shopping_list.model.Food
import com.example.android_vl_mvvm_shopping_list.viewModel.SharedViewModel

class AdapterFoodList(
    val foodList: List<Food>,
    val viewModel: SharedViewModel
): RecyclerView.Adapter<AdapterFoodList.FoodItemViewHolder>() {
    inner class FoodItemViewHolder(val vb: ListItemFoodBinding): ViewHolder(vb.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodItemViewHolder {
        val vb = ListItemFoodBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FoodItemViewHolder(vb)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: FoodItemViewHolder, position: Int) {
        val foodItem = foodList[position]

        holder.vb.imageView.setImageResource(foodItem.imageId)
        holder.vb.titleTextView.text = foodItem.name
        holder.vb.subtitleTextView.text = foodItem.category

        holder.vb.root.setOnClickListener {
            //viewModel.selectFoodItem(foodItem)
            holder.itemView.findNavController().navigate(R.id.foodDetailFragment)
        }
    }
}