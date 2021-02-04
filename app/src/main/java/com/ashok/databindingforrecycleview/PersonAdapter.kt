package com.ashok.databindingforrecycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView.*
import com.ashok.databindingforrecycleview.databinding.RowItemBinding
import com.bumptech.glide.Glide

class PersonAdapter(private val mListener: PersonItemClickListener) : Adapter<PersonAdapter.PersonHolder>() {
    var dataSet = mutableListOf<PersonInfo>()

    fun setData(inputDataSet : ArrayList<PersonInfo>){
        dataSet.addAll(inputDataSet)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonHolder {
        val rowItemBinding = DataBindingUtil.inflate<RowItemBinding>(LayoutInflater.from(parent.context), R.layout.row_item, parent, false)
        return PersonHolder(rowItemBinding)
    }

    override fun getItemCount(): Int {
       return dataSet.size
    }

    override fun onBindViewHolder(holder: PersonHolder, position: Int) {
        val data  =  dataSet[position]
        holder.bind(data)

        holder.rowItemBinding.personItemClick = mListener
        //This is to force bindings to execute right away
        holder.rowItemBinding.executePendingBindings()
    }


    class PersonHolder(val rowItemBinding: RowItemBinding) : ViewHolder(rowItemBinding.root) {

        fun bind(personInfo: PersonInfo) {
            rowItemBinding.person= personInfo
        }
        
    }

    interface PersonItemClickListener {
        fun onPersonItemClicked(personInfo: PersonInfo)
    }

}
