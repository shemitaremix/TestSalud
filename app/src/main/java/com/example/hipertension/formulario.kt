package com.example.hipertension

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView

class formulario : AppCompatActivity() {
    private var tvNombre:TextView?=null
    var cantidad:Int=0
    private var resultado:TextView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        tvNombre=findViewById(R.id.idNombre)
        val dato=intent.getStringExtra("nombre")
        tvNombre?.text = "Paciente: $dato"
        var nombre = intent.getStringArrayExtra("nombre")
        resultado = findViewById(R.id.resultadoview)

    }

    fun evento(view: View){
        if(view is CheckBox){
            val seleccionado: Boolean = view.isChecked
            if(view.id==R.id.checkBoxDolorCabeza){
                if(seleccionado){
                    cantidad ++
                }else{
                    cantidad --
                }
            }
            if (view.id==R.id.checkBoxSangrado){
                if(seleccionado){
                    cantidad ++
                }else{
                    cantidad --
                }
            }
            if (view.id==R.id.checkBoxNuseas){
                if(seleccionado){
                    cantidad ++
                }else{
                    cantidad --
                }
            }
            if (view.id==R.id.checkBoxConfusion){
                if(seleccionado){
                    cantidad ++
                }else{
                    cantidad --
                }
            }

            if (cantidad == 4||cantidad == 3){
                resultado?.setText("Eres hipertenso")
            }
            else{
                resultado?.setText("Estas sano")
            }
        }
    }
    fun regresa(view:View){
        var intento= Intent(this,MainActivity::class.java)
        startActivity(intento)
    }


}