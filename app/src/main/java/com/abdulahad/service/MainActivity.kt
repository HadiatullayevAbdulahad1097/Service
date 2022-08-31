package com.abdulahad.service

import android.app.job.JobInfo
import android.app.job.JobScheduler
import android.content.ComponentName
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abdulahad.service.Service.MediaService
import com.abdulahad.service.Service.MyJobService
import com.abdulahad.service.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//
//        binding.btnStart.setOnClickListener {
//            startService(Intent(this,MediaService::class.java))
//        }
//        binding.btnStop.setOnClickListener {
//            stopService(Intent(this,MediaService::class.java))
//        }

        val jobScheduler = getSystemService(JOB_SCHEDULER_SERVICE) as JobScheduler
        val jobInfo = JobInfo.Builder(1, ComponentName(this,MyJobService::class.java))
        val job = jobInfo.setMinimumLatency(1)
            .setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY)
            .setOverrideDeadline(60000)
            .build()
        binding.btnStart.setOnClickListener {
            jobScheduler.schedule(job)
        }
        binding.btnStop.setOnClickListener {
            jobScheduler.cancel(1)
        }
    }
}