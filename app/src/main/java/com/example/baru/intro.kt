package com.example.baru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class intro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        var btnBiodata: Button = findViewById(R.id.btnBiodata)
        var btnKalku: Button = findViewById(R.id.btnKalku)
        var btnspin: Button = findViewById(R.id.btnspin)
        var btnLog : Button = findViewById(R.id.btnLog)
        var btndaf : Button = findViewById(R.id.btndaf)
        var btnfrag : Button = findViewById(R.id.btnfrag)
        var btnweb : Button = findViewById(R.id.btnweb)

        var fbtnHome: FloatingActionButton = findViewById(R.id.fbtnHome)
        fbtnHome.setOnClickListener(){
            var homeIntent = Intent(this, intro::class.java)
            this.finish()
        }


        btnBiodata.setOnClickListener() {
            var activityMainActivity =
                Intent(this, MainActivity::class.java)
            startActivity(activityMainActivity)
        }

        btnKalku.setOnClickListener() {
            var Baru2_Kalkulator =
                Intent(this, Baru2_Kalkulator::class.java)
            startActivity(Baru2_Kalkulator)
        }

        btnspin.setOnClickListener(){
            var Spinner =
                Intent(this, Spinner::class.java)
            startActivity(Spinner)
        }


        btnLog.setOnClickListener(){
            var Login =
                Intent(this, Login::class.java)
            startActivity(Login)
        }



        btndaf.setOnClickListener(){
            var Daftar =
                Intent(this, Daftar::class.java)
            startActivity(Daftar)
        }

        btnfrag.setOnClickListener(){
            var Fraggituaja =
                Intent(this, Fraggituaja::class.java)
            startActivity(Fraggituaja)
        }

        btnweb.setOnClickListener(){
            var Web =
                Intent(this, Web::class.java)
            startActivity(Web)
        }

    }}