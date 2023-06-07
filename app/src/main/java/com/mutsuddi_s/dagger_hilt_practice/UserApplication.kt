package com.mutsuddi_s.dagger_hilt_practice

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class UserApplication : Application() {

   /* @Inject
    lateinit var userRepo: UserRepo*/
    override fun onCreate() {
        super.onCreate()

        //oncreate call hole injectwala field initialize hoye jaabe

        //userRepo.saveUser("mutsuddi004@gmail.com","123456")


    }
}