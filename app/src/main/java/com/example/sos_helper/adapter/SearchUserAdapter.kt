package com.example.sos_helper.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.helper.widget.Carousel.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.sos_helper.R
import com.example.sos_helper.database.model.LoginClass
import com.example.sos_helper.model.AddFriends

class SearchUserAdapter(private val listAddFriends: List<LoginClass>) :
    RecyclerView.Adapter<SearchUserAdapter.ItemViewHolder>() {

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtFriendName: AppCompatTextView = itemView.findViewById(R.id.txtFriendName)
        val txtFriendEmail: AppCompatTextView = itemView.findViewById(R.id.txtFriendEmail)
        val vAdd: View = itemView.findViewById(R.id.vAdd)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_search_user, parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listAddFriends.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.txtFriendName.text = listAddFriends[position].name
        holder.txtFriendEmail.text = listAddFriends[position].email
    }
}