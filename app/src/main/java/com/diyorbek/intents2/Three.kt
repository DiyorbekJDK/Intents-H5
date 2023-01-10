package com.diyorbek.intents2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.diyorbek.intents2.model.User
import org.w3c.dom.Text

class Three : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        val text: TextView = findViewById(R.id.textView)
        val user = intent.getSerializableExtra("user") as User
        text.text = "${user.email}\n ${user.password}"

    }
}