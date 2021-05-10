package com.example.davaleba3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.buttons_placement_in_linearlayout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.buttons_placement_in_linearlayout)

        btnNext.setOnClickListener {
            val intent = Intent(this,ButtonsLayoutActivity::class.java)
            startActivity(intent)

        }

    }

}