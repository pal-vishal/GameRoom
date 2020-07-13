package com.example.gameroom.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gameroom.R
import com.example.gameroom.fragment.Register

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val transanction = supportFragmentManager.beginTransaction()
        transanction.replace(R.id.container, Register())
        transanction.commit()
    }
}