package com.example.tasktimerapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.tasktimerapp.ViewModel.TaskViewModel
import com.example.tasktimerapp.database.Task
import com.example.tasktimerapp.fragments.AddTaskFragment
import com.example.tasktimerapp.fragments.HomeScreenFragment

class AddActivity : AppCompatActivity() {
    private val addTaskFragment = AddTaskFragment()
    private val vm by lazy { ViewModelProvider(this)[TaskViewModel::class.java] }


    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        val btn = addTaskFragment.view?.findViewById<Button>(R.id.btnAdd)
        val taskText = addTaskFragment.view?.findViewById<EditText>(R.id.etTask)
        val descriptionText = addTaskFragment.view?.findViewById<EditText>(R.id.etDescription)
        btn?.setOnClickListener {
            if (taskText!!.text.isNotEmpty()&&descriptionText!!.text.isNotEmpty()){
                add(taskText,descriptionText)
            }else {
                Toast.makeText(this,"Please fill all the Fields",Toast.LENGTH_LONG).show()
            }
        }

    }
    private fun add(taskText: EditText,descriptionText: EditText){
        vm.addTask(Task(0,taskText.text.toString(),descriptionText.text.toString(),60000L,false))
        Toast.makeText(this,"new Task added Successfully",Toast.LENGTH_LONG).show()
        taskText.text.clear()
        descriptionText.text.clear()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container_view_tag, HomeScreenFragment())
        transaction.commit()

    }
}