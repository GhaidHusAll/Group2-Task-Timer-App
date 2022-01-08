package com.example.tasktimerapp.Resource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016J\u0014\u0010\u001d\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/example/tasktimerapp/Resource/TaskAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/tasktimerapp/Resource/TaskAdapter$HolderAdapter;", "application", "Landroid/app/Application;", "context", "Landroid/content/Context;", "(Landroid/app/Application;Landroid/content/Context;)V", "taskViewModel", "Lcom/example/tasktimerapp/ViewModel/TaskViewModel;", "getTaskViewModel", "()Lcom/example/tasktimerapp/ViewModel/TaskViewModel;", "taskViewModel$delegate", "Lkotlin/Lazy;", "tasks", "", "Lcom/example/tasktimerapp/database/Task;", "deleteDialog", "", "task", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "update", "updateDialog", "HolderAdapter", "app_debug"})
public final class TaskAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.tasktimerapp.Resource.TaskAdapter.HolderAdapter> {
    private final android.content.Context context = null;
    private java.util.List<com.example.tasktimerapp.database.Task> tasks;
    private final kotlin.Lazy taskViewModel$delegate = null;
    
    public TaskAdapter(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    private final com.example.tasktimerapp.ViewModel.TaskViewModel getTaskViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.tasktimerapp.Resource.TaskAdapter.HolderAdapter onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.tasktimerapp.Resource.TaskAdapter.HolderAdapter holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.tasktimerapp.database.Task> tasks) {
    }
    
    private final void updateDialog(com.example.tasktimerapp.database.Task task) {
    }
    
    private final void deleteDialog(com.example.tasktimerapp.database.Task task) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/tasktimerapp/Resource/TaskAdapter$HolderAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/tasktimerapp/databinding/RvrowBinding;", "(Lcom/example/tasktimerapp/databinding/RvrowBinding;)V", "getBinding", "()Lcom/example/tasktimerapp/databinding/RvrowBinding;", "app_debug"})
    public static final class HolderAdapter extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.tasktimerapp.databinding.RvrowBinding binding = null;
        
        public HolderAdapter(@org.jetbrains.annotations.NotNull()
        com.example.tasktimerapp.databinding.RvrowBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.tasktimerapp.databinding.RvrowBinding getBinding() {
            return null;
        }
    }
}