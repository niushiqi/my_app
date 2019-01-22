package com.dzkj.ldd.chatmore.liaodede

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textview1 = findViewById<TextView>(R.id.textview1)
        textview1.text = "牛仕琦你好啊"
    }
}