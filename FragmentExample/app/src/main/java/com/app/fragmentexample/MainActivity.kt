package com.app.fragmentexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn:Button=findViewById(R.id.btn1)
        var ed:EditText=findViewById(R.id.edittext1)



        btn.setOnClickListener(){

            var bundle:Bundle=Bundle()
            bundle.putString("value1",ed.text.toString())

            val firstfragment:FragmentFirst= FragmentFirst()
            val manager=supportFragmentManager
            val transaction=manager.beginTransaction()

           firstfragment.arguments=bundle
            transaction.replace(R.id.fragmentcontainer,firstfragment)
            transaction.commit()
        }




    }
}