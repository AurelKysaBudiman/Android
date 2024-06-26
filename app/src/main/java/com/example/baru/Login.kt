package com.example.baru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var txtuser : EditText = findViewById(R.id.txtuser)
        var txtpass : EditText = findViewById(R.id.txtpass)
        var btnOKE : Button = findViewById(R.id.btnOKE)

        btnOKE.setOnClickListener(){
            var username = txtuser.text.toString()
            var password = txtpass.text.toString()

            if (username =="Aurel" && password =="123"){
                var intro =
                    Intent(this, intro::class.java)
                startActivity(intro)
            }
            else{
                Toast.makeText(this,
                    "Username atau Password salah", Toast.LENGTH_LONG).show()
            }
        }
    }
}