package com.realdolmen.cookies.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.realdolmen.cookies.R
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        btn_total.setOnClickListener {
            var total:Double = 0.0
            if(cb_vanilla.isChecked){
                val quantity = et_quantity_vanilla.text.toString().toInt()
                total += quantity*5.25
            }
            if(cb_chocolate.isChecked){
                val quantity = et_quantity_chocolate.text.toString().toInt()
                total += quantity*3.75
            }
            tv_total.text = total.toString()
        }
    }
}

