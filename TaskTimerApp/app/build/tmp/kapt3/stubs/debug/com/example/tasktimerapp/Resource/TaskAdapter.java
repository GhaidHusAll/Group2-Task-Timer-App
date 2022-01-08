package com.example.tasktimerapp.Resource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0017J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0016\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lcom/example/tasktimerapp/Resource/TaskAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/tasktimerapp/Resource/TaskAdapter$HolderAdapter;", "list", "", "Lcom/example/tasktimerapp/Model/Task;", "activity", "Landroid/app/Activity;", "(Ljava/util/List;Landroid/app/Activity;)V", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateRecyclerView", "newList", "HolderAdapter", "app_debug"})
public final class TaskAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.tasktimerapp.Resource.TaskAdapter.HolderAdapter> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.tasktimerapp.Model.Task> list;
    private final android.app.Activity activity = null;
    
    public TaskAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.tasktimerapp.Model.Task> list, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.tasktimerapp.Model.Task> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.tasktimerapp.Model.Task> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.tasktimerapp.Resource.TaskAdapter.HolderAdapter onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.tasktimerapp.Resource.TaskAdapter.HolderAdapter holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void updateRecyclerView(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.tasktimerapp.Model.Task> newList) {
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