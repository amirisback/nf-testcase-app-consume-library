package com.frogobox.nutritionframeworkapp

import android.os.Bundle
import com.frogobox.nutritionframework.core.NutriActivity
import com.frogobox.nutritionframeworkapp.databinding.ActivityDetailBinding

class DetailActivity : NutriActivity<ActivityDetailBinding>() {

    override fun setupViewBinding(): ActivityDetailBinding {
        return ActivityDetailBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {
    }

    override fun setupUI(savedInstanceState: Bundle?) {
    }

}