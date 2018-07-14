package com.example.jonnyb.smack.Controller

import android.app.Application
import com.example.jonnyb.smack.Utilities.SharedPrefs

class App: Application() {

    companion object {
        lateinit var prefs: SharedPrefs
    }

    override fun onCreate() {
        super.onCreate()
        prefs = SharedPrefs(applicationContext)
    }
}