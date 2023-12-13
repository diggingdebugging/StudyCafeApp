package com.example.studycafeapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ResGroupRoomActivity : AppCompatActivity() {
    var rdoCal: RadioButton? = null
    var rdoTime: RadioButton? = null
    var rdoPpl: RadioButton? = null
    var dPicker: DatePicker? = null
    var tPicker: TimePicker? = null
    var ResPpl: EditText? = null
    var tvMonth: TextView? = null
    var tvDay: TextView? = null
    var tvHour: TextView? = null
    var btnDayOk: Button? = null
    var btnToResEndG: Button? = null
    var btnToBack: ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resgrouproom)

        title = "그룹 스터디룸 예약"

        // 컨텍스트 설정
        DayContext = this@ResGroupRoomActivity

        // 라디오버튼 3개
        rdoCal = findViewById<View>(R.id.rdoCal) as RadioButton
        rdoTime = findViewById<View>(R.id.rdoTime) as RadioButton
        rdoPpl = findViewById<View>(R.id.rdoPpl) as RadioButton

        // FrameLayout의 2개 위젯
        dPicker = findViewById<View>(R.id.datePicker1) as DatePicker
        tPicker = findViewById<View>(R.id.timePicker1) as TimePicker
        ResPpl = findViewById<View>(R.id.resPpl1) as EditText

        // 텍스트뷰 중에서 월,일,시 숫자
        tvMonth = findViewById<View>(R.id.tvMonth) as TextView
        tvDay = findViewById<View>(R.id.tvDay) as TextView
        tvHour = findViewById<View>(R.id.tvHour) as TextView
        tPicker!!.visibility = View.INVISIBLE
        dPicker!!.visibility = View.INVISIBLE
        rdoCal!!.setOnClickListener {
            tPicker!!.visibility = View.INVISIBLE
            dPicker!!.visibility = View.VISIBLE
        }
        rdoTime!!.setOnClickListener {
            tPicker!!.visibility = View.VISIBLE
            dPicker!!.visibility = View.INVISIBLE
        }
        btnDayOk = findViewById<View>(R.id.BtnDayOk) as Button
        btnDayOk!!.setOnClickListener {
            tvMonth!!.text = Integer.toString(1 + dPicker!!.month)
            tvDay!!.text = Integer.toString(dPicker!!.dayOfMonth)
            tvHour!!.text = Integer.toString(tPicker!!.currentHour)
        }

        btnToResEndG = findViewById<View>(R.id.BtnToResEndG) as Button
        btnToResEndG!!.setOnClickListener {
            startActivity(Intent(this, ResEndGActivity::class.java)) // 어드민으로 시작
            finish()
        }

        btnToBack = findViewById<ImageButton>(R.id.backToUserBtn)
        btnToBack!!.setOnClickListener {
            startActivity(Intent(this, UserMainActivity::class.java)) // 어드민으로 시작
            finish()
        }
    }
    companion object {
        var DayContext: Activity? = null
    }
}