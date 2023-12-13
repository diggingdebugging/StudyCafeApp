package com.example.studycafeapp

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.studycafeapp.databinding.ActivityRescafeseatBinding

class ResCafeSeatActivity : AppCompatActivity() {
    private lateinit var rescafeseatBinding: ActivityRescafeseatBinding
    private lateinit var seat: TextView
    private lateinit var numButtons: Array<Button>
    private val numBtnIDs = intArrayOf(
        R.id.BtnNum0, R.id.BtnNum1, R.id.BtnNum2, R.id.BtnNum3, R.id.BtnNum4,
        R.id.BtnNum5, R.id.BtnNum6, R.id.BtnNum7
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rescafeseatBinding = ActivityRescafeseatBinding.inflate(layoutInflater)
        val resTableSeatview = rescafeseatBinding.root
        setContentView(resTableSeatview)

        // 좌석 버튼 관련 요소들 연결
        seat = findViewById(R.id.Seat)
        numButtons = Array(numBtnIDs.size) { findViewById(numBtnIDs[it]) }

        for (index in numButtons.indices) {
            numButtons[index].setOnClickListener {
                seat.text = "${index + 1}번 자리"
                seat.setTextColor(Color.BLUE)
            }
        }

        // 이전으로
        rescafeseatBinding.backToUserBtn.setOnClickListener {
            startActivity(Intent(this, UserMainActivity::class.java))
            finish()
        }
        // 입실하기 버튼
        rescafeseatBinding.ConfirmBtn.setOnClickListener {
            if (seat.length() <= 0) {
                Toast.makeText(
                    applicationContext, "좌석을 선택하세요",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                // Intent
                val intent = Intent(this, ResEndActivity::class.java)
                startActivity(intent) // 다음 액티비티 화면에 출력
            }
        }
    }
}