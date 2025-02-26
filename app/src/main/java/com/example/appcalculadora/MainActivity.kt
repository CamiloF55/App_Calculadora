package com.example.appcalculadora

import android.icu.text.DecimalFormat
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val suma= "+"
    val resta= "-"
    val multiplicacion= "*"
    val division= "/"

    var operacionActual = ""  //Aqui se ve el resultado

    var primerNumero :Double =Double.NaN
    var segundoNumero :Double =Double.NaN

    lateinit var tvTemp :TextView
    lateinit var tvResult:TextView

    lateinit var formatoDecimal :DecimalFormat

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R. layout.activity_main)

        formatoDecimal = DecimalFormat("#.##########") //Estos # indican el patron del formato decimal, cada # es un número
        tvTemp = findViewById(R.id.tvTemp)
        tvResult = findViewById(R.id.tvResult)
         }

    //Aqui sigue el codigooooooooooooooooooooooooooooooooooooooooooooooooooooooo
    fun cambiarOperador ()


    }