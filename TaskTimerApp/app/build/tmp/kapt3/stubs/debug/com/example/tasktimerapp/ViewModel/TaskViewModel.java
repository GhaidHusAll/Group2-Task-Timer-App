package com.example.tasktimerapp.ViewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/tasktimerapp/ViewModel/TaskViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "readAllTasks", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/tasktimerapp/database/Task;", "repository", "Lcom/example/task_timer_app/Repository/Repository;", "addTask", "", "task", "deleteTask", "getAllTasks", "updateTask", "app_debug"})
public final class TaskViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.LiveData<java.util.List<com.example.tasktimerapp.database.Task>> readAllTasks = null;
    private final com.example.task_timer_app.Repository.Repository repository = null;
    
    public TaskViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.tasktimerapp.database.Task>> getAllTasks() {
        return null;
    }
    
    public final void addTask(@org.jetbrains.annotations.NotNull()
    com.example.tasktimerapp.database.Task task) {
    }
    
    public final void updateTask(@org.jetbrains.annotations.NotNull()
    com.example.tasktimerapp.database.Task task) {
    }
    
    public final void deleteTask(@org.jetbrains.annotations.NotNull()
    com.example.tasktimerapp.database.Task task) {
    }
}