package com.abdulahad.service.Service

import android.app.job.JobParameters
import android.app.job.JobService
import android.util.Log

class MyJobService : JobService() {
    private val TAG = "MyJobService"
    override fun onStartJob(p0: JobParameters?): Boolean {
        Log.d(TAG, "onStartJob: ")
        return true
    }

    override fun onStopJob(p0: JobParameters?): Boolean {
        Log.d(TAG, "onStopJob: ")
        return true
    }
}