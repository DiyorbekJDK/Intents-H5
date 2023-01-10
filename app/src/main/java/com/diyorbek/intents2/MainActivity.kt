package com.diyorbek.intents2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val veve: MaterialButton = findViewById(R.id.btnEmail)
        veve.setOnClickListener {
            val intent = Intent(this,Second::class.java)
            startActivity(intent)
            finish()
        }

    }
}