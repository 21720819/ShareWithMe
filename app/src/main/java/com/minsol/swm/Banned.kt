package com.minsol.swm

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import kotlinx.android.synthetic.main.activity_school.*
import kotlinx.android.synthetic.main.activity_banned.*

class Banned : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banned)

        val spannable = SpannableStringBuilder("정지된 계정이에요.\n자세한 사항은 문의하기를 이용해주세요.")
        spannable.setSpan(
            ForegroundColorSpan(Color.parseColor("#4311c6")),
            19, // start
            23, // end
            Spannable.SPAN_EXCLUSIVE_INCLUSIVE
        )

        textView25.setText(spannable)

        button2.setOnClickListener { // 버튼 클릭시 할 행동
            val intent = Intent(this, MainActivity::class.java) // 인텐트를 생성
            startActivity(intent)  // 화면 전환하기
        }

    }
}