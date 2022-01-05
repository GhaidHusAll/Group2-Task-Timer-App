package com.example.tasktimerapp.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Task(
    @PrimaryKey(autoGenerate = true)
    var pk: Int,
    var userPk: String,
    var task: String,
    var description : String,
    var time: Long,
    var isDone: Boolean
)
