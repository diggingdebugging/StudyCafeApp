package com.example.studycafeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.studycafeapp.databinding.ActivityAdminmainBinding
import com.example.studycafeapp.databinding.ActivityDailystatsBinding

class DailyStatsActivity: AppCompatActivity() {
    private lateinit var dailystatsBinding: ActivityDailystatsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dailystatsBinding = ActivityDailystatsBinding.inflate(layoutInflater)
        val view = dailystatsBinding.root
        setContentView(view)

        dailystatsBinding.backToAdminBtn.setOnClickListener {
            finish()
        }

    }
}