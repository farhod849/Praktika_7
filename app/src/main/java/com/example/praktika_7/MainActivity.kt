package com.example.praktika_7

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var counter: Int = 1;
        var text:TextView = findViewById(R.id.Hello)
        var button:Button = findViewById(R.id.button)
        var btncount:Button = findViewById(R.id.buttoncount)
        var textcount:TextView = findViewById(R.id.textcount)
        button.setOnClickListener{
            text.text = "Здарова, брат!"
        }
        btncount.setOnClickListener{
            textcount.text = "Я нажал кнопку ${counter++} раз"
        }
    }
}