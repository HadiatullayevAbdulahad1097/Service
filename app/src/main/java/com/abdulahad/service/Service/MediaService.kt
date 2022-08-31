package com.abdulahad.service.Service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import java.security.Provider

class MediaService : Service() {
    private val TAG = "MediaService"
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(TAG, "onStartCommand: onStartCommand")
        return super.onStartCommand(intent, flags, startId)
    }
    override fun onBind(p0: Intent?): IBinder? {
        Log.d(TAG, "onBind: onBind)")
        return null
    }

    override fun onUnbind(intent: Intent?): Boolean {
        Log.d(TAG, "onUnbind: onUnbind")
        return super.onUnbind(intent)
    }

    override fun onCreate() {
        Log.d(TAG, "onCreate: onCreate")
        super.onCreate()
    }

    override fun onRebind(intent: Intent?) {
        Log.d(TAG, "onRebind: onRebind")
        super.onRebind(intent)
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy: onDestroy") 
        super.onDestroy()
    }
}