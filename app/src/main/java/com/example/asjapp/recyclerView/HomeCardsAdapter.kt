package com.example.asjapp.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.asjapp.R
import com.example.asjapp.TabbedFragment
import com.example.asjapp.TabbedFragmentDirections

class HomeCardsAdapter(
    private val name: Array<String>,
    private val detail: Array<String>,
    private val fullDetail: Array<String>
) :
    RecyclerView.Adapter<HomeCardsAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val details: TextView = view.findViewById(R.id.details)
        val nameORG: TextView = view.findViewById(R.id.nameOrg)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.home_items_layout, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val currentName = name[position]
        val currentDetails = detail[position]
        holder.nameORG.text = currentName
        holder.details.text = currentDetails
        val currentFullDetails = fullDetail[position]
        holder.itemView.setOnClickListener {
            val action = TabbedFragmentDirections.actionTabbedFragmentToNgoProfile(currentName,currentDetails,currentFullDetails)
            Navigation.createNavigateOnClickListener(action).onClick(holder.itemView)
        }
    }

    override fun getItemCount(): Int {
        return detail.size
    }
}
