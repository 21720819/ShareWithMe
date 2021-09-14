package com.minsol.swm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_school_search.*

class SchoolSearch : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_school_search)

        val items = arrayOf("   경북대학교","   계명대학교","   대구가톨릭대학교","   대구대학교","   영남대학교")

        val myAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, items)
        spinner.adapter = myAdapter

        spinner.prompt = "학교를 선택하세요"

        button.setOnClickListener { // 버튼 클릭시 할 행동
            val intent = Intent(this, School::class.java) // 인텐트를 생성
            startActivity(intent)  // 화면 전환하기
        }
    }
}