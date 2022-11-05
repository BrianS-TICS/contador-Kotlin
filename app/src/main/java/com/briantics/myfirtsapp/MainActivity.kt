package com.briantics.myfirtsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtContador = findViewById<TextView>(R.id.txtContador)

        val btnContar = findViewById<Button>(R.id.btnContar)
        var contador = 0

        btnContar.setOnClickListener {
            contador++
            txtContador.text = contador.toString()
            Toast.makeText(this, "Has aumentado el numero a ${contador}", Toast.LENGTH_SHORT).show()
        }
    }
}