package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        

        val btnInc = findViewById<Button>(R.id.btn_inc)
        val counterTextView = findViewById<TextView>(R.id.counter)

        val btnNavi = findViewById<Button>(R.id.button_navi)


        btnInc.setOnClickListener {
            Counter.count++

        }

        btnNavi.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

//        btnDec.setOnClickListener {
//            counter--
//            counterTextView.text = counter.toString()
//        }
//
//        btnReset.setOnClickListener {
//            counter = 0
//            counterTextView.text = counter.toString()
//        }
    }
}