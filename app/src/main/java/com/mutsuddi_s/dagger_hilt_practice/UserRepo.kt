package com.mutsuddi_s.dagger_hilt_practice

import android.util.Log
import javax.inject.Inject

private const val TAG = "UserRepoo"
class UserRepo @Inject constructor(val loggerService: LoggerService) {
    fun saveUser(name:String,password:String)
    {
        loggerService.log("User saved in d  b")
    }
}