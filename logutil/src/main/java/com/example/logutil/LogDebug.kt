package com.example.logutil

import android.util.Log

/**
 * Created by aldrichmascarenhas on 06/12/2017.
 */
class LogDebug {

    private val tag : String = "LogDebug"

    fun d (messsage : String){
        Log.d(tag, messsage)
    }
}