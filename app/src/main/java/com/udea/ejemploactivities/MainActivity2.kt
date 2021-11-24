package com.udea.ejemploactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var nombreMain =intent.getStringExtra("nombre")
        this.findViewById<TextView>(R.id.textView2).setText(nombreMain.toString())

    }
}