package com.example.baru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Daftar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        var ptNAME : EditText = findViewById(R.id.ptNAME)
        var ptADRESS : EditText = findViewById(R.id.ptADRESS)
        var btndaftar : Button = findViewById(R.id.btndaftar)

        btndaftar.setOnClickListener(){
            var nama = ptNAME.text
            var alamat = ptADRESS.text

            var activityDaftarHasil =
                Intent(this, DaftarHasil::class.java).also {
                    it.putExtra("extraNAMA", nama.toString())
                    it.putExtra("extraALAMAT", alamat.toString())
                }
            startActivity(activityDaftarHasil)
        }
    }
}