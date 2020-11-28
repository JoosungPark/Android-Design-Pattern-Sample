package com.sdop.factoryexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatTextView
import com.sdop.factoryexample.model.BradFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: AppCompatTextView = findViewById(R.id.textView)

        val breadFactory = BradFactory()
        val bread = breadFactory.getBread("BAG")

        bread?.also {
            textView.text = it.name
        }
    }
}