package com.example.tasktimerapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Task::class],version = 2,exportSchema = false)
abstract class DatabaseApp: RoomDatabase() {
    abstract fun dao(): TaskDao

    companion object{
        //visible to other threads
        @Volatile
        private var INSTANCE: DatabaseApp? = null

        fun getDatabase(context: Context): DatabaseApp{
            val checkInstance = INSTANCE
            if (checkInstance != null){
                return checkInstance
            }
            //protection on multiple threads
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DatabaseApp::class.java,
                    "task"
                )//destroy old database if versions changes
                    .fallbackToDestructiveMigration().build()
                INSTANCE = instance
                return instance
            }
        }
    }
}