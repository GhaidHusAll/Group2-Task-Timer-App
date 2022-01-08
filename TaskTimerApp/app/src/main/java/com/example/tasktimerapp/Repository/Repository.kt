package com.example.task_timer_app.Repository

import androidx.lifecycle.LiveData
import com.example.tasktimerapp.database.Task
import com.example.tasktimerapp.database.TaskDao


class Repository(private val taskDao: TaskDao) {

    val readAllTasks: LiveData<List<Task>> = taskDao.getTasks()

    suspend fun addTask(task: Task) {
        taskDao.addTask(task)
    }

    suspend fun updateTask(task: Task) {
        taskDao.updateTask(task)
    }

    suspend fun deleteTask(task: Task) {
        taskDao.deleteTask(task)
    }


    fun deactivateAllTasks() {
        taskDao.deactivateAllTasks()
    }

}