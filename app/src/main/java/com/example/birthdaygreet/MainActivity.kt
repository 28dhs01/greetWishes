package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        birthdayButton.setOnClickListener{
            val name = nameInput.editableText.toString()

            //to make sure user must enters a name
            if(name.isNotEmpty()) {

                // move from main activity to birthday activity
                val intent = Intent(this, BirthdayGreeting::class.java)

                // name needs to be passed from main activity to birthday activity
                // NAME_EXTRA needs to be same on both activities
                intent.putExtra(BirthdayGreeting.NAME_EXTRA, name)

                // to launch birthday activity
                startActivity(intent)
            }
        }

        anniversaryButton.setOnClickListener{
            val coupleName = nameInput.editableText.toString()
            if(coupleName.isNotEmpty()) {

                // move from main activity to anniversary activity
                val intent = Intent(this, MarriageAnniversary::class.java)

                // coupleName needs to be passed from main activity to anniversary activity
                // COUPLE_NAME_EXTRA needs to be same on both activities
                intent.putExtra(MarriageAnniversary.COUPLE_NAME_EXTRA, coupleName)

                // to launch anniversary activity
                startActivity(intent)
            }
        }

    }
}