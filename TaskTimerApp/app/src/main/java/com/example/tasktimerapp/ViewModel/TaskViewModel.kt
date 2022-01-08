package com.example.tasktimerapp.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.task_timer_app.Repository.Repository
import com.example.tasktimerapp.database.DatabaseApp
import com.example.tasktimerapp.database.Task
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class TaskViewModel(application: Application) : AndroidViewModel(application) {

    private val readAllTasks: LiveData<List<Task>>
    private val repository: Repository

    init {
        val taskDao = DatabaseApp.getDatabase(application).dao()
        repository = Repository(taskDao)
        readAllTasks = repository.readAllTasks
    }

    fun getAllTasks(): LiveData<List<Task>> {
        return readAllTasks
    }

    fun addTask(task: Task) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addTask(task)
        }
    }

    fun updateTask(task: Task) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateTask(task)
        }
    }

    fun deleteTask(task: Task) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteTask(task)
        }
    }

    fun deactivateAllTasks() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deactivateAllTasks()
        }
    }



}