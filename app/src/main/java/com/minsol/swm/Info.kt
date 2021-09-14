package com.minsol.swm

import android.content.Context
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import android.view.KeyEvent.KEYCODE_ENTER
import android.view.inputmethod.InputMethodManager
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_info.*
import kotlinx.android.synthetic.main.activity_phone.*
import kotlinx.android.synthetic.main.activity_school.*
import kotlinx.android.synthetic.main.activity_success.*

class Info : AppCompatActivity() {
    var pw:String = ""
    var pw2:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        button6.setOnClickListener { // 버튼 클릭시 할 행동
            val intent = Intent(this, Success::class.java) // 인텐트를 생성
            startActivity(intent)  // 화면 전환하기
        }

        editTextTextPassword2.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                pw = editTextTextPassword2.text.toString()
                pw2 = editTextTextPassword3.text.toString()

                if (pw2 == pw) {
                    button6.isEnabled = true

                    textView22.text = " 비밀번호가 일치해요"
                    textView22.setTextColor(Color.parseColor("#4311c6"))
                }
                else {
                    button6.isEnabled = false

                    textView22.text = " 비밀번호가 일치하지 않아요"
                    textView22.setTextColor(Color.RED)
                }
            }

        })

        editTextTextPassword3.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                pw = editTextTextPassword2.text.toString()
                pw2 = editTextTextPassword3.text.toString()

                pw = editTextTextPassword2.text.toString()
                pw2 = editTextTextPassword3.text.toString()

                if (pw2 == pw) {
                    button6.isEnabled = true

                    textView22.text = " 비밀번호가 일치해요"
                    textView22.setTextColor(Color.parseColor("#4311c6"))
                }
                else {
                    button6.isEnabled = false

                    textView22.text = " 비밀번호가 일치하지 않아요"
                    textView22.setTextColor(Color.RED)
                }
                /*
                if (editTextTextPassword3.text.toString() != "") {
                    ButtonEnable++
                    if(ButtonEnable == 4) {
                        button6.setEnabled(true)
                    }
                }
                else if (editTextTextPassword3.text.toString() == "") {
                    ButtonEnable--
                    button6.setEnabled(false)
                }
                */
            }

        })

        button15.setOnClickListener { // 버튼 클릭시 할 행동
            textView21.text = " 사용가능한 닉네임이에요"
            textView21.setTextColor(Color.parseColor("#4311c6"))

            //[빨강]다시 입력하세요
            //tv_school_alarm_jh.text = " 비밀번호가 일치하지 않아요"
            //tv_school_alarm_jh.setTextColor(Color.RED)
        }

        back5.setOnClickListener {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(editTextTextPersonName4.windowToken, 0)
        }
    }
}