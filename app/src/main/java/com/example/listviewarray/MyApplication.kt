package com.example.listviewarray

import android.app.Application
import com.activeandroid.ActiveAndroid

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        ActiveAndroid.initialize(this)
    }
}