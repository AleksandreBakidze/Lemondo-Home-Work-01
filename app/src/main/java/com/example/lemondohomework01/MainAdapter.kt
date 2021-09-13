package com.example.lemondohomework01

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(private  val shoplist: ArrayList<Shop>): RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return MainViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val currentItem = shoplist[position]

        holder.brandName.text = currentItem.name
        holder.mainImage.text = currentItem.backgroundUrl
        holder.brandImage.text = currentItem.logoUrl
        holder.orderRate.text = currentItem.orderNo.toString()


        val intent = Intent(holder.itemView.context, MainActivity::class.java)
        intent.putExtra("brandName", "${holder.brandName.text}")
        intent.putExtra("mainImage", "${holder.mainImage.text}")
        intent.putExtra("brandImage", "${holder.brandImage.text}")
        intent.putExtra("orderRate", "${holder.orderRate.text}")

    }

    override fun getItemCount(): Int {
        return shoplist.size
    }

    class MainViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        val mainImage: TextView = itemView.findViewById(R.id.main_img_iv)
        val brandImage: TextView = itemView.findViewById(R.id.brand_img_iv)
        val brandName: TextView = itemView.findViewById(R.id.main_img_iv)
        val orderRate: TextView = itemView.findViewById(R.id.order_rate_tv)

    }


}