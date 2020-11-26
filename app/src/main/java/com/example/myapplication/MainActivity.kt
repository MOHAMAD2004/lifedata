package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ma_btn_plus:Button
        val ma_txt_answer:TextView
        val lifedata:mainviewmodle
        ma_btn_plus=findViewById(R.id.xml_btn_plus)
        ma_txt_answer=findViewById(R.id.xml_txt_answer)
        lifedata=ViewModelProvider(this).get(mainviewmodle::class.java)
        lifedata.score.observe(this , Observer {
            ma_txt_answer.text=it. toString()
        })
        ma_btn_plus.setOnClickListener(){
          lifedata.add(Integer.parseInt(ma_txt_answer.text.toString()))
        }
    }
}