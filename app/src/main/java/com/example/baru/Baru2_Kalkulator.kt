package com.example.baru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Baru2_Kalkulator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baru2_kalkulator)

        var ptangka1 : EditText = findViewById(R.id.ptangka1)
        var ptangka2 : EditText = findViewById(R.id.ptangka2)
        var txthitung : TextView = findViewById(R.id.txthitung)
        var btnoperasi : Button = findViewById(R.id.btnoperasi)
        var btnoperasi2 : Button = findViewById(R.id.btnoperasi2)
        var btnoperasi3 : Button = findViewById(R.id.btnoperasi3)
        var btnoperasi4  : Button = findViewById(R.id.btnoperasi4)

        var fbtnKembali : FloatingActionButton = findViewById(R.id.fbtnKembali)

        fbtnKembali.setOnClickListener(){
            var intro =
                Intent(this, intro::class.java)
            startActivity(intro)
        }

        btnoperasi.setOnClickListener(){
            var hasil = ptangka1.text.toString().toInt() + ptangka2.text.toString().toInt()
            txthitung.text = hasil.toString()
        }

        btnoperasi2.setOnClickListener(){
            var hasil = ptangka1.text.toString().toInt() - ptangka2.text.toString().toInt()
            txthitung.text = hasil.toString()

        }

        btnoperasi3.setOnClickListener(){
            var hasil = ptangka1.text.toString().toInt() * ptangka2.text.toString().toInt()
            txthitung.text = hasil.toString()
        }

        btnoperasi4.setOnClickListener(){
            var hasil = ptangka1.text.toString().toInt() / ptangka2.text.toString().toInt()
            txthitung.text = hasil.toString()
        }
    }
}