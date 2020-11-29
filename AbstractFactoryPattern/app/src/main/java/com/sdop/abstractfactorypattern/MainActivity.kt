package com.sdop.abstractfactorypattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sdop.abstractfactorypattern.model.FactoryGenerator
import com.sdop.abstractfactorypattern.model.FactoryType
import com.sdop.abstractfactorypattern.model.bread.Bread
import com.sdop.abstractfactorypattern.model.bread.BreadType

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val breadRecyclerView: RecyclerView = findViewById(R.id.breadRecyclerView)
        breadRecyclerView.layoutManager = LinearLayoutManager(this)
        breadRecyclerView.adapter = BreadRecyclerViewAdapter(breadList)
    }

    private val breadFactory = FactoryGenerator.getFactory(FactoryType.Bread)

    private val breadList: List<Bread>
        get() {
            val breadList = mutableListOf<Bread>()

            breadFactory.getBread(BreadType.Brioche).also { breadList.add(it) }
            breadFactory.getBread(BreadType.Baguette).also { breadList.add(it) }
            breadFactory.getBread(BreadType.Roll).also { breadList.add(it) }

            return breadList
        }
}
