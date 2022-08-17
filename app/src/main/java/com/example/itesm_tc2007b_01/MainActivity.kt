package com.example.itesm_tc2007b_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

//Comentario
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myTxt : String

        //Asignamos variables a los elementos que pusinmos en el XML
        var myTextView =  findViewById<TextView>(R.id.textView)
        var myEditText = findViewById<EditText>(R.id.editTxt)
        var myButton = findViewById<Button>(R.id.button)

        //Cuando le de click al boton
        myButton.setOnClickListener{
            myTxt = myEditText.text.toString()
            myTextView.text = myTxt
        }
//Comentario 233
    }
}