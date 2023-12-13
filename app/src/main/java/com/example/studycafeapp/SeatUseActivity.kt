package com.example.studycafeapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.studycafeapp.databinding.ActivitySeatuseBinding
class SeatUseActivity: AppCompatActivity() {
    private lateinit var seatUseBinding: ActivitySeatuseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        seatUseBinding = ActivitySeatuseBinding.inflate(layoutInflater)
        val view = seatUseBinding.root
        setContentView(view)

        seatUseBinding.backToAdminBtn.setOnClickListener {
            startActivity(Intent(this,AdminMainActivity::class.java))
            finish()
        }
    }
}