package com.example.tasktimerapp.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Task(
    @PrimaryKey(autoGenerate = true)
    var pk: Int,
    var task: String,
    var description : String,
    var timer: String,
    var totalTime: String,
    var active: Boolean,
    var isClicked: Boolean,
    var pauseOffset: Long
)
