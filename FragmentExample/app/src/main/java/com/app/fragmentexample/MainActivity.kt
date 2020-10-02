package com.app.fragmentexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn:Button=findViewById(R.id.btn1)
        var rd:EditText=findViewById(R.id.edittext1)

        btn.setOnClickListener(){

            var i:Intent= Intent(this,FragmentFirst::class.java)
            i.putExtra("value",edittext1.text.toString())

            val firstfragment:FragmentFirst= FragmentFirst()
            val manager=supportFragmentManager
            val transaction=manager.beginTransaction()

            transaction.replace(R.id.fragmentcontainer,firstfragment)
            transaction.commit()
        }




    }
}