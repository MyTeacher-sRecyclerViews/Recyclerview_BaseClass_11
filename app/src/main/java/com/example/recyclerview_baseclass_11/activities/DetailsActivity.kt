package com.example.recyclerview_baseclass_11.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.MemoryFile
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_baseclass_11.R
import com.example.recyclerview_baseclass_11.activities.adapter.CustomDetailsAdapter
import com.example.recyclerview_baseclass_11.activities.model.Member

class DetailsActivity : BaseActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        initViews()
        val members = prepareMemberList()
        refreshAdapter(members)
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerview_detail)
        recyclerView.layoutManager = GridLayoutManager(this, 1)
    }

    private fun refreshAdapter(members: ArrayList<Member>) {
        val adapter = CustomDetailsAdapter(members)
        recyclerView.adapter = adapter
    }
}