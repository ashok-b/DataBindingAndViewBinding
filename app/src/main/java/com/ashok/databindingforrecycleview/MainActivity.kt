package com.ashok.databindingforrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.ashok.databindingforrecycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), PersonAdapter.PersonItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dataBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(dataBinding.root)


        val personAdapter = PersonAdapter(this)
        dataBinding.rcv.layoutManager = LinearLayoutManager(this)
        dataBinding.rcv.adapter = personAdapter
        //
        personAdapter.setData(TestData.dummyData())

    }

    override fun onPersonItemClicked(personInfo: PersonInfo) {
        Toast.makeText(this,"Clicked on ${personInfo.name}",Toast.LENGTH_LONG).show()
    }
}