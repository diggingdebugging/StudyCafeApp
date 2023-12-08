package com.example.studycafeapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.studycafeapp.databinding.ActivityAdminmainBinding
import com.example.studycafeapp.databinding.ActivityMainBinding

class AdminMainActivity : AppCompatActivity() {
    private lateinit var adminMainBinding : ActivityAdminmainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        adminMainBinding = ActivityAdminmainBinding.inflate(layoutInflater)
        val adminMainView = adminMainBinding.root
        setContentView(adminMainView)

        //-------------------관리자메뉴에서 타이틀화면으로 돌아가는 버튼=---------------------------------
        adminMainBinding.backToMainBtn.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java)) //어드민으로 시작
            finish()
        }

        // ---------------------현재 사용 좌석들 확인하는 버튼-------------------------------벽돌
        adminMainBinding.checkCurrentSeatBtn.setOnClickListener {

        }

        // ------------------비품 목록들을 확인하는 버튼 --------------------------------- 대충 리싸이클러뷰로 벽돌
        adminMainBinding.stuffCheckBtn.setOnClickListener {

        }

        //-------------------- 일일 통계 확인 버튼 -------------------------------  벽돌
        adminMainBinding.dailyStatsCheckBtn.setOnClickListener {
            startActivity(Intent(this,DailyStatsActivity::class.java)) //어드민으로 시작

        }

        //---------------------유저 경고 부과 버튼----------------------  실제로 부과하는거 만들기
        adminMainBinding.warnToUserBtn.setOnClickListener {
            startActivity(Intent(this,WarnToUserActivity::class.java)) //어드민으로 시작

        }

    }
}