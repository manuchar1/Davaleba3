package com.example.davaleba3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.buttons_placement_in_constraintlayout.*

class ButtonsLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.buttons_placement_in_constraintlayout)

        buttonNext.setOnClickListener {
            val intent = Intent(this,SquareButtonsActivity::class.java)
            startActivity(intent)
        }
    }
}