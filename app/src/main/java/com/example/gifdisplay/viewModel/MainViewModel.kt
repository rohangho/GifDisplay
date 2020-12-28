package com.example.gifdisplay.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.example.gifdisplay.model.AllDatas
import com.example.gifdisplay.repository.MainRepository


class MainViewModel : ViewModel() {


    private lateinit var allGifs: LiveData<PagedList<AllDatas>>

    fun init() {
        val mainRepository = MainRepository()

        val pagedListConfig = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setPageSize(10).build()

        //Building the paged list
        allGifs = LivePagedListBuilder(mainRepository, pagedListConfig)
            .build()

    }


    fun getArticleLiveData(): LiveData<PagedList<AllDatas>> {
        return allGifs
    }


}