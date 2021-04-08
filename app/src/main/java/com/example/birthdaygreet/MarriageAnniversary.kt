package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_marriage_anniversary.*
import java.util.jar.Attributes

class MarriageAnniversary : AppCompatActivity() {

    // companion objects are same like that of static variables
    companion object{
        const val COUPLE_NAME_EXTRA = "couple_name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marriage_anniversary)

        // need to receive name from main activity
        val name = intent.getStringExtra(COUPLE_NAME_EXTRA)

        // display anniversary greet
        anniversaryGreeting.text="Happy Wedding Anniversary \n $name !"
    }
}