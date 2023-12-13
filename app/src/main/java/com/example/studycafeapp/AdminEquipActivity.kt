package com.example.studycafeapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.studycafeapp.databinding.ActivityAdminequipBinding
import com.example.studycafeapp.databinding.ActivityAdminmainBinding
import android.widget.ListView
import android.widget.ArrayAdapter

class AdminEquipActivity : AppCompatActivity() {
    private lateinit var list: ListView

    private lateinit var adminEquipBinding : ActivityAdminequipBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        adminEquipBinding = ActivityAdminequipBinding.inflate(layoutInflater)
        val adminEquipView = adminEquipBinding.root
        setContentView(adminEquipView)
        adminEquipBinding.backToAdminBtn.setOnClickListener {
            startActivity(Intent(this,AdminMainActivity::class.java)) //어드민으로 시작
            finish()
        }

        list = findViewById(R.id.listView1)
        val data = mutableListOf("충전기1: 대여중","충전기2","충전기3","담요1","담요2","필기구1: 대여중","필기구2")

        // 리스트뷰와 리스트를 연결하는 어댑터
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)
        list.adapter = adapter

        adapter.notifyDataSetChanged()
    }
}