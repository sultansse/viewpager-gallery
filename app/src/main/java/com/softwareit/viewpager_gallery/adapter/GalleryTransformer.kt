package com.softwareit.viewpager_gallery.adapter

import android.view.View
import androidx.viewpager2.widget.ViewPager2.PageTransformer
import kotlin.math.abs

class GalleryTransformer : PageTransformer {
    private val minScale = 0.75f

    override fun transformPage(page: View, position: Float) {
        val width = page.width

        when {
            position < -1 -> page.alpha = 0f

            position <= 0 -> {
                page.alpha = 1f
                page.translationX = 0f
                page.scaleX = 1f
                page.scaleY = 1f
                page.elevation = 1f
            }

            position <= 1 -> {
                page.alpha = 1 - position
                page.translationX = width * -position

                val scale = minScale + (1 - minScale) * (1 - abs(position))
                page.scaleX = scale
                page.scaleY = scale
                page.elevation = 0f
            }

            else -> page.alpha = 0f
        }
    }
}