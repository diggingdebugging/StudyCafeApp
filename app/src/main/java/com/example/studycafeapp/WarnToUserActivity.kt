package com.example.studycafeapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.studycafeapp.databinding.ActivityDailystatsBinding
import com.example.studycafeapp.databinding.ActivityWarnBinding

class WarnToUserActivity : AppCompatActivity() {
    private lateinit var warnBinding: ActivityWarnBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        warnBinding = ActivityWarnBinding.inflate(layoutInflater)
        val view = warnBinding.root
        setContentView(view)

        warnBinding.backToAdBtn.setOnClickListener {
            finish()
        }

        warnBinding.warnBtn.setOnClickListener {
            Toast.makeText(this,"회원에게 경고를 부과했습니다!",Toast.LENGTH_SHORT).show()
            finish()
        }



    }//onCreate End
}//ClassEnd