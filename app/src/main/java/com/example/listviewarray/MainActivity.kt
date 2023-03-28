package com.example.listviewarray

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListAdapter
import android.widget.ListView
import com.activeandroid.query.Select

class MainActivity : AppCompatActivity() {
    private lateinit var myAdapter: ListAdapter
    private lateinit var button: Button
    private lateinit var list: ListView
    private val data = arrayListOf("one", "two", "three")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list = findViewById(R.id.list_item)
        button = findViewById(R.id.button)

        myAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            data
        )

        list.adapter = myAdapter
    }

    private fun doButton() {
        val sepulka = Sepulka()
        sepulka.foo = "hello ${System.currentTimeMillis()}"
        sepulka.bar = "world ${System.currentTimeMillis()}"

        sepulka.save()

        val ses = Select().from(Sepulka::class.java).execute<Sepulka>()
        Log.d("happySDK", "$ses")
    }

    companion object {
    }

    fun onButtonClick(view: View) {
        doButton()
    }
}