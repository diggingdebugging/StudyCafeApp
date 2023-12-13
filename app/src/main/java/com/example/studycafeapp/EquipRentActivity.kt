package com.example.studycafeapp

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.studycafeapp.databinding.ActivityEquiprentBinding

class EquipRentActivity : AppCompatActivity() {
    private lateinit var equipRentBinding: ActivityEquiprentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        equipRentBinding = ActivityEquiprentBinding.inflate(layoutInflater)
        setContentView(equipRentBinding.root)

        val rentBtn = equipRentBinding.rentBtn

        equipRentBinding.backToUserBtn.setOnClickListener {
            startActivity(Intent(this,UserMainActivity::class.java))
            finish()
        }
        rentBtn.setOnClickListener {
            // 대여하기 버튼을 눌렀을 때의 동작
            showConfirmationDialog()
        }
    }

    private fun showConfirmationDialog() {
        val selectedItems = ArrayList<String>()

        if (equipRentBinding.cb1.isChecked) {
            selectedItems.add("충전기")
        }
        if (equipRentBinding.cb2.isChecked) {
            selectedItems.add("담요")
        }
        if (equipRentBinding.cb3.isChecked) {
            selectedItems.add("필기구")
        }

        if (selectedItems.isNotEmpty()) {
            val message = "선택한 물품: ${selectedItems.joinToString(", ")}"
            val dlg = AlertDialog.Builder(this)
            dlg.setTitle("물품 대여 확인")
            dlg.setMessage(message)
            dlg.setIcon(R.mipmap.ic_launcher)
            dlg.setPositiveButton("확인") { dialog, which ->
                // 확인 버튼을 눌렀을 때의 동작
                moveToUserMainActivity()
            }
            dlg.show()
        } else {
            // 아무 물품도 선택되지 않았을 경우 처리
            val dlg = AlertDialog.Builder(this)
            dlg.setTitle("알림")
            dlg.setMessage("대여할 물품을 선택해주세요.")
            dlg.setIcon(android.R.drawable.ic_dialog_alert)
            dlg.setPositiveButton("확인", null)
            dlg.show()
        }
    }

    private fun moveToUserMainActivity() {
        val intent = Intent(this, UserMainActivity::class.java)
        startActivity(intent)
        finish() // 현재 액티비티 종료
    }
}