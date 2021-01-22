package com.example.gallery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class Adapter(private val products: List <Photos> )
    :RecyclerView.Adapter<Adapter.PhotoViewHolder>() {

        class PhotoViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
            val imageView: ImageView=itemView.findViewById(R.id.imageView)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.photo_item , parent,false)
        return  PhotoViewHolder(view)
    }

    override fun getItemCount(): Int=products.size



    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        val p= products[position]
        val currentUrl: String=p.url

        Glide.with(holder.imageView.context)
            .load(currentUrl)
            .placeholder(R.drawable.ic_launcher_foreground)
            .centerCrop()
            .into(holder.imageView)
    }


}