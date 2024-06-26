package com.example.baru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Frag : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frag)

        val FirstFragment = FirstFragment()
        val SecondFragment = SecondFragment()
        var btnFragemnt1 : Button = findViewById(R.id.btnFragemnt1)
        var btnFragemnt2 : Button = findViewById(R.id.btnFragemnt2)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, FirstFragment)
            commit()
        }

        btnFragemnt1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, FirstFragment)
                addToBackStack(null)
                commit()
            }
        }

        btnFragemnt2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, SecondFragment)
                addToBackStack(null)
                commit()
            }
        }
    }
}