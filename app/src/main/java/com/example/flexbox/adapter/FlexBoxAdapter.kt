package com.example.flexbox.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.flexbox.R
import kotlinx.android.synthetic.main.item.view.*


class FlexBoxAdapter(private val mItems: ArrayList<String>) :
    RecyclerView.Adapter<FlexBoxAdapter.DivItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DivItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item, parent, false)
        return DivItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: DivItemViewHolder, position: Int) =
        holder.onBind(position)

    override fun getItemCount(): Int = mItems.size

    inner class DivItemViewHolder constructor(itemView: View) : RecyclerView.ViewHolder
        (itemView) {
        fun onBind(position: Int) = with(itemView) {
            textView.text = mItems[position]
        }
    }
}
