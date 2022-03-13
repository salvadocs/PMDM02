package com.example.pmdm_02

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class Edad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edad)

        getSupportActionBar()?.hide();

        val buttonOK = findViewById<Button>(R.id.buttonOK);
        val editTextNumber = findViewById<EditText>(R.id.editTextNumber);

        buttonOK.setOnClickListener {

            var edad = editTextNumber.text.toString()

            val inicio = Intent()

            inicio.putExtra("valor_edad", edad)
            setResult(Activity.RESULT_OK, inicio)
            Log.d("Edad:", "Se ha enviado la edad.")
            finish()

        }
    }
}