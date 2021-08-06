package com.sw.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test("aa")
        test2("aa")
    }

    @Log
    fun test(msg: String) : String{
        return "xxxx$msg"
    }

    fun test2(msg: String) : String{
        return "xxxx$msg"
    }
}