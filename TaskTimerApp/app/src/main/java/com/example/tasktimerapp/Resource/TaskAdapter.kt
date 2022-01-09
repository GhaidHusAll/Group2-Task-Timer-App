package com.example.tasktimerapp.Resource

import android.annotation.SuppressLint
import android.app.Activity
import android.app.AlertDialog
import android.app.Application
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.tasktimerapp.ViewModel.TaskViewModel
import com.example.tasktimerapp.database.Task
import com.example.tasktimerapp.databinding.RvrowBinding


class TaskAdapter(application: Application, private val context: Context) :
    RecyclerView.Adapter<TaskAdapter.HolderAdapter>() {
    class HolderAdapter(val binding: RvrowBinding) : RecyclerView.ViewHolder(binding.root)

    private var tasks = emptyList<Task>()
    private val taskViewModel by lazy { TaskViewModel(application) }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderAdapter {
        return HolderAdapter(
            RvrowBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: HolderAdapter, position: Int) {
        val task = tasks[position]

        holder.binding.apply {

            tvTotalTitle.text = task.task
            tvTotalTime.text = task.totalTime
            tvTotatlDescription.text = task.description

            llDescriptionHolder.isVisible = false

            ivTotalMore.setOnClickListener {
                llDescriptionHolder.isVisible = !llDescriptionHolder.isVisible
            }

            btnUpdate.setOnClickListener { updateDialog(task) }
            btnDelete.setOnClickListener { deleteDialog(task) }
        }
    }


    override fun getItemCount() = tasks.size


    fun update(tasks: List<Task>) {
        this.tasks = tasks
        notifyDataSetChanged()
    }


    private fun updateDialog(task: Task) {
        val layout = LinearLayout(context)
        layout.orientation = LinearLayout.VERTICAL

        val taskTitle = EditText(context)
        val taskDescription = EditText(context)
        taskTitle.setText(task.task)
        taskDescription.setText(task.description)

        layout.addView(taskTitle)
        layout.addView(taskDescription)

        val dialog = AlertDialog.Builder(context)
            .setTitle("Update Task")
            .setView(layout)
            .setPositiveButton("Update") { _, _ ->

                if (taskTitle.text.isNotEmpty() && taskDescription.text.isNotEmpty()){
                    task.task = taskTitle.text.toString()
                    task.description = taskDescription.text.toString()
                    taskViewModel.updateTask(task)
                }else {
                    Toast.makeText(context,"Please fill all the Fields", Toast.LENGTH_LONG).show()
                }
            }
            .setNegativeButton("Cancel") { dialogFace, _ -> dialogFace.cancel() }
            .create()
        dialog.show()
    }

    private fun deleteDialog(task: Task) {
        val dialog = AlertDialog.Builder(context)
            .setTitle("Delete Task")
            .setMessage("Do You Want To Delete This Task?")
            .setPositiveButton("yes") { _, _ ->
                taskViewModel.deleteTask(task)
            }
            .setNegativeButton("no") { dialogFace, _ -> dialogFace.cancel() }
            .create()
        dialog.show()
    }


}