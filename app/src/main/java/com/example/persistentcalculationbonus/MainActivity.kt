package com.example.persistentcalculationbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var tv:TextView
    lateinit var et1:EditText
    lateinit var et2:EditText
    lateinit var btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.textView)
        et1 = findViewById(R.id.editTextTextPersonName)
        et2 = findViewById(R.id.editTextTextPersonName2)
        btn = findViewById(R.id.button)

        var aa = 0.0
        var bb =0.0f
        var cc = 0.0f

        btn.setOnClickListener {

            try {
                aa = et1.text.toString().toDouble()
            }catch (e:Exception){
                Toast.makeText(this,"Write a Double number!",Toast.LENGTH_SHORT).show()
            }

            try {
                bb = et2.text.toString().toFloat()
            }catch (e:Exception){
                Toast.makeText(this,"Write a Float number!",Toast.LENGTH_SHORT).show()
            }

             cc = aa.toFloat() + bb
            tv.text = "$cc"
        }
    }
}