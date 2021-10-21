package com.example.companionobject

import android.graphics.Color
import android.view.View

class Background {
    companion object{
        val night = 0
        val day = 1
    }
    fun changeBackground(layout: View, mood:Int){
        when(mood){
            0->{layout.setBackgroundResource(R.drawable.night)}
            1->{layout.setBackgroundResource(R.drawable.day)}
        }
    }
}