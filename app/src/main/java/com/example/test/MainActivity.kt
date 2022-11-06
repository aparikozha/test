package com.example.test

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    lateinit var surname : EditText
    lateinit var name : EditText
    lateinit var email : EditText
    lateinit var password : EditText
    lateinit var checkBox : CheckBox


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun onClick(view: View){
        if (view is Button){
            name = findViewById(R.id.name)
            surname = findViewById(R.id.surname)
            email = findViewById(R.id.email)
            password = findViewById(R.id.password)
            checkBox = findViewById(R.id.checkBox)


            val nameCheck: Boolean = name.text.length >= 3
            val surnameCheck: Boolean = surname.text.length >= 5
            val emailCheck: Boolean =
                email.text.contains("[@]".toRegex()) && (email.text.indexOf(".", email.text.indexOf("@")) > email.text.indexOf("@"))
            val passwordCheck: Boolean =password.text.length >= 8 && password.text.any { it.isDigit() }
            val checkBoxCheck : Boolean = checkBox.isChecked


            if ( nameCheck && surnameCheck && emailCheck && checkBoxCheck && passwordCheck){
                Toast.makeText(applicationContext,"რეგისტრაცია წარმატებით დასრულდა",Toast.LENGTH_SHORT).show()

            }



        }
    }
}




