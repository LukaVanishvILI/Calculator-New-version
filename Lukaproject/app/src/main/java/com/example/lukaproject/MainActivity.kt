package com.example.lukaproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var resultTextView:TextView

    private var operand:Double=0.0
    private var operation:String=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView=findViewById(R.id.resultTextView)

    }

    fun numberClick(view: View) {
        if (view is TextView) {
            var result:String=resultTextView.text.toString()
            val number:String=view.text.toString()

            if (result=="0"){
                result = ""

            }


            resultTextView.text=number+result


        }

    }

    fun operationClick(view: View) {
        if (view is TextView) {

            if (!TextUtils.isEmpty(resultTextView.text)) {
                operand=resultTextView.text.toString().toDouble()

            }

            operation=view.text.toString()
            resultTextView.text=""

        }
    }

    fun equalsClick(view: View) {
        val secOndoperandText:String=resultTextView.text.toString()
        var secOndoperand:Double=0.0

        if (!TextUtils.isEmpty(secOndoperandText)) {
            secOndoperand =secOndoperandText.toDouble()
        }
        when(operation) {
            "+"-> resultTextView.text=(operand+secOndoperand).toString()
            "-"-> resultTextView.text=(operand-secOndoperand).toString()
            "/"-> resultTextView.text=(operand/secOndoperand).toString()
            "*"-> resultTextView.text=(operand*secOndoperand).toString()
            "√"-> resultTextView.text=(operand**sec0ndoperand).toString()


        }

    }




}