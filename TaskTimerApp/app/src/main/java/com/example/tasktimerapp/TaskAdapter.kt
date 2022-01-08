package com.example.tasktimerapp

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tasktimerapp.database.Task
import com.example.tasktimerapp.databinding.RvrowBinding

class TaskAdapter(var list: ArrayList<Task>, private val activity: Activity): RecyclerView.Adapter<TaskAdapter.HolderAdapter>(){
    class HolderAdapter(val binding: RvrowBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderAdapter {
        return HolderAdapter(RvrowBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: HolderAdapter, position: Int) {
        val item = list[position]
        holder.binding.apply {

        }

        holder.binding.taskRow.setOnClickListener {
        }
    }

    override fun getItemCount() = list.size

    @SuppressLint("NotifyDataSetChanged")
    fun updateRecyclerView(newList: ArrayList<Task>){
        this.list = newList
        notifyDataSetChanged()
    }


}