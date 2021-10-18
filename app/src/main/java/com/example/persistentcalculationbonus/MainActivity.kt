package com.example.persistentcalculationbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var tv:TextView
    lateinit var et1:EditText
    lateinit var et2:EditText
    lateinit var btn:Button

    var aa = 0.0
    var bb =0.0f
    var cc = 0.0f
    var key = "myResult"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.textView)
        et1 = findViewById(R.id.editTextTextPersonName)
        et2 = findViewById(R.id.editTextTextPersonName2)
        btn = findViewById(R.id.button)
//
//        if (savedInstanceState!=null){
//            tv.text = savedInstanceState.getFloat(key,0.0f).toString()
//        }



        btn.setOnClickListener {


            try {
                aa = et1.text.toString().toDouble()
                et1.text.clear()
            }catch (e:Exception){
                Toast.makeText(this,"Write a Double number!",Toast.LENGTH_SHORT).show()
            }

            try {
                bb = et2.text.toString().toFloat()
                et2.text.clear()
            }catch (e:Exception){
                Toast.makeText(this,"Write a Float number!",Toast.LENGTH_SHORT).show()
            }

             cc = aa.toFloat() * bb
            tv.text = "$cc"
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putFloat(key,tv.text.toString().toFloat())
    }


    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        tv.text = savedInstanceState.getFloat(key,0.0f).toString()
    }
}

