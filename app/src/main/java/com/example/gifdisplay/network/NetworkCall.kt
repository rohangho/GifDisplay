package com.example.gifdisplay.network

import com.example.gifdisplay.model.BaseResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NetworkCall {
    @GET("trending")
    fun getAllTrendingGif(
        @Query("api_key") key: String?,
        @Query("limit") limit: Int,
        @Query("offset") pageNo: Int
    ): Call<BaseResponse>

}