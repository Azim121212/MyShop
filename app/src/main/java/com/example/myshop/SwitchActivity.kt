package com.example.myshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class SwitchActivity : AppCompatActivity() {
    private var timer: Timer? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch)
        timer = Timer()
        timer!!.schedule(object : TimerTask() {
            override fun run() {
                val intent = Intent(this@SwitchActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }, 2000)
    }
}