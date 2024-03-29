package com.example.test001

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageSliderAdapter : RecyclerView.Adapter<ImageSliderAdapter.ImageSliderViewHolder>() {

    private val images = intArrayOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageSliderViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_image_slider, parent, false)
        return ImageSliderViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageSliderViewHolder, position: Int) {
        holder.popularImageView.setImageResource(images[position])
        holder.myChallengeImageView.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return images.size
    }

    class ImageSliderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val popularImageView: ImageView = itemView.findViewById(R.id.popularViewPager)
        val popularIndicatorDot: ImageView = itemView.findViewById(R.id.popularIndicatorDot)

        val myChallengeImageView: ImageView = itemView.findViewById(R.id.myChallengeViewPager)
        val myChallengeIndicatorDot: ImageView = itemView.findViewById(R.id.myChallengeIndicatorDot)
    }
}

