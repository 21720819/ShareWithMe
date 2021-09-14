package com.minsol.swm

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_main.*

// 메인화면
class MainActivity : AppCompatActivity() {

    // 뷰가 생성되었을 때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 그릴 xml 뷰 파일 연결(설정)
        setContentView(R.layout.activity_main)
        //val intent = Intent(this, MainActivity2::class.java) // 인텐트를 생성
        //startActivity(intent)  // 화면 전환하기
        btn_login_login_jh.setOnClickListener { // 버튼 클릭시 할 행동
            val intent = Intent(this, Banned::class.java) // 인텐트를 생성
            startActivity(intent)  // 화면 전환하기
        }
        tv_login_new_jh.setOnClickListener { // 버튼 클릭시 할 행동
            val intent = Intent(this, SchoolSearch::class.java) // 인텐트를 생성
            startActivity(intent)  // 화면 전환하기
        }

        bg_login_jh.setOnClickListener {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(et_login_id_jh.windowToken, 0)
        }

    }
}