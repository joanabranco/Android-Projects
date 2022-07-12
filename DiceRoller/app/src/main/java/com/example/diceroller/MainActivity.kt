package com.example.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    //var diceImage : ImageView? = null // assim teríamos de verificar de todas as vezes que é null
    lateinit var diceImage : ImageView //passa a ser uma variável global

    lateinit var rollButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollButton = findViewById(R.id.roll_button)
        rollButton.text = "Start" //muda dinamicamente o texto do botão
        rollButton.setOnClickListener{
            Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }

        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = Random(). nextInt(6) + 1 // assimila um número entre 1 e 6, se não puser é de 0 a 5

        rollButton.text = "Continue"
        val a = "The number is"
        resultText.text =  a.plus(" "). plus(randomInt.toString())
        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        //val diceImage : ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableResource)
    }
}