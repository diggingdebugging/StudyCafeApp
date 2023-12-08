package com.example.studycafeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.studycafeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val mainView = mainBinding.root
        setContentView(mainView)

        //----------------어드민 으로 시작버튼 -------------------------------
        mainBinding.startWithAdminBtn.setOnClickListener {
            startActivity(Intent(this,AdminMainActivity::class.java)) //어드민으로 시작
            finish()
        }

        //--------------------유저로 시작하는 버튼
        mainBinding.startWithUserBtn.setOnClickListener {

        }

    }
}