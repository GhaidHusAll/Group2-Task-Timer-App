package com.example.tasktimerapp

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import com.example.tasktimerapp.ViewModel.TaskViewModel
import com.example.tasktimerapp.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    private val homeScreenFragment = com.example.tasktimerapp.fragments.HomeScreenFragment()
    private val progressFragment = com.example.tasktimerapp.fragments.PrograssFragment()
    private val addTaskFragment = com.example.tasktimerapp.fragments.AddTaskFragment()
    lateinit var bottomNav : BottomNavigationView
//ghassan
    private val taskViewModel by lazy { TaskViewModel(application) }
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        replaceFragment(homeScreenFragment)



        bottomNav = findViewById(R.id.bottom_navigation)
        bottomNav.setOnNavigationItemSelectedListener { item ->
            when(item.itemId){
                R.id.ic_home -> {replaceFragment(homeScreenFragment)}
                R.id.ic_progress -> {replaceFragment(progressFragment)}
                R.id.ic_add -> {replaceFragment(addTaskFragment)}
            }
            true
        } //setOnNavigationItemSelectedListener

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPreferences = this.getSharedPreferences(
            getString(R.string.preference_file_key), MODE_PRIVATE
        )
       timer()

    }



    private fun replaceFragment (fragment : Fragment){
        if (fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container_view_tag, fragment)
            transaction.commit()
        }
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