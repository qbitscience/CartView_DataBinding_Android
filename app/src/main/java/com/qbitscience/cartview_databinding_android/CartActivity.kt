package com.qbitscience.cartview_databinding_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.qbitscience.cartview_databinding_android.databinding.ActivityMainBinding

class CartActivity : AppCompatActivity() {
    val cartModel by lazy { ViewModelProviders.of(this).get(CartViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.lifecycleOwner = this
       binding.cartmodel=cartModel
      binding.buyNow.setOnClickListener {
          var data=binding.value.text.toString()
          Toast.makeText(applicationContext,data+" items to be purchased",Toast.LENGTH_LONG).show()
      }
    }
}