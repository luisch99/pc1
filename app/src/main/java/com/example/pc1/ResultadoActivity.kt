package com.example.pc1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val suma: TextView = findViewById(R.id.num1)
        val resta: TextView = findViewById(R.id.num2)
        val multiplicacion: TextView = findViewById(R.id.num3)
        val division: TextView = findViewById(R.id.num4)

        val texto1 = intent.getIntExtra("texto1", 0)
        val texto2 = intent.getIntExtra("texto2", 0)
        val numero1 = texto1
        val numero2 = texto2

        val t1 = (numero1 + numero2).toString()
        val t2 = (numero1 - numero2).toString()
        val t3 = (numero1 * numero2).toString()
        val t4 = (numero1 / numero2).toString()

        suma.setText(t1)
        resta.setText(t2)
        multiplicacion.setText(t3)
        division.setText(t4)

    }
}