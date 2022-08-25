package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usern = findViewById(R.id.user) as EditText
        val passw = findViewById(R.id.password) as EditText
        val totn = findViewById(R.id.result) as TextView
        val b1 = findViewById(R.id.login) as Button

        var users = mapOf<String, String>("tom" to "hello", "john" to "hey")
        b1.setOnClickListener {
            val username = usern.text.toString()
            Log.d("tom", "onCreate: ${username}")

            val password = passw.text.toString()
            Log.d("tom", "onCreate: " + password)
            if (users.containsKey(username) && users.containsValue(password)) {
                Log.d("tom", "onCreate: inside ")
                totn.setText("loged in")
            } else {
                totn.setText("worng user")
            }

        }
    }
}

