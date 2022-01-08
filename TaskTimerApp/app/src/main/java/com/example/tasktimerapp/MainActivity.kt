package com.example.tasktimerapp

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.tasktimerapp.Resource.TaskAdapter
import com.example.tasktimerapp.ViewModel.TaskViewModel
import com.example.tasktimerapp.database.Task
import com.example.tasktimerapp.databinding.ActivityMainBinding
import com.example.tasktimerapp.fragments.*
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    private val homeScreenFragment = HomeScreenFragment()
    private val progressFragment = ProgressFragment()
    private val addTaskFragment = AddTaskFragment()
    private val instructionFragment = InstructionFragment()

    lateinit var bottomNav : BottomNavigationView


    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(homeScreenFragment)



        bottomNav = findViewById(R.id.bottom_navigation)
        bottomNav.setOnNavigationItemSelectedListener { item ->
            when(item.itemId){
                R.id.ic_home -> {replaceFragment(homeScreenFragment)}
                R.id.ic_progress -> {replaceFragment(progressFragment)}
                R.id.ic_add -> {replaceFragment(addTaskFragment)}
                R.id.ic_info -> {replaceFragment(instructionFragment)}

            }
            true
        } //setOnNavigationItemSelectedListener


        sharedPreferences = this.getSharedPreferences(
            getString(R.string.preference_file_key), MODE_PRIVATE
        )

    }



    private fun replaceFragment (fragment : Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container_view_tag, fragment)
        transaction.commit()
    }
    //test
    private fun timer(){
        var time = 50000L
        val timer = object: CountDownTimer(time, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                println("-----------long   ${time/50000L}")
                val percentage = (time.toDouble() / 50000.0) * 100
                println("-----------percentage   $percentage")
                time -= 1000
                println("-----------$time")
                //binding.timeProgress.progress = percentage.toInt()
            }

            override fun onFinish() {
              //  binding.timeProgress.progress = 0
            }
        }
        timer.start()

    }



}