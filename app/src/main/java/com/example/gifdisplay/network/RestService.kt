package com.example.gifdisplay.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RestService {
    val rest: NetworkCall
        get() {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://api.giphy.com/v1/gifs/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(NetworkCall::class.java)
        }
}