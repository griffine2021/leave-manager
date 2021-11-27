package com.example.leavemanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_forgot_email.*

class ForgotEmailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_email)

        btn_complete.setOnClickListener {
            val mbele=Intent(this,GetStartedActivity::class.java)
            startActivity(mbele)
        }
    }
}