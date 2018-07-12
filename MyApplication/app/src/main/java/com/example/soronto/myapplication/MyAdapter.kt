package com.example.soronto.myapplication

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.listview_item.view.*
import java.net.URL

class MyAdapter(private val myDataset: ArrayList<IssacItem>) :
        RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.
    class ViewHolder(val myView: LinearLayout) : RecyclerView.ViewHolder(myView)


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MyAdapter.ViewHolder {
        // create a new view
        val myView = LayoutInflater.from(parent.context)
                .inflate(R.layout.listview_item, parent, false) as LinearLayout
        // set the view's size, margins, paddings and layout parameters
        return ViewHolder(myView)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element

        var uri= Uri.parse("https://d1u5p3l4wpay3k.cloudfront.net/bindingofisaacre_gamepedia/6/68/Anarchist_Cookbook_Icon.png?version=8962b7a45ce0578d7dd98d16db59acf3")
        holder.myView.tv_user_image.setImageURI(uri)

        holder.myView.tv_user_name.text = myDataset[position].name
        holder.myView.tv_user_score.text=myDataset[position].description
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = myDataset.size

}
