package com.example.tasktimerapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tasktimerapp.R
import com.example.tasktimerapp.Resource.TaskAdapter
import com.example.tasktimerapp.ViewModel.TaskViewModel


class ProgressFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_prograss, container, false)

        val taskViewModel by lazy { TaskViewModel(requireActivity().application) }

        val rvMain = view.findViewById<RecyclerView>(R.id.rvMain)
        val adapter = TaskAdapter(requireActivity().application, requireContext())
        rvMain.adapter = adapter
        rvMain.layoutManager = LinearLayoutManager(requireContext())

        taskViewModel.getAllTasks().observe(viewLifecycleOwner, { allTasks ->
            adapter.update(allTasks)
        })

        return view
    }


}