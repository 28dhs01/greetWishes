package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        birthdayButton.setOnClickListener{
            val Name = name.editableText.toString()
            if(Name.isNotEmpty()) {
                val intent = Intent(this, birthdayGreeting::class.java)
                intent.putExtra(birthdayGreeting.NAME_EXTRA, Name)
                startActivity(intent)
            }
        }

        anniversaryButton.setOnClickListener{
            val Name = name.editableText.toString()
            if(Name.isNotEmpty()) {
                val intent = Intent(this, marriageAnniversary::class.java)
                intent.putExtra(marriageAnniversary.NAME_EXTRA, Name)
                startActivity(intent)
            }
        }

    }
}