package com.udea.ejemploactivities

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT).show()
        Log.d(TAG, "onCreate");


        this.findViewById<TextView>(R.id.button).setOnClickListener {
            val intent: Intent = Intent(this, MainActivity2::class.java)
            var nombre =this.findViewById<TextView>(R.id.editTextName).text.toString()
            intent.putExtra("nombre",nombre)
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"onStart",Toast.LENGTH_SHORT).show()
        Log.d(TAG, "onStart")

    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"onRestart",Toast.LENGTH_SHORT).show()
        Log.d(TAG, "onRestart")

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume",Toast.LENGTH_SHORT).show()
        Log.d(TAG, "onResume")

    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"onStop",Toast.LENGTH_SHORT).show()
        Log.d(TAG, "onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT).show()
        Log.d(TAG, "onDestroy")

    }
    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause",Toast.LENGTH_SHORT).show()
        Log.d(TAG, "onPause")

    }
}


