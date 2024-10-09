package com.example.helloworldapp

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import android.widget.Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toggleButton = findViewById<Button>(R.id.toggleThemeButton)
        toggleButton.setOnClickListener {
            val currentNightMode = resources.configuration.uiMode and
                    Configuration.UI_MODE_NIGHT_MASK
            when (currentNightMode) {
                Configuration.UI_MODE_NIGHT_NO ->
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                Configuration.UI_MODE_NIGHT_YES ->
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }
    }
}