package com.example.tasktimerapp.Resource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\'B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0014H\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014H\u0016J\u0018\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020$H\u0002J\u0014\u0010&\u001a\u00020\u001a2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fR\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006("}, d2 = {"Lcom/example/tasktimerapp/Resource/HomeRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/tasktimerapp/Resource/HomeRecyclerView$ItemViewHolder;", "application", "Landroid/app/Application;", "viewFragment", "Lcom/example/tasktimerapp/fragments/HomeScreenFragment;", "(Landroid/app/Application;Lcom/example/tasktimerapp/fragments/HomeScreenFragment;)V", "taskViewModel", "Lcom/example/tasktimerapp/ViewModel/TaskViewModel;", "getTaskViewModel", "()Lcom/example/tasktimerapp/ViewModel/TaskViewModel;", "taskViewModel$delegate", "Lkotlin/Lazy;", "tasks", "", "Lcom/example/tasktimerapp/database/Task;", "getViewFragment", "()Lcom/example/tasktimerapp/fragments/HomeScreenFragment;", "getItemCount", "", "getTotalFromString", "", "oldString", "newString", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "restartTimer", "task", "chronometer", "Landroid/widget/Chronometer;", "stopTimer", "update", "ItemViewHolder", "app_debug"})
public final class HomeRecyclerView extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.tasktimerapp.Resource.HomeRecyclerView.ItemViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.tasktimerapp.fragments.HomeScreenFragment viewFragment = null;
    private java.util.List<com.example.tasktimerapp.database.Task> tasks;
    private final kotlin.Lazy taskViewModel$delegate = null;
    
    public HomeRecyclerView(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.example.tasktimerapp.fragments.HomeScreenFragment viewFragment) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tasktimerapp.fragments.HomeScreenFragment getViewFragment() {
        return null;
    }
    
    private final com.example.tasktimerapp.ViewModel.TaskViewModel getTaskViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.tasktimerapp.Resource.HomeRecyclerView.ItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.tasktimerapp.Resource.HomeRecyclerView.ItemViewHolder holder, int position) {
    }
    
    private final void stopTimer(com.example.tasktimerapp.database.Task task, android.widget.Chronometer chronometer) {
    }
    
    private final void restartTimer(com.example.tasktimerapp.database.Task task, android.widget.Chronometer chronometer) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.tasktimerapp.database.Task> tasks) {
    }
    
    private final java.lang.String getTotalFromString(java.lang.String oldString, java.lang.String newString) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/tasktimerapp/Resource/HomeRecyclerView$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/tasktimerapp/databinding/ItemRowBinding;", "(Lcom/example/tasktimerapp/databinding/ItemRowBinding;)V", "getBinding", "()Lcom/example/tasktimerapp/databinding/ItemRowBinding;", "app_debug"})
    public static final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.tasktimerapp.databinding.ItemRowBinding binding = null;
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.tasktimerapp.databinding.ItemRowBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.tasktimerapp.databinding.ItemRowBinding getBinding() {
            return null;
        }
    }
}