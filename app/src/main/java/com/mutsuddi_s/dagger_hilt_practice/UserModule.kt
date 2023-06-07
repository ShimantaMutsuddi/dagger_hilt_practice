package com.mutsuddi_s.dagger_hilt_practice


import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(ActivityComponent::class)
class UserModule {

    @Provides

    fun providesUserRepo() : UserRepo{
        return  FirebaseRepo( )
    }
}