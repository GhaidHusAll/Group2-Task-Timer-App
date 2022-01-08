package com.example.tasktimerapp.Resource

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tasktimerapp.database.Task
import com.example.tasktimerapp.databinding.RvrowBinding

class TaskAdapter(var list: List<Task>, private val activity: Activity): RecyclerView.Adapter<TaskAdapter.HolderAdapter>(){
    class HolderAdapter(val binding: RvrowBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderAdapter {
        return HolderAdapter(RvrowBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: HolderAdapter, position: Int) {
        val item = list[position]
        holder.binding.apply {
            tvTitle.text = item.task
            tvDes.text = item.description
//            tvTimer.text = "0:${(item.time.toDouble() / 1000.0).toInt()}"
//            timeProgress.progress = ((item.time.toDouble() / 60000.0) * 100).toInt()
        }

        holder.binding.taskRow.setOnClickListener {
        }
    }

    override fun getItemCount() = list.size

    @SuppressLint("NotifyDataSetChanged")
    fun updateRecyclerView(newList: List<Task>){
        this.list = newList
        notifyDataSetChanged()
    }


}