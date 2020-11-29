package com.sdop.factoryexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sdop.factoryexample.model.Bread
import com.sdop.factoryexample.model.BreadFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val breadRecyclerView: RecyclerView = findViewById(R.id.breadRecyclerView)
        breadRecyclerView.layoutManager = LinearLayoutManager(this)
        breadRecyclerView.adapter = BreadRecyclerViewAdapter(breadList)
    }

    private val breadFactory = BreadFactory()

    private val breadList: List<Bread>
        get() {
            val breadList = mutableListOf<Bread>()

            getBread("BRI")?.also { breadList.add(it) }
            getBread("BAG")?.also { breadList.add(it) }
            getBread("ROL")?.also { breadList.add(it) }

            return breadList
        }

    private fun getBread(breadType: String): Bread? = breadFactory.getBread(breadType)

}