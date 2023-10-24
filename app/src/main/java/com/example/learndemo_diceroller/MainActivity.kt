package com.example.learndemo_diceroller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            //Toast.makeText(context: this, text: "Dice Roll",Toast.LENGTH_LONG).show()
            //Toast.makeText(this, "Dice Roll", Toast.LENGTH_SHORT).show();
            rollDice()
        }
    }

    @SuppressLint("ResourceType")
    private fun rollDice(){
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()

        var TextView2: TextView = findViewById(R.id.textView2)
        var luckyNumber = 6
        if(luckyNumber == diceRoll){
            TextView2.text = getString(R.string.textView2)
        }
        else {
            TextView2.text = ""
        }
    }
}

class Dice(val numSides:Int){
    fun roll(): Int{
        return (1..numSides).random()
    }

}