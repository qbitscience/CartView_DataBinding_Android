package com.qbitscience.cartview_databinding_android

import android.graphics.Color
import android.view.View
import android.widget.Toast
import androidx.databinding.BindingAdapter

@BindingAdapter("app:disableifmin")
fun setMaxMin(view: View,cartValue:Int){
  if(cartValue<=0){
      view.isEnabled=false
  }
    else{
        view.isEnabled=true
    }
}
@BindingAdapter("app:buyDisable")
fun buyDisable(view: View,cartValue:Int){
    if(cartValue<=0){
        view.isEnabled=false
        view.setBackgroundColor(Color.GRAY)
    }
    else{
        view.isEnabled=true
        view.setBackgroundColor(Color.RED)
    }
}


