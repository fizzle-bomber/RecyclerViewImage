package com.example.recyclerveiw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf<Image>(
            Image("Black Widow" , R.drawable.image_one),
            Image("Movie 2" , R.drawable.image_two),
            Image("Movie 3" , R.drawable.image_three),
            Image("Quiet Place 2" , R.drawable.image_four),
            Image("Eternals" , R.drawable.image_five),
            Image("Fast & Furios 9" , R.drawable.image_six),
            Image("Fast & Furios 9" , R.drawable.image_seven),
            Image("Fast & Furios 9" , R.drawable.image_eight),
            Image("Fast & Furios 9" , R.drawable.image_nine),
            Image("Fast & Furios 9" , R.drawable.image_ten),
            Image("Fast & Furios 91" , R.drawable.image_eleven),
            Image("Image 1" , R.drawable.image_one),
            Image("Image 1" , R.drawable.image_thirteen),
            Image("Image 1" , R.drawable.image_two),
            Image("Image 1" , R.drawable.image_fifteen),
            Image("Image 1" , R.drawable.image_sixteen),
            Image("Image 1" , R.drawable.image_seventeen),
            Image("Image 1" , R.drawable.image_eighteen),
            Image("Image 1" , R.drawable.image_ninteen),
            Image("Image 1" , R.drawable.image_three)

        )
        val recyclerView :RecyclerView = findViewById(R.id.imagesRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ImageAdapter(this, images)
    }

}