package com.example.studycafeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.studycafeapp.databinding.ActivityPaymentBinding

class PaymentActivity : AppCompatActivity(){
    private lateinit var binding: ActivityPaymentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //기본화면
        replaceFragment(NormalMemberFragment())
        binding.norMemBtn.setOnClickListener {
            replaceFragment(NormalMemberFragment())
        }

        binding.regMemBtn.setOnClickListener {
            replaceFragment(RegularMemberFragment())
        }

        binding.backToUserBtn2.setOnClickListener {
            finish()
        }
    }

    private fun replaceFragment(fragment: Fragment) { //fragment를 동적으로 넣는 방식
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            replace(R.id.frameLayout, fragment, null) // replace 교체방식 이용
            addToBackStack(null) //백버튼 이용안함
        }
        /*when (fragment) { // 바텀네비게이션바의 focus 맞춰주기
            is HomeFragment -> binding.bottomNavgationView.menu.findItem(R.id.home)?.isChecked =
                true

            is ProfileFragment -> binding.bottomNavgationView.menu.findItem(R.id.profile)?.isChecked =
                true

            is MessageFragment -> binding.bottomNavgationView.menu.findItem(R.id.message)?.isChecked =
                true
        }*/
    }
}