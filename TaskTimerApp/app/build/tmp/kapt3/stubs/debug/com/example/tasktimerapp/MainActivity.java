package com.example.tasktimerapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0010\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\'H\u0002J\u000e\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020*J\b\u0010+\u001a\u00020\"H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001f\u0010\u001b\u00a8\u0006,"}, d2 = {"Lcom/example/tasktimerapp/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "addTaskFragment", "Lcom/example/tasktimerapp/fragments/AddTaskFragment;", "binding", "Lcom/example/tasktimerapp/databinding/ActivityMainBinding;", "bottomNav", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "getBottomNav", "()Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "setBottomNav", "(Lcom/google/android/material/bottomnavigation/BottomNavigationView;)V", "homeScreenFragment", "Lcom/example/tasktimerapp/fragments/HomeScreenFragment;", "myAdapter", "Lcom/example/tasktimerapp/TaskAdapter;", "myList", "", "Lcom/example/tasktimerapp/database/Task;", "progressFragment", "Lcom/example/tasktimerapp/fragments/ProgressFragment;", "sharedPreferences", "Landroid/content/SharedPreferences;", "taskViewModel", "Lcom/example/tasktimerapp/ViewModel/TaskViewModel;", "getTaskViewModel", "()Lcom/example/tasktimerapp/ViewModel/TaskViewModel;", "taskViewModel$delegate", "Lkotlin/Lazy;", "vm", "getVm", "vm$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "replaceFragment", "fragment", "Landroidx/fragment/app/Fragment;", "setRecyclerView", "view", "Landroid/view/View;", "timer", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private final com.example.tasktimerapp.fragments.HomeScreenFragment homeScreenFragment = null;
    private final com.example.tasktimerapp.fragments.ProgressFragment progressFragment = null;
    private final com.example.tasktimerapp.fragments.AddTaskFragment addTaskFragment = null;
    public com.google.android.material.bottomnavigation.BottomNavigationView bottomNav;
    private java.util.List<com.example.tasktimerapp.database.Task> myList;
    private com.example.tasktimerapp.TaskAdapter myAdapter;
    private final kotlin.Lazy vm$delegate = null;
    private final kotlin.Lazy taskViewModel$delegate = null;
    private android.content.SharedPreferences sharedPreferences;
    private com.example.tasktimerapp.databinding.ActivityMainBinding binding;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.bottomnavigation.BottomNavigationView getBottomNav() {
        return null;
    }
    
    public final void setBottomNav(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomnavigation.BottomNavigationView p0) {
    }
    
    private final com.example.tasktimerapp.ViewModel.TaskViewModel getVm() {
        return null;
    }
    
    private final com.example.tasktimerapp.ViewModel.TaskViewModel getTaskViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void replaceFragment(androidx.fragment.app.Fragment fragment) {
    }
    
    private final void timer() {
    }
    
    public final void setRecyclerView(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
}