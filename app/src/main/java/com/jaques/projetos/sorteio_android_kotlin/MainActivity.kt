package com.jaques.projetos.sorteio_android_kotlin

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun actionButton(view: View){
        val number: Int = Random.nextInt(11)
        val text = "O número selelecionado foi: "
        val result: String = text + number.toString()
        textSelection.text =  result
    }
}


