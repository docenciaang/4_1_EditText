package com.example.a4_1_edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var tvResumen: TextView?= null
    lateinit var etTelefono: EditText

    var etNombre: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etTelefono  = findViewById<EditText>(R.id.etTelefono)
        etNombre =  findViewById(R.id.etNombre)
        tvResumen = findViewById(R.id.tvResumen)

       // etTelefono.setText("344224")

    }

    fun botonTodo(view: View){
        tvResumen?.setText( " Tfn es ${etTelefono.text} y el nombre es ${etNombre?.text}" )
    }
}
