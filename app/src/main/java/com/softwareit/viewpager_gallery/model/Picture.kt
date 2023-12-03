package com.softwareit.viewpager_gallery.model

import androidx.annotation.DrawableRes

data class Picture(
    val id: Long,
    @DrawableRes val image: Int,
)
