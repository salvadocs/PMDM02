package com.example.pmdm_02

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class Nombre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nombre)

        getSupportActionBar()?.hide();


        val buttonOK = findViewById<Button>(R.id.buttonOK);
        val editTextNombre = findViewById<EditText>(R.id.editTextNombre);

        buttonOK.setOnClickListener {

            var nombre = editTextNombre.text.toString()


            val inicio = Intent()

            inicio.putExtra("valor_nombre", nombre)
            setResult(Activity.RESULT_OK, inicio)
            Log.d("Nombre:", "Se ha enviado el nombre.")
            finish()

        }

    }
}