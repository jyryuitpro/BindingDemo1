package com.example.bindingdemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.bindingdemo1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//        val button = findViewById<Button>(R.id.submit_button)
//        button.setOnClickListener {
//            displayGreeting()
//        }
        binding.submitButton.setOnClickListener {
            displayGreeting()
        }
    }

    private fun displayGreeting() {
//        val messageView = findViewById<TextView>(R.id.greeting_text_view)
//        val nameText = findViewById<EditText>(R.id.name_edit_text)

//        val message = "Hello! "+ nameText.text
//        messageView.text = message
//        binding.greetingTextView.text = "Hello! "+ binding.nameEditText.text
        binding.apply {
            greetingTextView.text = "Hello! "+ nameEditText.text
        }
    }
}