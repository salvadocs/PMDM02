package com.example.pmdm_02

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    var valor_nombre: String? = null
    var valor_apellido: String?= null
    var valor_edad: String?= null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getSupportActionBar()?.hide();

        val buttonNombre = findViewById<Button>(R.id.button);
        val buttonApellido = findViewById<Button>(R.id.button2);
        val buttonEdad = findViewById<Button>(R.id.button3);
        val buttonMostrar = findViewById<Button>(R.id.button4);
        val buttonDestruir = findViewById<Button>(R.id.button5);

        val nombre = Intent(this, Nombre::class.java)
        val apellido = Intent(this, Apellido::class.java)
        val edad = Intent(this, Edad::class.java)
        val mostrar = Intent(this, Mostrar::class.java)



        buttonNombre.setOnClickListener {
            startActivityForResult(nombre, 1)

        }


        buttonApellido.setOnClickListener {
            startActivityForResult(apellido, 2)
        }


        buttonEdad.setOnClickListener {
            startActivityForResult(edad, 3)
        }


        buttonMostrar.setOnClickListener {
            val mostrar = Intent(this, Mostrar::class.java)
            mostrar.putExtra("valor_nombre", valor_nombre)
            mostrar.putExtra("valor_apellido", valor_apellido)
            mostrar.putExtra("valor_edad", valor_edad)
            startActivity(mostrar)
        }

        buttonDestruir.setOnClickListener {
            finish()
        }



    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                valor_nombre = data?.getStringExtra("valor_nombre").toString()
                Log.i("MainActivity", "Valor Nombre: $valor_nombre")
            }
        }

        if (requestCode == 2) {
            if (resultCode == RESULT_OK) {
                valor_apellido = data?.getStringExtra("valor_apellido").toString()
                Log.i("MainActivity", "Valor Apellido: $valor_apellido")
            }
        }

        if (requestCode == 3) {
            if (resultCode == RESULT_OK) {
                valor_edad = data?.getStringExtra("valor_edad").toString()
                Log.i("MainActivity", "Valor Edad $valor_edad")
            }
        }

    }

}