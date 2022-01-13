package com.example.recyclerview_baseclass_11.activities.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_baseclass_11.R
import com.example.recyclerview_baseclass_11.activities.MainActivity
import com.example.recyclerview_baseclass_11.activities.model.Member

class CustomMainAdapter(val activity: MainActivity, val members: ArrayList<Member>) : BaseAdapter() {
    override fun getItemCount(): Int {
        return members.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_main_layout, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val member = members[position]

        if (holder is CustomViewHolder) {
            holder.firstName.text = member.firstName
            holder.lastName.text = member.lastName
            holder.itemView.setOnClickListener {
                activity.openDetailPage(member)
            }
        }
    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val firstName: TextView = itemView.findViewById(R.id.firstName)
        val lastName: TextView = itemView.findViewById(R.id.lastName)
    }
}