package com.ashok.databindingforrecycleview

import android.widget.ImageView
import androidx.databinding.BindingAdapter


@BindingAdapter("android:show_image")
fun showImage(imageView: ImageView, url: String){
    GlideApp.with(imageView).load(url).into(imageView)
}