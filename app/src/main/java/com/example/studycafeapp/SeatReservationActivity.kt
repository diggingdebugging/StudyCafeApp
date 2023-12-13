package com.example.studycafeapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.studycafeapp.databinding.ActivityMainBinding
import com.example.studycafeapp.databinding.ActivitySeatreservationBinding

class SeatReservationActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySeatreservationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeatreservationBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }

}