package com.example.appproject.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.appproject.R
import com.example.appproject.ui.home.ArticleItem

class Adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val data = mutableListOf<ArticleItem>()

    private var onItemClick: ((ArticleItem)->Unit)?=null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.home_item,parent ,false)
        return  object :RecyclerView.ViewHolder(view){}
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val news = data[position]
        holder.itemView.findViewById<TextView>(R.id.item_title).text = data[position].title
        holder.itemView.findViewById<TextView>(R.id.item_time).text = data[position].niceDate
        val iv = holder.itemView.findViewById<ImageView>(R.id.imageView)
        if (news.collect) {
            iv.setImageResource(R.drawable.redheart)

        } else {
            iv.setImageResource(R.drawable.emptyheart)
        }
        iv.setOnClickListener {
            news.collect = !news.collect
            notifyDataSetChanged()
        }
        holder.itemView.setOnClickListener{
            onItemClick?.invoke(news)
            it.findViewById<ImageView>(R.id.imageView).setOnClickListener{
            }
        }
    }
    override fun getItemCount(): Int = data.size
    fun setOnItemClickListener(listener:(ArticleItem)->Unit){
        onItemClick = listener
    }
}
