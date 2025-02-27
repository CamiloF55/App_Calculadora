package com.example.appcalculadora

import android.icu.text.DecimalFormat
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val suma = "+"
    val resta = "-"
    val multiplicacion = "*"
    val division = "/"
    val porcentaje = "%"

    var operacionActual = ""  //Aqui se ve el resultado

    var primerNumero: Double = Double.NaN
    var segundoNumero: Double = Double.NaN

    lateinit var tvTemp: TextView
    lateinit var tvResult: TextView

    lateinit var formatoDecimal: DecimalFormat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        formatoDecimal =
            DecimalFormat("#.##########") //Estos # indican el patron del formato decimal, cada # es un número
        tvTemp = findViewById(R.id.tvTemp)
        tvResult = findViewById(R.id.tvResult)
    }


    fun cambiarOperador(b: View) {
        calcular()
        val boton: Button = b as Button
        if (boton.text.toString().trim() == "÷") {
            operacionActual = "/"
        } else if (boton.text.toString().trim() == "x") {
            operacionActual = "*"
        } else {
            operacionActual = boton.text.toString().trim()
        }

        tvResult.text = formatoDecimal.format(primerNumero) + operacionActual
        tvTemp.text = ""
    }

    fun calcular(){
        if (primerNumero.toString()!="NaN"){
            segundoNumero = tvTemp.text.toString().toDouble()
            tvTemp.text=""

            when(operacionActual){
                "+"-> primerNumero = (primerNumero+segundoNumero)
                "-"-> primerNumero = (primerNumero-segundoNumero)
                "*"-> primerNumero = (primerNumero*segundoNumero)
                "/"-> primerNumero = (primerNumero/segundoNumero)
                "%"-> primerNumero = (primerNumero%segundoNumero)
            }
        }else{

            primerNumero = tvTemp.text.toString().toDouble()
        }
    }

    fun seleccionarNumero(b: View){
        val boton:Button = b as Button
        tvTemp.text = tvTemp.text.toString() + boton.text.toString()
    }
}