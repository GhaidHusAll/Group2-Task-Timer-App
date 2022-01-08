package com.example.tasktimerapp.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010)\u001a\u00020*H\u0002J&\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u000204H\u0016J\b\u00106\u001a\u000204H\u0002J\b\u00107\u001a\u000204H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020$X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u00068"}, d2 = {"Lcom/example/tasktimerapp/fragments/HomeScreenFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/example/tasktimerapp/Resource/HomeRecyclerView;", "getAdapter", "()Lcom/example/tasktimerapp/Resource/HomeRecyclerView;", "setAdapter", "(Lcom/example/tasktimerapp/Resource/HomeRecyclerView;)V", "mainDescription", "Landroid/widget/TextView;", "getMainDescription", "()Landroid/widget/TextView;", "setMainDescription", "(Landroid/widget/TextView;)V", "mainTimer", "Landroid/widget/Chronometer;", "getMainTimer", "()Landroid/widget/Chronometer;", "setMainTimer", "(Landroid/widget/Chronometer;)V", "mainTitle", "getMainTitle", "setMainTitle", "sharedPreferences", "Landroid/content/SharedPreferences;", "taskViewModel", "Lcom/example/tasktimerapp/ViewModel/TaskViewModel;", "getTaskViewModel", "()Lcom/example/tasktimerapp/ViewModel/TaskViewModel;", "taskViewModel$delegate", "Lkotlin/Lazy;", "tasks", "", "Lcom/example/tasktimerapp/database/Task;", "timeProgress", "Lme/zhanghai/android/materialprogressbar/MaterialProgressBar;", "getTimeProgress", "()Lme/zhanghai/android/materialprogressbar/MaterialProgressBar;", "setTimeProgress", "(Lme/zhanghai/android/materialprogressbar/MaterialProgressBar;)V", "didUserMove", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "", "onStop", "stopActiveTimer", "updateMoveState", "app_debug"})
public final class HomeScreenFragment extends androidx.fragment.app.Fragment {
    private android.content.SharedPreferences sharedPreferences;
    public com.example.tasktimerapp.Resource.HomeRecyclerView adapter;
    public android.widget.TextView mainTitle;
    public android.widget.Chronometer mainTimer;
    public me.zhanghai.android.materialprogressbar.MaterialProgressBar timeProgress;
    public android.widget.TextView mainDescription;
    private java.util.List<com.example.tasktimerapp.database.Task> tasks;
    private final kotlin.Lazy taskViewModel$delegate = null;
    
    public HomeScreenFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tasktimerapp.Resource.HomeRecyclerView getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.example.tasktimerapp.Resource.HomeRecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getMainTitle() {
        return null;
    }
    
    public final void setMainTitle(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Chronometer getMainTimer() {
        return null;
    }
    
    public final void setMainTimer(@org.jetbrains.annotations.NotNull()
    android.widget.Chronometer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final me.zhanghai.android.materialprogressbar.MaterialProgressBar getTimeProgress() {
        return null;
    }
    
    public final void setTimeProgress(@org.jetbrains.annotations.NotNull()
    me.zhanghai.android.materialprogressbar.MaterialProgressBar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getMainDescription() {
        return null;
    }
    
    public final void setMainDescription(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    private final com.example.tasktimerapp.ViewModel.TaskViewModel getTaskViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final boolean didUserMove() {
        return false;
    }
    
    private final void updateMoveState() {
    }
    
    private final void stopActiveTimer() {
    }
}