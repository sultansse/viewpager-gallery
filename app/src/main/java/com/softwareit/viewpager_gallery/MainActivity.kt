package com.softwareit.viewpager_gallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.softwareit.viewpager_gallery.adapter.GalleryTransformer
import com.softwareit.viewpager_gallery.adapter.GalleryViewPagerAdapter
import com.softwareit.viewpager_gallery.data.LocalDataSource
import com.google.android.material.tabs.TabLayoutMediator
import com.softwareit.viewpager_gallery.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val pictureList = LocalDataSource.pictureList
        val adapter = GalleryViewPagerAdapter(this, pictureList)

        binding.viewPager.adapter = adapter
        binding.viewPager.currentItem = pictureList.size / 2
        binding.viewPager.setPageTransformer(GalleryTransformer())
        binding.viewPager.offscreenPageLimit = 1

        TabLayoutMediator(binding.tabLayout, binding.viewPager)  { _, _ -> }.attach()
    }
}