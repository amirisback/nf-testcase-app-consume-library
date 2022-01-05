package com.frogobox.nutritionframeworkapp

import android.os.Bundle
import com.frogobox.nutritionframework.core.NutriActivity
import com.frogobox.nutritionframeworkapp.databinding.ActivityMainBinding

class MainActivity : NutriActivity<ActivityMainBinding>() {

    override fun setupViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {
    }

    override fun setupUI(savedInstanceState: Bundle?) {
    }

}