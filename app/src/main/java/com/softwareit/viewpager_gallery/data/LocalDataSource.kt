package com.softwareit.viewpager_gallery.data

import com.softwareit.viewpager_gallery.model.Picture
import com.softwareit.viewpager_gallery.R

object LocalDataSource {
    val pictureList = listOf(
        Picture(id = 1, image = R.drawable.ic_nature_1),
        Picture(id = 2, image = R.drawable.ic_nature_2),
        Picture(id = 3, image = R.drawable.ic_nature_3)
    )
}