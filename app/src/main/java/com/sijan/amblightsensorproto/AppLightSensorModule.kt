package com.sijan.amblightsensorproto

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppLightSensorModule {

    @Provides
    @Singleton
    fun provideLightSensor(app:Application):MeasurableSensor{
        return LightSensor(app)
    }
}