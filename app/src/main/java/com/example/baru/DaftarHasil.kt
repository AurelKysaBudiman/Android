package com.example.baru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DaftarHasil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_hasil)

        var txtNAME : TextView = findViewById(R.id.txtNAME)
        var txtADRESS : TextView = findViewById(R.id.txtADRESS)

        var nama = intent.getStringExtra("extraNAMA")
        var alamat = intent.getStringExtra("extraALAMAT")

        var ftbnKembali : FloatingActionButton = findViewById(R.id.ftbnKembali)


        txtNAME.setText(nama)
        txtADRESS.setText(alamat)

        ftbnKembali.setOnClickListener(){
            var intro =
                Intent(this, intro::class.java)
            startActivity(intro)

    }
}}