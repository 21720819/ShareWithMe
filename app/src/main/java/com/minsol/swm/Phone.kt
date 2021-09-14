package com.minsol.swm

import android.content.Context
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_phone.*
import kotlinx.android.synthetic.main.activity_school.*

class Phone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone)

        button12.setOnClickListener { // 버튼 클릭시 할 행동
            val intent = Intent(this, Info::class.java) // 인텐트를 생성
            startActivity(intent)  // 화면 전환하기
        }

        button11.setOnClickListener { // 버튼 클릭시 할 행동
            button12.isEnabled = true

            tv_phone_alarm_jh.text = " 인증에 성공했어요"
            tv_phone_alarm_jh.setTextColor(Color.parseColor("#4311c6"))

            //[빨강]다시 입력하세요
            //tv_phone_alarm_jh.text = " 다시 입력하세요"
            //tv_phone_alarm_jh.setTextColor(Color.RED)
        }

        back4.setOnClickListener {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(editTextPhone.windowToken, 0)
        }
    }
}