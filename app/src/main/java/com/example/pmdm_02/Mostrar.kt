package com.example.pmdm_02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView

class Mostrar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar)

        getSupportActionBar()?.hide();


        val tView1:TextView = findViewById(R.id.textViewNombre)
        val tView2:TextView = findViewById(R.id.textViewApellido)
        val tView3:TextView = findViewById(R.id.textViewEdad)

        val valorActivity1 = intent.getStringExtra("valor_nombre")
        val valorActivity2 = intent.getStringExtra("valor_apellido")
        val valorActivity3 = intent.getStringExtra("valor_edad")

        tView1.text = valorActivity1.toString()
        tView2.text = valorActivity2.toString()
        tView3.text = valorActivity3.toString()
    }
}