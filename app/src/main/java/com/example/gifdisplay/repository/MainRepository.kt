package com.example.gifdisplay.repository

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.example.gifdisplay.datasource.GifDataSoursce
import com.example.gifdisplay.model.AllDatas

class MainRepository : DataSource.Factory<Int, AllDatas>() {
    val mutableLiveData: MutableLiveData<GifDataSoursce> = MutableLiveData()


    override fun create(): DataSource<Int, AllDatas> {
        val gifDataSoursce = GifDataSoursce()
        mutableLiveData.postValue(gifDataSoursce)
        return gifDataSoursce
    }

}