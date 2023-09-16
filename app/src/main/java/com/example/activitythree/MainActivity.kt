package com.example.activitythree

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val equalButton = findViewById<Button>(R.id.equalButton)
        val variableOne = findViewById<EditText>(R.id.editTextNumberDecimal)
        val variableTwo = findViewById<EditText>(R.id.editTextNumberDecimal2)
        val resultSum = findViewById<TextView>(R.id.textViewAdditionRes)
        val resultDiff = findViewById<TextView>(R.id.textViewSubtractionRes)
        val resultProd = findViewById<TextView>(R.id.textViewMultiplicationRes)
        val resultQuot = findViewById<TextView>(R.id.textViewDivisionRes)
        val clearButton = findViewById<Button>(R.id.clearButton)

        equalButton.setOnClickListener {
            resultSum.text = (variableOne.text.toString().toInt()+variableTwo.text.toString().toInt()).toString()
            resultDiff.text = (variableOne.text.toString().toInt()-variableTwo.text.toString().toInt()).toString()
            resultProd.text = (variableOne.text.toString().toInt()*variableTwo.text.toString().toInt()).toString()
            resultQuot.text = (variableOne.text.toString().toInt()+variableTwo.text.toString().toInt()).toString()
            resultSum.isVisible = true
            resultDiff.isVisible = true
            resultProd.isVisible = true
            resultQuot.isVisible = true
            clearButton.isVisible = true
            clearButton.isClickable = true
        }
        clearButton.setOnClickListener {
            resultSum.isVisible = false
            resultDiff.isVisible = false
            resultProd.isVisible = false
            resultQuot.isVisible = false
            clearButton.isVisible = false
            clearButton.isClickable = false
        }
    }
}