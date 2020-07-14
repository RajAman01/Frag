package com.rajaman.frag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.fragBtn)
        var counter = 0


        btn.setOnClickListener {
            val fragManager = supportFragmentManager
            val transManager = fragManager.beginTransaction()

            val myFrag = frag1Act()
            transManager.replace(R.id.myfragment, myFrag)
            transManager.commit()

        }
        val btn2 = findViewById<Button>(R.id.fragBtn2)
        btn2.setOnClickListener {
            val fragManager = supportFragmentManager
            val transManager = fragManager.beginTransaction()

            val newFrag = frag2Act()
            transManager.replace(R.id.myfragment, newFrag)
            transManager.commit()

        }


    }
}