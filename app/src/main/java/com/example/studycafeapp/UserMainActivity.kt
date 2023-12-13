package com.example.studycafeapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.studycafeapp.databinding.ActivityUsermainBinding

class UserMainActivity : AppCompatActivity() {
    private lateinit var userMainBinding : ActivityUsermainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        userMainBinding = ActivityUsermainBinding.inflate(layoutInflater)
        val userMainView = userMainBinding.root
        setContentView(userMainView)

        // 타이틀화면으로 돌아가는 버튼
        userMainBinding.backToMainBtn.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

        // 일반석 이용하기 버튼
        userMainBinding.resTableSeatBtn.setOnClickListener {
            startActivity(Intent(this,ResTableSeatActivity::class.java))
        }

        // 카페석 이용하기 버튼
        userMainBinding.resCafeSeatBtn.setOnClickListener {
            startActivity(Intent(this,ResCafeSeatActivity::class.java))
        }

        // 그룹스터디룸 예약 버튼
        userMainBinding.resGroupRoomBtn.setOnClickListener {
            startActivity(Intent(this,ResGroupRoomActivity::class.java))
        }

        userMainBinding.paymentBtn.setOnClickListener {
            startActivity(Intent(this,PaymentActivity::class.java))

        }

        // 비품대여 버튼
        userMainBinding.rentEquipBtn.setOnClickListener {
            startActivity(Intent(this,EquipRentActivity::class.java))
        }
    }
}