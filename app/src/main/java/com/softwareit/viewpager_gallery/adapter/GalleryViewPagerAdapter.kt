package com.softwareit.viewpager_gallery.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.softwareit.viewpager_gallery.PictureFragment
import com.softwareit.viewpager_gallery.model.Picture

class GalleryViewPagerAdapter(
    fragmentActivity: FragmentActivity,
    private val pictureList: List<Picture>,
) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = pictureList.size

    override fun createFragment(position: Int): Fragment {
        val picture = pictureList[position]
        return PictureFragment.newInstance(picture)
    }
}