package com.example.pc1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto1: EditText = findViewById(R.id.valor1)
        val texto2: EditText = findViewById(R.id.valor2)
        val btnSend: Button =findViewById(R.id.btnsend)

        btnSend.setOnClickListener{
            this.SendNumeros(Integer.parseInt(texto1.getText().toString()),Integer.parseInt(texto2.getText().toString()))
        }
    }
    private fun SendNumeros(num1: Int, num2: Int){
        val intent = Intent(this, ResultadoActivity::class.java)
        intent.putExtra("texto1",num1)
        intent.putExtra("texto2",num2)
        startActivity(intent)
    }

}