package com.example.baru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.Spinner
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Spinner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        var ptangka1 : EditText = findViewById(R.id.ptangka1)
        var ptangka2 : EditText = findViewById(R.id.ptangka2)
        var txthitung : TextView = findViewById(R.id.txthitung)
        var btnoperasi : Button = findViewById(R.id.btnoperasi)
        var spoperator : Spinner = findViewById(R.id.spoperator)

        btnoperasi.setOnClickListener() {
            var angka1 = ptangka1.text.toString().toDouble()
            var angka2 = ptangka2.text.toString().toDouble()
            var operasi = spoperator.selectedItem.toString()

            if (operasi == "+") {
                var hasil = angka1 + angka2
                txthitung.text = hasil.toString()
            } else if (operasi == "-") {
                var hasil = angka1 - angka2
                txthitung.text = hasil.toString()
            } else if (operasi == "x") {
                var hasil = angka1 * angka2
                txthitung.text = hasil.toString()
            } else if (operasi == ":") {
                var hasil = angka1 / angka2
                txthitung.text = hasil.toString()
            } else {
                Toast.makeText(this, "Operator salah!", Toast.LENGTH_LONG).show()
            }
        }

        var fbtnKembali : FloatingActionButton = findViewById(R.id.fbtnKembali)

        fbtnKembali.setOnClickListener(){
            var intro =
                Intent(this, intro::class.java)
            startActivity(intro)
        }
    }
}