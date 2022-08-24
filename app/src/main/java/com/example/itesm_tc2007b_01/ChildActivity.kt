package com.example.itesm_tc2007b_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ChildActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child)
        
        val myTextView = findViewById<TextView>(R.id.valorTexto)
        val myNumberView = findViewById<TextView>(R.id.valorNumero)

        var myHashExtras : Bundle? = intent.extras

        var miTextoRecibido : String = myHashExtras?.getString("keyTexto")?:"No Texto Recibido"
        var miNumeroRecibido : Int = myHashExtras?.getInt("keyNumero")?:0

        myTextView.text = miTextoRecibido
        myNumberView.text = miNumeroRecibido.toString()

        Log.d("MYTAG", "Fin de la ejecucion")
        
    }
}