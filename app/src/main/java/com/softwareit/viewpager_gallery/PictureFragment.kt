package com.softwareit.viewpager_gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.softwareit.viewpager_gallery.databinding.FragmentPictureBinding
import com.softwareit.viewpager_gallery.model.Picture

private const val ARG_ID = "id"
private const val ARG_IMAGE = "image"

class PictureFragment : Fragment() {

    private val binding by lazy { FragmentPictureBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        arguments?.let { args ->
            binding.image.setImageResource(args.getInt(ARG_IMAGE))
        }
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(picture: Picture) = PictureFragment().apply {
            arguments = bundleOf(
                ARG_ID to picture.id,
                ARG_IMAGE to picture.image
            )
        }
    }
}