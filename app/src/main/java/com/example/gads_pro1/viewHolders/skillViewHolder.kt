package com.example.gads_pro1.viewHolders

import android.graphics.BitmapFactory
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gads_pro1.R
import com.example.gads_pro1.models.Skill
import java.lang.Exception
import java.net.URL


class skillViewHolder(view:View): RecyclerView.ViewHolder(view) {
    val name = view.findViewById<TextView>(R.id.learner_name) as TextView
    var score = view.findViewById<TextView>(R.id.score) as TextView
    val country = view.findViewById<TextView>(R.id.country)as TextView


    }

