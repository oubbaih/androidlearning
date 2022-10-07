package com.example.testtt

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val inp = findViewById<EditText>(R.id.editTextTextPersonName3)
        val tt = findViewById<TextView>(R.id.textView2)
        val btnn = findViewById<Button>(R.id.button)

        btnn.setOnClickListener {
            var inputvalue = inp.text.toString().toInt()

            when(inputvalue){
                in 2..5 -> tt.text = "hello $inputvalue"
                in 6..12 -> tt.text = "hi $inputvalue"
                in 12 downTo 1 -> tt.text = "down $inputvalue"
                else -> tt.text = "unvalide Number"
            }
            for(num in 10 downTo  1){
                print("\n $num")
            }
            fun Some(a:Int , b:Int):Int{
                return a+b
            }
            var res = Some(1,2)
            print("result is : $res")
        }


    }
}

