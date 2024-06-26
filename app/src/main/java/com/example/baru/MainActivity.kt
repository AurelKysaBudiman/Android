package com.example.baru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.controls.actions.FloatAction
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Spinner
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ptnama : EditText = findViewById(R.id.ptnama)
        var txthasilnama : TextView = findViewById(R.id.txthasilnama)
        var spinkelas : Spinner = findViewById(R.id.spinkelas)
        var rbperempuan : RadioButton = findViewById(R.id.rbperempuan)
        var rblaki : RadioButton = findViewById(R.id.rblaki)
        var btnsub : Button = findViewById(R.id.btnsub)
        var swhadir : Switch = findViewById(R.id.swhadir)

        var fbtnKembali : FloatingActionButton = findViewById(R.id.fbtnKembali)

        fbtnKembali.setOnClickListener(){
            var intro =
                Intent(this, intro::class.java)
            startActivity(intro)
        }

        swhadir.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                swhadir.text = "Hadir"
            } else {
                swhadir.text = "Tidak Hadir"
            }
        } 


        btnsub.setOnClickListener(){
            var Nama = ptnama.text.toString()
            var Kelas = spinkelas.selectedItem
            var Hadir = "Tidak Hadir"

            if (swhadir.isChecked){
                Hadir = " Hadir"
            }
            else{
                Hadir = "Tidak Hadir"
            }

            if (rbperempuan.isChecked){
                txthasilnama.text = "Nama: " + Nama +
                                    "\nKelas: " + Kelas +
                                    "\nKehadiran: " + Hadir +
                                    "\nJenis Kelamin: " + rbperempuan.text
            }
            else if (rblaki.isChecked){
                txthasilnama.text = "Nama: " + Nama +
                                    "\nKelas: " + Kelas +
                                    "\nKehadiran: " + Hadir +
                                    "\nJenis Kelamin: " + rblaki.text

            }
            else{
                Toast.makeText(this, "Silahkan pilih jenis kelamin!", Toast.LENGTH_LONG).show()
            }
        }
    }
}