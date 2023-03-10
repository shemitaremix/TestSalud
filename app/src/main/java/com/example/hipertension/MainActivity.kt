package com.example.hipertension

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.InputDevice
import android.view.TextureView
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var txtDato:EditText?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtDato=findViewById(R.id.idInputnombre)



    }
    //Funcion que recibe el dato del nombre y la envia a la otra activity Hipertension
    fun envia(view: View){
        var dato=txtDato?.text.toString()
        var intento = Intent(this,formulario::class.java)
        intento.putExtra("nombre",dato)
        startActivity(intento)
    }
    //Funcion que recibe el dato del nombre y la envia a la otra activity Diabetes
    fun enviaDiabetes(view: View){
        var dato=txtDato?.text.toString()
        var intento = Intent(this,formularioDiabetico::class.java)
        intento.putExtra("nombre",dato)
        startActivity(intento)
    }


}