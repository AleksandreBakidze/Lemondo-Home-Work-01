package com.example.lemondohomework01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.lemondohomework01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle : Bundle? = intent.extras
        val brandName = bundle!!.getString("brandName")
//        val mainImage = bundle!!.getString("mainImage")
//        val brandImage = bundle!!.getString("brandImage")
//        val orderRate = bundle!!.getString("orderRate")

//        //binding..text = Editable.Factory.getInstance().newEditable(position)
//        binding.
        //Toast.makeText(this, "$brandName", Toast.LENGTH_LONG).show()

    }
}