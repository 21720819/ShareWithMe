package com.minsol.swm

import android.content.Context
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_phone.*
import kotlinx.android.synthetic.main.activity_school.*
import kotlinx.android.synthetic.main.activity_school_search.*

class School : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_school)

        button8.setOnClickListener { // 버튼 클릭시 할 행동
            button9.isEnabled = true
            //button9.visibility= View.VISIBLE
            tv_school_alarm_jh.text = " 인증에 성공했어요"
            tv_school_alarm_jh.setTextColor(Color.parseColor("#4311c6"))
            textView19.text = ""
            button14.visibility = View.INVISIBLE

            //[빨강]다시 입력하세요
            //tv_school_alarm_jh.text = " 다시 입력하세요"
            //tv_school_alarm_jh.setTextColor(Color.RED)
        }

        button9.setOnClickListener { // 버튼 클릭시 할 행동
            val intent = Intent(this, Phone::class.java) // 인텐트를 생성
            startActivity(intent)  // 화면 전환하기
        }

        /*
        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked)
                button9.setEnabled(true)
            else
                button9.setEnabled(false)
        }
        */

        button14.setOnClickListener { // 버튼 클릭시 할 행동
            val intent = Intent(this, Phone::class.java) // 인텐트를 생성
            startActivity(intent)  // 화면 전환하기
        }

        back3.setOnClickListener {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(editTextTextEmailAddress.windowToken, 0)
        }


        val emails = arrayOf("   gmail.com","   yu.ac.kr")

        val emailAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, emails)
        spinner2.adapter = emailAdapter

        spinner2.prompt = "학교 이메일을 선택하세요"

    }
}