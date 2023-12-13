package com.example.studycafeapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.studycafeapp.databinding.ActivityResendBinding
class ResEndActivity: AppCompatActivity() {
    private lateinit var resEndBinding: ActivityResendBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        resEndBinding = ActivityResendBinding.inflate(layoutInflater)
        val view = resEndBinding.root
        setContentView(view)

        resEndBinding.backToUserBtn.setOnClickListener {
            startActivity(Intent(this,UserMainActivity::class.java))
            finish()
        }
    }
}