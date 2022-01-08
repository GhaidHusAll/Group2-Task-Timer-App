package com.example.tasktimerapp.fragments

import android.content.SharedPreferences
import android.os.Bundle
import android.os.SystemClock
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tasktimerapp.MainActivity
import com.example.tasktimerapp.R
import com.example.tasktimerapp.Resource.HomeRecyclerView
import com.example.tasktimerapp.ViewModel.TaskViewModel
import com.example.tasktimerapp.database.Task

class HomeScreenFragment : Fragment() {


    private lateinit var sharedPreferences: SharedPreferences
    lateinit var adapter: HomeRecyclerView
    lateinit var mainTitle: TextView
    lateinit var mainTimer: Chronometer
    lateinit var mainDescription: TextView
    private var tasks = listOf<Task>()
    private val taskViewModel by lazy { TaskViewModel(requireActivity().application) }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home_screen, container, false)

        taskViewModel.deactivateAllTasks()

        mainTitle = view.findViewById(R.id.tvTotalmain)
        mainDescription = view.findViewById(R.id.tvDescriptionmain)
        mainTimer = view.findViewById(R.id.tvTimemain)

        val rvMain = view.findViewById<RecyclerView>(R.id.mainRecyclerView)
        adapter = HomeRecyclerView(requireActivity().application, this)
        rvMain.adapter = adapter
        rvMain.layoutManager = LinearLayoutManager(requireContext()).apply {
            recycleChildrenOnDetach = false
        }

        taskViewModel.getAllTasks().observe(viewLifecycleOwner, { allTasks ->
            kotlin.run {
                adapter.update(allTasks)
                tasks = allTasks
            }
        })

        return view
    }


    override fun onStop() {
        super.onStop()
        // stop active timer before user moves to other fragment
        if (didUserMove()) {
            stopActiveTimer()
            updateMoveState()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        // stop active timer before app close
        stopActiveTimer()
    }

    private fun didUserMove(): Boolean {
        sharedPreferences = requireActivity().getSharedPreferences(
            getString(R.string.preference_file_key), AppCompatActivity.MODE_PRIVATE
        )
        return sharedPreferences.getBoolean("userMoved", false)
    }

    private fun updateMoveState() {
        sharedPreferences = requireActivity().getSharedPreferences(
            getString(R.string.preference_file_key), AppCompatActivity.MODE_PRIVATE
        )
        with(sharedPreferences.edit()) {
            putBoolean("userMoved", false)
            apply()
        }
    }

    private fun stopActiveTimer() {
        for (task in tasks) {
            if (task.active) {
                Toast.makeText(requireContext(), "Timer Paused", Toast.LENGTH_LONG).show()
                task.timer = mainTimer.text.toString()
                mainTimer.stop()
                task.pauseOffset = SystemClock.elapsedRealtime() - mainTimer.base
                task.active = false
                task.isClicked = false
                taskViewModel.updateTask(task)
            }
        }
    }

}