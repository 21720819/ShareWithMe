package com.minsol.swm

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import kotlinx.android.synthetic.main.activity_school.*
import kotlinx.android.synthetic.main.activity_success.*

class Success : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        val spannable = SpannableStringBuilder("회원가입에 성공했어요!\n지금부터 쉐어윗미를 이용해보세요!")
        spannable.setSpan(
            ForegroundColorSpan(Color.parseColor("#4311c6")),
            18, // start
            22, // end
            Spannable.SPAN_EXCLUSIVE_INCLUSIVE
        )

        textView15.setText(spannable)

        button13.setOnClickListener { // 버튼 클릭시 할 행동
            val intent = Intent(this, MainActivity::class.java) // 인텐트를 생성
            startActivity(intent)  // 화면 전환하기
        }
    }
}