package com.example.baru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Baru2_editteks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baru2_editteks)

        var ptNama : EditText = findViewById(R.id.ptNama)
        var txtHasil : TextView = findViewById(R.id.txtHasil)
        var btnSubmit : Button = findViewById(R.id.btnSubmit)

        btnSubmit.setOnClickListener(){
            txtHasil.text = "Nama:\n" + ptNama.text.toString()
        }
    }
}