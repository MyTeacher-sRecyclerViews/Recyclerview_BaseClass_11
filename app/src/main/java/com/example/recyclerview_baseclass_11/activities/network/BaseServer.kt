package com.example.recyclerview_baseclass_11.activities.network

interface BaseServer {
    companion object {
        const val isTester = true
        const val SERVER_DEVELOPMENT = "https://dev.mysite.com"
        const val SERVER_DEPLOYMENT = "https://www.mysite.com"
    }
}