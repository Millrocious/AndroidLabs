package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextButton = findViewById<Button>(R.id.next_button)
        val editText = findViewById<EditText>(R.id.editText)

        nextButton.setOnClickListener {
            val data = editText.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("data", data)
            startActivityForResult(intent, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        val editText = findViewById<EditText>(R.id.editText)

        if (requestCode == 1 && resultCode == RESULT_OK) {
            val modifiedData = data?.getStringExtra("modifiedData")
            editText.setText(modifiedData)
        }
    }
}