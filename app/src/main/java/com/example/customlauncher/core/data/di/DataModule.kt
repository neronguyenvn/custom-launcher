package com.example.customlauncher.core.data.di

import com.example.customlauncher.core.data.AppRepository
import com.example.customlauncher.core.data.repository.OfflineFirstAppRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    @Singleton
    abstract fun bindsApplicationRepository(
        appRepo: OfflineFirstAppRepository
    ): AppRepository
}
