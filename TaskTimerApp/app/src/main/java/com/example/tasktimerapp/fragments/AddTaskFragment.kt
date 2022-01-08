package com.example.tasktimerapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.tasktimerapp.R
import com.example.tasktimerapp.ViewModel.TaskViewModel
import com.example.tasktimerapp.database.Task

class AddTaskFragment : Fragment() {
    private val vm by lazy { ViewModelProvider(this)[TaskViewModel::class.java] }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add_task, container, false)
        val btn = view.findViewById<Button>(R.id.btnAdd)
        val taskText = view.findViewById<EditText>(R.id.etTask)
        val descriptionText = view.findViewById<EditText>(R.id.etDescription)
        btn?.setOnClickListener {
            if (taskText!!.text.isNotEmpty()&&descriptionText!!.text.isNotEmpty()){
                add(taskText,descriptionText,view)
            }else {
                Toast.makeText(view.context,"Please fill all the Fields", Toast.LENGTH_LONG).show()
            }
        }
        return view
    }

    private fun add(taskText: EditText,descriptionText: EditText,view: View){

        vm.addTask(Task(0,taskText.text.toString(),descriptionText.text.toString(),60000L,false))
        Toast.makeText(view.context,"new Task added Successfully",Toast.LENGTH_LONG).show()
        taskText.text.clear()
        descriptionText.text.clear()

    }
}