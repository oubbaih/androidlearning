package com.example.testtt

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btnDatePicker)
        btn.setOnClickListener{ view ->
            datetestshow(view)
            println("btn clicked")
        }


    }

    fun datetestshow(view: View){
        val ggca = Calendar.getInstance()
        val year = ggca.get(Calendar.YEAR)
        val month = ggca.get(Calendar.MONTH)
        val dayOfMonTH = ggca.get(Calendar.DAY_OF_MONTH)
        DatePickerDialog(this, DatePickerDialog.OnDateSetListener {
                view , Selectedyear, Selectedmonth , Selectedday ->
            val SelectedDateTexview = findViewById<TextView>(R.id.textView4)
            val AgeInMinutes = findViewById<TextView>(R.id.textView5)
            var selecteDate = "$Selectedday/${Selectedmonth+1}/$Selectedyear"

           var  dayInmunite = Selectedday.toInt() * (24*60)
            var monthInminutes = Selectedmonth.toInt() * (30*24*60)
            var yearInminutes = Selectedyear.toInt() * (12*30*24*60)

            AgeInMinutes.text="${dayInmunite+ monthInminutes + yearInminutes}"
            SelectedDateTexview.text="$selecteDate"
        }, year , month , dayOfMonTH).show()

    }

}

