package com.example.gifdisplay.datasource

import android.util.Log
import androidx.paging.PageKeyedDataSource
import com.example.gifdisplay.model.AllDatas
import com.example.gifdisplay.model.BaseResponse
import com.example.gifdisplay.network.RestService
import retrofit2.Call
import retrofit2.Response

class GifDataSoursce : PageKeyedDataSource<Int, AllDatas>() {

    var retrofitObj = RestService.rest
    val key = "fx3uWArf2x2hoP32GT7kiTqnqRMEfK6J"


    override fun loadInitial(
        params: LoadInitialParams<Int>,
        callback: LoadInitialCallback<Int, AllDatas>
    ) {
        retrofitObj.getAllTrendingGif(key, 25, 0)
            .enqueue(object : retrofit2.Callback<BaseResponse> {
                override fun onResponse(
                    call: Call<BaseResponse>,
                    response: Response<BaseResponse>
                ) {
                    if (response.isSuccessful) {
                        callback.onResult(response.body()!!.data!!, null, 1)
                    }

                }

                override fun onFailure(call: Call<BaseResponse>, t: Throwable) {
                    Log.e("Hiii", t.toString())
                }
            }
            )
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, AllDatas>) {

    }

    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, AllDatas>) {

        retrofitObj.getAllTrendingGif(key, 10, params.key)
            .enqueue(object : retrofit2.Callback<BaseResponse> {
                override fun onResponse(
                    call: Call<BaseResponse>,
                    response: Response<BaseResponse>
                ) {
                    if (response.isSuccessful) {
                        callback.onResult(response.body()!!.data!!, params.key + 1)
                    }
                }

                override fun onFailure(call: Call<BaseResponse>, t: Throwable) {
                    Log.e("Hiii", t.toString())
                }
            }
            )
    }

}