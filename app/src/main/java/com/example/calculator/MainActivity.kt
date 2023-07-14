package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var resultdisplay = findViewById<TextView>(R.id.resultdis)
        var secondaryView = findViewById<TextView>(R.id.secondaryview)



        val num1 = findViewById<Button>(R.id.num1)
        val num2 = findViewById<Button>(R.id.num2)
        val num3 = findViewById<Button>(R.id.num3)
        val num4 = findViewById<Button>(R.id.num4)
        val num5 = findViewById<Button>(R.id.num5)
        val num6 = findViewById<Button>(R.id.num6)
        val num7 = findViewById<Button>(R.id.num7)
        val num8 = findViewById<Button>(R.id.num8)
        val num9 = findViewById<Button>(R.id.num9)
        val num0 = findViewById<Button>(R.id.num0)
        val add = findViewById<Button>(R.id.add)
        val multiply = findViewById<Button>(R.id.mul)
        val divide = findViewById<Button>(R.id.div)
        val subtract = findViewById<Button>(R.id.min)
        val equal = findViewById<Button>(R.id.equal)

        val ac = findViewById<Button>(R.id.ac)

        var firstval = "0"
        var operatorval = " "

        var secondarydisplayitems = mutableListOf<String>()


        ac.setOnClickListener {
            resultdisplay.text = "0"
            firstval = "0"
            operatorval = " "
            secondarydisplayitems.clear()
            secondaryView.text = secondisplayvalues(secondarydisplayitems)
        }

        num1.setOnClickListener {
            var currentval = resultdisplay.text
            if(currentval == "0"){
                resultdisplay.text="1"
            }
            else if(currentval == "+" || currentval == "-" || currentval == "x" || currentval == "/"){
                resultdisplay.text="1"
            }
            else{
                resultdisplay.text ="${currentval}1"
            }
        }
        num2.setOnClickListener {
            var currentval = resultdisplay.text
            if(currentval == "0"){
                resultdisplay.text="2"
            }
            else if(currentval == "+" || currentval == "-" || currentval == "x" || currentval == "/"){
                resultdisplay.text="2"
            }
            else{
                resultdisplay.text ="${currentval}2"
            }
        }
        num3.setOnClickListener {
            var currentval = resultdisplay.text
            if(currentval == "0"){
                resultdisplay.text="3"
            }
            else if(currentval == "+" || currentval == "-" || currentval == "x" || currentval == "/"){
                resultdisplay.text="3"
            }
            else{
                resultdisplay.text ="${currentval}3"
            }
        }
        num4.setOnClickListener {
            var currentval = resultdisplay.text
            if(currentval == "0"){
                resultdisplay.text="4"
            }
            else if(currentval == "+" || currentval == "-" || currentval == "x" || currentval == "/"){
                resultdisplay.text="4"
            }
            else{
                resultdisplay.text ="${currentval}4"
            }
        }
        num5.setOnClickListener {
            var currentval = resultdisplay.text
            if(currentval == "0"){
                resultdisplay.text="5"
            }
            else if(currentval == "+" || currentval == "-" || currentval == "x" || currentval == "/"){
                resultdisplay.text="5"
            }
            else{
                resultdisplay.text ="${currentval}5"
            }
        }
        num6.setOnClickListener {
            var currentval = resultdisplay.text
            if(currentval == "0"){
                resultdisplay.text="6"
            }
            else if(currentval == "+" || currentval == "-" || currentval == "x" || currentval == "/"){
                resultdisplay.text="6"
            }
            else{
                resultdisplay.text ="${currentval}6"
            }
        }
        num7.setOnClickListener {
            var currentval = resultdisplay.text
            if(currentval == "0"){
                resultdisplay.text="7"
            }
            else if(currentval == "+" || currentval == "-" || currentval == "x" || currentval == "/"){
                resultdisplay.text="7"
            }
            else{
                resultdisplay.text ="${currentval}7"
            }
        }
        num8.setOnClickListener {
            var currentval = resultdisplay.text
            if(currentval == "0"){
                resultdisplay.text="8"
            }
            else if(currentval == "+" || currentval == "-" || currentval == "x" || currentval == "/"){
                resultdisplay.text="8"
            }
            else{
                resultdisplay.text ="${currentval}8"
            }
        }
        num9.setOnClickListener {
            var currentval = resultdisplay.text
            if(currentval == "0"){
                resultdisplay.text="9"
            }
            else if(currentval == "+" || currentval == "-" || currentval == "x" || currentval == "/"){
                resultdisplay.text="9"
            }
            else{
                resultdisplay.text ="${currentval}9"
            }
        }
        num0.setOnClickListener {
            var currentval = resultdisplay.text
            if(currentval == "0"){
                resultdisplay.text="0"
            }
            else if(currentval == "+" || currentval == "-" || currentval == "x" || currentval == "/"){
                resultdisplay.text="0"
            }
            else{
                resultdisplay.text ="${currentval}0"
            }
        }

        add.setOnClickListener {
            var currentval = resultdisplay.text;
            firstval = currentval.toString()
            resultdisplay.text ="+"
            operatorval = "+"
            secondarydisplayitems.add(firstval)
            secondarydisplayitems.add(operatorval)
            secondaryView.text = secondisplayvalues(secondarydisplayitems)

        }
        subtract.setOnClickListener {
            var currentval = resultdisplay.text;
            firstval = currentval.toString()
            resultdisplay.text = "-"
            operatorval = "-"
            secondarydisplayitems.add(firstval)
            secondarydisplayitems.add(operatorval)
            secondaryView.text = secondisplayvalues(secondarydisplayitems)

        }
        divide.setOnClickListener {
            var currentval = resultdisplay.text;
            firstval = currentval.toString()
            resultdisplay.text = "/"
            operatorval = "/"
            secondarydisplayitems.add(firstval)
            secondarydisplayitems.add(operatorval)
            secondaryView.text = secondisplayvalues(secondarydisplayitems)
        }
        multiply.setOnClickListener {
            var currentval = resultdisplay.text;
            firstval = currentval.toString()
            resultdisplay.text = "x"
            operatorval = "*"
            secondarydisplayitems.add(firstval)
            secondarydisplayitems.add(operatorval)
            secondaryView.text = secondisplayvalues(secondarydisplayitems)
        }


        equal.setOnClickListener {
            var currentval = resultdisplay.text;
            var secnval = currentval.toString();
            secondarydisplayitems.add(secnval)
            var result=0
            if(operatorval == "+"){
                resultdisplay.text = (firstval.toInt() + secnval.toInt()).toString();
            }
            if(operatorval == "-"){
                resultdisplay.text = (firstval.toInt() - secnval.toInt()).toString();
            }
            if(operatorval == "*"){
                resultdisplay.text = (firstval.toInt() * secnval.toInt()).toString();
            }
            if(operatorval == "/"){
                try{
                    val calculateans = firstval.toInt() / secnval.toInt()
                    resultdisplay.text = calculateans.toString()
                }catch(e:ArithmeticException){
                    resultdisplay.text = "undefined"
                }
            }
            secondaryView.text = secondisplayvalues(secondarydisplayitems)
            secondarydisplayitems.clear()
            secondisplayvalues(secondarydisplayitems)


        }



    }
    fun secondisplayvalues (l:MutableList<String>) :String{
        var values = " "
        for (i in l){
            values+=i;
        }
        return values

    }


}
