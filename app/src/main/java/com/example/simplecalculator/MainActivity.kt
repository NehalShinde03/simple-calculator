package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception
import kotlin.math.roundToLong

class MainActivity : AppCompatActivity() {

    lateinit var symbol: String
    lateinit var disp:TextView
    lateinit var ans:TextView
    lateinit var combine:String
    var f1:Float = 0F
    var f2:Float =0F
    var f3:Float = 0F

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        disp = findViewById<TextView>(R.id.disp)
        ans=findViewById<TextView>(R.id.ans)
        val ac = findViewById<TextView>(R.id.all_clear)
        val c = findViewById<TextView>(R.id.clear)
        val mod = findViewById<TextView>(R.id.mod)
        val div = findViewById<TextView>(R.id.division)
        val seven = findViewById<TextView>(R.id.seven)
        val eight = findViewById<TextView>(R.id.eight)
        val nine = findViewById<TextView>(R.id.nine)
        val multi = findViewById<TextView>(R.id.multiply)
        val four = findViewById<TextView>(R.id.four)
        val five = findViewById<TextView>(R.id.five)
        val six = findViewById<TextView>(R.id.six)
        val minus = findViewById<TextView>(R.id.minus)
        val one = findViewById<TextView>(R.id.one)
        val two = findViewById<TextView>(R.id.two)
        val three = findViewById<TextView>(R.id.three)
        val plus = findViewById<TextView>(R.id.plus)
        val zero = findViewById<TextView>(R.id.zero)
        val dot = findViewById<TextView>(R.id.dot)
        val equal = findViewById<TextView>(R.id.equal)



        try {
            //for 1st digits
            zero.setOnClickListener(View.OnClickListener {
                disp.text =disp.text.toString() + "0"
            })

            one.setOnClickListener(View.OnClickListener {
                disp.text = disp.text.toString()  + "1"
            })

            two.setOnClickListener(View.OnClickListener {
                disp.text = disp.text.toString() + "2"
            })

            three.setOnClickListener(View.OnClickListener {
                disp.text = disp.text.toString() + "3"
            })

            four.setOnClickListener(View.OnClickListener {
                disp.text = disp.text.toString() + "4"
            })

            five.setOnClickListener(View.OnClickListener {
                disp.text = disp.text.toString()  + "5"
            })

            six.setOnClickListener(View.OnClickListener {
                disp.text = disp.text.toString() + "6"
            })

            seven.setOnClickListener(View.OnClickListener {
                disp.text =disp.text.toString() + "7"
            })

            eight.setOnClickListener(View.OnClickListener {
                disp.text = disp.text.toString() + "8"
            })

            nine.setOnClickListener(View.OnClickListener {
                disp.text = disp.text.toString()  + "9"
            })
            //for operator
            plus.setOnClickListener(View.OnClickListener {
                if (disp.text.isNullOrEmpty()) {
                } else{
                    combine=f3.toString()
                    if(!ans.text.isNullOrEmpty()){
                        disp.text= ans.text
                    }
                    f1 = disp.text.toString().toFloat()
                    symbol = "+"
                    combine = disp.text.toString()  + "+"
                    //combine=disp.text.toString()
                    disp.text=""
                    f2=0F
                }
            })

            minus.setOnClickListener(View.OnClickListener {
                if (disp.text.isNullOrEmpty()){}
                else{
                    combine=f3.toString()
                    if(!ans.text.isNullOrEmpty()){
                        disp.text= ans.text
                    }
                    f1 = disp.text.toString().toFloat()
                    symbol = "-"
                    disp.text = disp.text.toString()  + "-"
                    combine=disp.text.toString()
                    disp.text=""
                    f2=0F
                }
            })

            div.setOnClickListener(View.OnClickListener {
                if (disp.text.isNullOrEmpty()) {
                } else{
                    combine=f3.toString()
                    if(!ans.text.isNullOrEmpty()){
                        disp.text= ans.text
                    }
                    f1 = disp.text.toString().toFloat()
                    symbol = "/"
                    disp.text = disp.text.toString()  + "÷"
                    combine=disp.text.toString()
                    disp.text=""
                    f2=0F
                }
            })
            multi.setOnClickListener(View.OnClickListener {
               if (disp.text.isNullOrEmpty()){}
                else{
                   combine=f3.toString()
                   if(!ans.text.isNullOrEmpty()){
                       disp.text= ans.text
                   }
                    f1 = disp.text.toString().toFloat()
                    symbol = "*"
                    disp.text = disp.text.toString()  + "*"
                   combine=disp.text.toString()
                   disp.text=""
                   f2=0F
                }
            })
            mod.setOnClickListener(View.OnClickListener {
                if (disp.text.isNullOrEmpty()) {
                } else{
                    combine=f3.toString()
                    if(!ans.text.isNullOrEmpty()){
                        disp.text= ans.text
                    }
                    f1 = disp.text.toString().toFloat()
                    symbol = "%"
                     disp.text= disp.text.toString()  + "%"
                    combine=disp.text.toString()
                    disp.text=""
                    f2=0F
                }
            })

            //in this portion check condition
            equal.setOnClickListener(View.OnClickListener {
                if (disp.text.isNullOrEmpty()){}
//                else if(disp.text.toString()==temp.toString()){
//                    ans.text=disp.text
//                }
                else if (f2==0F)
                {

                   // disp.text=""
                    f2 = disp.text.toString().toFloat()
                    disp.text=combine+disp.text.toString()
                    when (symbol) {
                        "+" -> {
                           // f3 =(f1+f2)
                            f3= (f1+f2)
                        }
                        "-" -> {
                            f3 = (f1-f2)
                        }
                        "*" -> {
                            f3 = (f1*f2)
                        }
                        "/" -> {
                            f3 = (f1/f2)
                        }
                        "%" -> {
                            f3 = (f1%f2)
                        }
                    }
                    ans.text = f3.toString()
                  //  combine=f3.toString()
                   // disp.text = ans.text.toString()
                }
                else if(!ans.text.isNullOrEmpty()){
                    ans.text=ans.text
                }
               /* else if(f1>=0L && f2==null){
                    disp.text= f1.toString().toLong().toString()
                }*/
                else {
                    disp.text = ""
                }
            })

            ac.setOnClickListener(View.OnClickListener {
                disp.text = null
                ans.text = null
                f1=0f
                f2=0f
            })

            dot.setOnClickListener(View.OnClickListener {
                disp.text = disp.text.toString()+"."
            })

            c.setOnClickListener(View.OnClickListener {
                var str: String = disp.text.toString()
                if (!str.isNullOrEmpty()) {
                    str = str.substring(0, str.length - 1)
                    disp.text = str.toString()
                }
            })
        }catch (e:Exception){
            Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
        }
    }
/*
    private fun joint() {
        disp.text = ans.text.toString()
    }
*/
}