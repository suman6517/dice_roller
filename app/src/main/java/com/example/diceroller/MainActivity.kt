package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.ImageView
import android.widget.Toast
import androidx.compose.foundation.layout.PaddingValues
import com.example.diceroller.databinding.ActivityMainBinding
import com.shashank.sony.fancytoastlib.FancyToast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttom1.setOnClickListener {

            FancyToast.makeText(this,
                getString(R.string.clicked),FancyToast.LENGTH_SHORT,FancyToast.SUCCESS,true).show()

               rollDice()

        }


    }
    private fun rollDice()
    {
        val drawbleRecource= when(Random.nextInt(6)+1)
        {
            1 ->R.drawable.dice_1
            2 ->R.drawable.dice_2
            3-> R.drawable.dice_3
            4 ->R.drawable.dice_4
            5 ->R.drawable.dice_5
            else-> R.drawable.dice_6

        }
       val diceImeage:ImageView =binding.imageView

        diceImeage.setImageResource(drawbleRecource)


    }
}