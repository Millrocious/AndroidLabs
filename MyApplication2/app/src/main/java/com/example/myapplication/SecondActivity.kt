package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnDec = findViewById<Button>(R.id.btn_dec)

        val btnNaviPrev = findViewById<Button>(R.id.button_navi_sec_prev)
        val btnNaviNext = findViewById<Button>(R.id.button_navi_sec_next)


        btnDec.setOnClickListener {
            Counter.count--
        }

        btnNaviPrev.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnNaviNext.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }
    }
}