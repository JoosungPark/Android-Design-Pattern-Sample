package com.sdop.abstractfactorypattern

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.sdop.abstractfactorypattern.model.bread.Bread

class BreadRecyclerViewAdapter(var breads: List<Bread>) :
    RecyclerView.Adapter<BreadRecyclerViewAdapter.BreadViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BreadViewHolder {
        return LayoutInflater.from(parent.context)
            .inflate(R.layout.item_bread, parent, false)
            .run(::BreadViewHolder)
    }

    override fun getItemCount(): Int = breads.count()

    override fun onBindViewHolder(holder: BreadViewHolder, position: Int) {
        holder.bindData(breads[position])
    }

    inner class BreadViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val name: AppCompatTextView = itemView.findViewById(R.id.name)

        fun bindData(bread: Bread) {
            name.text = bread.name
        }
    }
}