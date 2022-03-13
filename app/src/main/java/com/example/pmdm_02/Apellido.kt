package com.example.pmdm_02

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class Apellido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apellido)

        getSupportActionBar()?.hide();

        val buttonOK = findViewById<Button>(R.id.buttonOK);
        val editTextApellido = findViewById<EditText>(R.id.editTextApellido);

        buttonOK.setOnClickListener {

            var apellido = editTextApellido.text.toString()


            val inicio = Intent()

            inicio.putExtra("valor_apellido", apellido)
            setResult(Activity.RESULT_OK, inicio)
            Log.d("Apellido:", "Se ha enviado el apellido.")
            finish()

        }

    }
}