package com.example.recyclerview_baseclass_11.activities

import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerview_baseclass_11.activities.model.Member
import com.example.recyclerview_baseclass_11.activities.network.BaseServer

open class BaseActivity: AppCompatActivity() {

    protected fun getServer(): String {
        return if (BaseServer.isTester) {
            BaseServer.SERVER_DEVELOPMENT
        } else {
            BaseServer.SERVER_DEPLOYMENT
        }
    }
    protected fun isEmpty(s: String?): Boolean {
        return s == null || s.trim() {it <= ' '}.isEmpty()
    }
    protected fun prepareMemberList(): ArrayList<Member> {
        val members = ArrayList<Member>()

        for (i in 0..30) {
            members.add(Member("Android","$i"))
        }
        return members
    }
}