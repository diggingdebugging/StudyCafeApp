package com.example.studycafeapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.studycafeapp.databinding.ActivityResendgBinding

class ResEndGActivity: AppCompatActivity() {
    private lateinit var resEndGBinding: ActivityResendgBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        resEndGBinding = ActivityResendgBinding.inflate(layoutInflater)
        val view = resEndGBinding.root
        setContentView(view)

        resEndGBinding.backToUserBtn.setOnClickListener {
            startActivity(Intent(this,UserMainActivity::class.java))
            finish()
        }
    }
}