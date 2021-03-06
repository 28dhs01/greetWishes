package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeting.*
import java.util.jar.Attributes

class BirthdayGreeting : AppCompatActivity() {

    // companion objects are same like that of static variables
    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        // need to receive name from main activity
        val name = intent.getStringExtra(NAME_EXTRA)

        // display birthday greet
        birthdayGreeting.text="Happy Birthday \n $name !"
    }
}