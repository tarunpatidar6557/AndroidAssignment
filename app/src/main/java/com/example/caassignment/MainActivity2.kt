package com.example.caassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.lang.StringBuilder

class MainActivity2 : AppCompatActivity() {
    lateinit var radiobtn: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btn = findViewById<Button>(R.id.btn)
        val radio = findViewById<RadioGroup>(R.id.rd_grp)
        val ch1 = findViewById<CheckBox>(R.id.ch1)
        val ch2 = findViewById<CheckBox>(R.id.ch2)
        radio.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener{group, checkId->
                val res:RadioButton=findViewById(checkId)
                Toast.makeText(applicationContext, "${res.text}",Toast.LENGTH_SHORT).show()
            }
        )
        ch1.setOnCheckedChangeListener { compoundButton, b ->
            if(b) {
                if (ch1 == compoundButton)
                    Toast.makeText(applicationContext, "${ch1.text}", Toast.LENGTH_SHORT).show()
            }
        }
        ch2.setOnCheckedChangeListener { compoundButton, b ->
            if(b){
            if(ch2==compoundButton)
                Toast.makeText(applicationContext, "${ch2.text}",Toast.LENGTH_SHORT).show()
            }
        }

    }
}