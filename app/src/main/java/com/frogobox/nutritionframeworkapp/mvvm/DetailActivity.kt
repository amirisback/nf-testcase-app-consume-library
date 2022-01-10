package com.frogobox.nutritionframeworkapp.mvvm

import android.os.Bundle
import com.bumptech.glide.Glide
import com.frogobox.nutritioncore.model.news.Article
import com.frogobox.nutritionframework.core.NutriActivity
import com.frogobox.nutritionframeworkapp.databinding.ActivityDetailBinding

class DetailActivity : NutriActivity<ActivityDetailBinding>() {

    companion object {
        const val EXTRA_DATA = "EXTRA_DATA"
    }

    private val extraData : Article by lazy {
        baseGetExtraData(EXTRA_DATA)
    }

    override fun setupViewBinding(): ActivityDetailBinding {
        return ActivityDetailBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {
    }

    override fun setupUI(savedInstanceState: Bundle?) {
        extraData.title?.let { setupDetailActivity(it) }
        binding.apply {
            tvTitle.text = extraData.title
            tvOverview.text = extraData.content
            Glide.with(this@DetailActivity).load(extraData.urlToImage).into(ivPoster)
        }
    }

}