package com.example.itesm_tc2007b_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Integer.parseInt

//Comentario
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTextOB = findViewById<EditText>(R.id.myText)
        val myNumOB  = findViewById<EditText>(R.id.myNumber)
        val myButton = findViewById<Button>(R.id.button)

        myButton.setOnClickListener{
            var texto = myTextOB.text.toString()
            var numero = parseInt(myNumOB.text.toString())

            val myIntent = Intent(this, ChildActivity::class.java)

            myIntent.putExtra("keyText", texto)
            myIntent.putExtra("keyNumero", numero)

            startActivity(myIntent)

        }
    }
}