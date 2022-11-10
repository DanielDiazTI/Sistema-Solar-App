package com.example.sistemasolar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sistemasolar.Adapters.MenuAdapter
import com.example.sistemasolar.Adapters.SetData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        recyclerView.adapter = MenuAdapter(SetData.setMenus())
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}