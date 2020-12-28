package com.example.gifdisplay.network

import retrofit2.http.GET
import com.example.gifdisplay.model.BaseResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Query

interface NetworkCall {
    @GET("trending")
    fun getAllTrendingGif(
        @Query("api_key") key: String?,
        @Query("limit") limit: Int,
        @Query("offset") pageNo: Int
    ): Call<BaseResponse>

    companion object {
        fun getService(): NetworkCall {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://api.giphy.com/v1/gifs/")

                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(NetworkCall::class.java)
        }
    }
}