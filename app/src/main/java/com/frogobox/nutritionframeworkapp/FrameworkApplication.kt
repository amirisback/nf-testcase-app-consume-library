package com.frogobox.nutritionframeworkapp

import android.app.Application
import com.frogobox.nutritionframeworkapp.di.repositoryModule
import com.frogobox.nutritionframeworkapp.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

/*
 * Created by faisalamir on 06/01/22
 * nf-testcase-app-consume-library
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2022 FrogoBox Inc.
 * All rights reserved
 *
 */
class FrameworkApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@FrameworkApplication)
            androidLogger(Level.NONE)
            modules(listOf(repositoryModule, viewModelModule))
        }
    }
}