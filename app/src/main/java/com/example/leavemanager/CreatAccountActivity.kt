package com.example.leavemanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_createaccountactivity.*
import kotlinx.android.synthetic.main.activity_get_started.*

class CreatAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_createaccountactivity)

        btn_jenga.setOnClickListener {
            val jenga=Intent(this,LOGINActivity::class.java)
            startActivity(jenga)

        }
    }
}