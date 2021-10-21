package com.example.companionobject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private lateinit var clMain: ConstraintLayout
    private lateinit var edMood: EditText
    private lateinit var switch: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clMain=findViewById(R.id.clMain)
        edMood=findViewById(R.id.edMood)

        switch=findViewById(R.id.switchBtn)

        switch.setOnClickListener (object : View.OnClickListener {
            override fun onClick(p0: View?){

                var edValue= edMood.text?.toString()

                when(edValue?.toLowerCase()){
                    "day"->{
                        val b = Background()
                        b.changeBackground(clMain,Background.day)
                    }
                    "night"->{
                        val b = Background()
                        b.changeBackground(clMain,Background.night)
                    }
                }
            }


        })
    }
}