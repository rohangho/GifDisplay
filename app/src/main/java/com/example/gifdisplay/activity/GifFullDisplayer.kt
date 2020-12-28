package com.example.gifdisplay.activity

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.gifdisplay.R

class GifFullDisplayer : AppCompatActivity() {

    private lateinit var urlString: String
    private lateinit var displayImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gif_full_displayer)

        urlString = intent.getStringExtra("url")!!
        displayImage = findViewById(R.id.gifGif)


        Glide.with(this).load(urlString).into(displayImage)


    }
}