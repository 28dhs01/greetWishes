package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birthdaygreet.birthdayGreeting
import kotlinx.android.synthetic.main.activity_birthday_greeting.*
import kotlinx.android.synthetic.main.activity_marriage_anniversary.*

class marriageAnniversary : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marriage_anniversary)
        val Name = intent.getStringExtra(com.example.birthdaygreet.birthdayGreeting.NAME_EXTRA)
        anniversaryGreeting.text="Happy Wedding Anniversary \n $Name !"
    }
}