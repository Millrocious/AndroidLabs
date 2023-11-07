package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val backButton = findViewById<Button>(R.id.back_button)
        val editText = findViewById<EditText>(R.id.edit_text2)

        val initialData = intent.getStringExtra("data")
        editText.setText(initialData)

        backButton.setOnClickListener {
            val modifiedData = editText.text.toString()
            val resultIntent = Intent()
            resultIntent.putExtra("modifiedData", modifiedData)
            setResult(RESULT_OK, resultIntent)
            finish()
        }
    }
}