package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button=findViewById(R.id.button)

        rollButton.setOnClickListener{

            rollDice()
        }

    }

    private fun rollDice(){
        val dice1=Dice(6)
        val dice2=Dice(6)
        val diceRoll1=dice1.roll()
        val diceRoll2=dice2.roll()
        val resultDice1View: TextView = findViewById(R.id.dice1)
        val resultDice2View: TextView=findViewById(R.id.dice2)
        resultDice1View.text=diceRoll1.toString()
        resultDice2View.text=diceRoll2.toString()
    }
}

class Dice(val numSides: Int){
    fun roll(): Int{
        var randomNumber: Int=(1..6).random()
        return randomNumber
    }


}