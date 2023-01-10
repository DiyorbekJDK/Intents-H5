package com.diyorbek.intents2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.diyorbek.intents2.model.User
import com.google.android.material.button.MaterialButton

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val firtEDit: EditText = findViewById(R.id.firstEdit)
        val secondEDit: EditText = findViewById(R.id.secondEdit)
        val btn: MaterialButton =findViewById(R.id.log)
        btn.setOnClickListener {
            val intent = Intent(this,Three::class.java)
            val bundle = Bundle()
            val user = User(firtEDit.text.toString().trim(), secondEDit.text.toString().trim())
            bundle.putSerializable("user",user)
            intent.putExtras(bundle)
        }

    }
}