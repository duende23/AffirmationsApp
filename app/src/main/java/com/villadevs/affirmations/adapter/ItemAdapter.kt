package com.villadevs.affirmations.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.villadevs.affirmations.R
import com.villadevs.affirmations.model.Affirmation

class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: ItemAdapter.ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.tvItemTitle.text = context.resources.getString(item.stringResourceId)
        holder.ivItemImage.setImageResource(item.imageResourceId)
    }


    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val tvItemTitle: TextView = view.findViewById(R.id.tvAffirmation)
        val ivItemImage: ImageView = view.findViewById(R.id.ivImage)
    }


}