package com.e.bat.jodoh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_jodoh.*
import java.util.*

class jodoh : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jodoh)
        btnMatch.setOnClickListener { carijodoh() }

    }

    fun carijodoh() {
        val randomDora = Random().nextInt(5)+1
        val randomemon = Random().nextInt(5)+1
        val drawableResDora = when (randomDora){
            1 ->R.drawable.putra1
            2 ->R.drawable.putra2
            3 ->R.drawable.putra3
            4 ->R.drawable.putra4
            else -> R.drawable.putra5
            }

        val drawableResemon = when (randomemon){
            1 ->R.drawable.putri1
            2 ->R.drawable.putri2
            3 ->R.drawable.putri3
            4 ->R.drawable.putri4
            else -> R.drawable.putri5

         }

        emon1.setImageResource(drawableResDora)
        dora1.setImageResource(drawableResemon)



    }
}
