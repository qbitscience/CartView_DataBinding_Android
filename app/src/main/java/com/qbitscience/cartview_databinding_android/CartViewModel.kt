package com.qbitscience.cartview_databinding_android

import android.view.View
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CartViewModel: ViewModel() {
    private val _cartValue = MutableLiveData(0)
    val cartValue: LiveData<Int> = _cartValue
    fun plusCart() {
        _cartValue.value = (_cartValue.value ?: 0) + 1


    }

    fun minusCart() {
        _cartValue.value = (_cartValue.value ?: 0) - 1
    }
}
