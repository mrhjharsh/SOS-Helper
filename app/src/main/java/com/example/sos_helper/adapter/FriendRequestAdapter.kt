package com.example.sos_helper.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.helper.widget.Carousel.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.sos_helper.R
import com.example.sos_helper.model.AddFriends

class FriendRequestAdapter(private val listAddFriends: List<AddFriends>) :
    RecyclerView.Adapter<FriendRequestAdapter.ItemViewHolder>() {

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtFriendName: TextView = itemView.findViewById(R.id.txtFriendName)
        val vAdd: TextView = itemView.findViewById(R.id.vAdd)
        val vDelete: TextView = itemView.findViewById(R.id.vDelete)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_friend_request, parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listAddFriends.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.txtFriendName.text = listAddFriends[position].name
    }
}