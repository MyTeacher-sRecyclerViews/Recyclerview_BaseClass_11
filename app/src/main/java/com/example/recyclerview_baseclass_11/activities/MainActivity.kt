package com.example.recyclerview_baseclass_11.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_baseclass_11.R
import com.example.recyclerview_baseclass_11.activities.adapter.CustomMainAdapter
import com.example.recyclerview_baseclass_11.activities.model.Member

class MainActivity : BaseActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        val members = prepareMemberList()
        refreshAdapter(members)

    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = GridLayoutManager(this,1)
    }
    private fun refreshAdapter(members: ArrayList<Member>) {
        val adapter = CustomMainAdapter(this,members)
        recyclerView.adapter = adapter
    }

    fun openDetailPage(member: Member) {
        val intent = Intent(this,DetailsActivity::class.java)
        startActivity(intent)
    }
}