package com.example.gifdisplay

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.gifdisplay.adapter.MyDisplayAdapter
import com.example.gifdisplay.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel
    private lateinit var recycleDisplayer: RecyclerView
    private lateinit var myDisplayAdapter: MyDisplayAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycleDisplayer = findViewById(R.id.displayer)
        myDisplayAdapter = MyDisplayAdapter(this)

        recycleDisplayer.adapter = myDisplayAdapter

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.init()
        mainViewModel.getArticleLiveData().observe(this, {

            myDisplayAdapter.submitList(it)

        })
    }
}