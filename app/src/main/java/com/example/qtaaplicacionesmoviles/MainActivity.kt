package com.example.qtaaplicacionesmoviles

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }fun main(){
        println(creditoHipotecario(70000000,14.03,5))
    }



    fun creditoHipotecario(VP:Int, i:Double, n:Int): Int {
        val VP = VP;
        val i = ((i/12)/100);
        val n = n*12;
        val resultado = VP*(((1+i).pow(n)*i)/((1+i).pow(n)-1));
        return resultado.toInt();
    }
}