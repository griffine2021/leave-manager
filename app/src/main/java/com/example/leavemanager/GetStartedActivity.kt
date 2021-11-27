package com.example.leavemanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_get_started.*

class GetStartedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)

        btn_login.setOnClickListener {
            val ingia=Intent(this,LOGINActivity::class.java)
            startActivity(ingia)
        }
        btn_previous.setOnClickListener {
            val nyuma=Intent(this,MainActivity::class.java)
            startActivity(nyuma)
        }
        btn_reset.setOnClickListener {
            val tengeneza=Intent(this,ForgotEmailActivity::class.java)
            startActivity(tengeneza)
        }
        btn_create.setOnClickListener {
            val unda=Intent(this,CreatAccountActivity::class.java)
            startActivity(unda)
        }
    }
}