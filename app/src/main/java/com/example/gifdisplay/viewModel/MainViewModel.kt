package com.example.gifdisplay.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private lateinit var allGifs: LiveData<String>
    fun init() {

    }

    fun getAllList(): LiveData<String> {
        return allGifs
    }
}