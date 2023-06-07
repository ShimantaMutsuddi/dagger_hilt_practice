package com.mutsuddi_s.dagger_hilt_practice

import android.util.Log
import javax.inject.Inject

private const val TAG = "UserRepoo"

interface UserRepo{
    fun saveUser(name:String,password:String)
}
class SqlRepo  : UserRepo{
    override fun saveUser(name:String,password:String)
    {
        Log.d(TAG, "User saved in db")
    }
}

class FirebaseRepo : UserRepo
{
    override fun saveUser(name: String, password: String) {
        Log.d(TAG, "User saved in firebase")
    }

}