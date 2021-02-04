package com.ashok.databindingforrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ashok.databindingforrecycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dataBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(dataBinding.root)


        val personAdapter = PersonAdapter()
        dataBinding.rcv.layoutManager = LinearLayoutManager(this)
        dataBinding.rcv.adapter = personAdapter
        //
        personAdapter.setData(TestData.dummyData())

    }
}