package com.example.databinding_example.bindingAdapters

import android.view.View
import android.widget.ProgressBar
import androidx.databinding.BindingAdapter

@BindingAdapter("app:hideIfZero")
    fun hideIfZero(view:ProgressBar, count:Int){
view.visibility = if ( count == 0 ) View.GONE else View.VISIBLE
}

