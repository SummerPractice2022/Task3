package com.voxeldev.summerpractice2022.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.voxeldev.summerpractice2022.R
import com.voxeldev.summerpractice2022.data.models.Snack
import com.voxeldev.summerpractice2022.databinding.ItemSnacksListBinding

class SnacksAdapter(
    private val snacks: List<Snack>,
    private val navController: NavController
) : RecyclerView.Adapter<SnacksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SnacksViewHolder {
        val binding = ItemSnacksListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

        return SnacksViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SnacksViewHolder, position: Int) {
        holder.nameTextView.text = snacks[position].name
        holder.priceTextView.text = snacks[position].price

        holder.root.setOnClickListener {
            navController.navigate(
                R.id.action_navigation_list_to_navigation_details,
                bundleOf("position" to position)
            )
        }
    }

    override fun getItemCount(): Int = snacks.size
}