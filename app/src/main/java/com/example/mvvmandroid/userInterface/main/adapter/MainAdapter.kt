package com.example.mvvmandroid.userInterface.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mvvmandroid.R
import com.example.mvvmandroid.data.model.User

class MainAdapter(
    private val users: ArrayList<User>
) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: User) {

            val userName = itemView.findViewById<TextView>(R.id.textViewUserName)
            val userEmail = itemView.findViewById<TextView>(R.id.textViewUserEmail)
            val imageView = itemView.findViewById<ImageView>(R.id.imageViewAvatar)

            userName.text = user.name
            userEmail.text = user.email
            Glide.with(imageView.context)
                .load(user.avatar)
                .into(imageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_layout, parent,
                false
            )
        )

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(users[position])

    fun addData(list: List<User>) {
        users.addAll(list)
    }

}