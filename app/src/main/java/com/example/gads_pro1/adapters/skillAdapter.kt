package com.example.gads_pro1.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gads_pro1.R
import com.example.gads_pro1.models.Skill
import com.example.gads_pro1.viewHolders.skillViewHolder

class skillAdapter (
    val skillList: ArrayList<Skill>,
    var data:List<Skill>
) : RecyclerView.Adapter<skillViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): skillViewHolder {
        var v = LayoutInflater.from(parent.context).inflate(R.layout.skill_item, parent, false)
        return skillViewHolder(v)
    }

    override fun getItemCount(): Int {
        return skillList.size
    }

    override fun onBindViewHolder(holder: skillViewHolder, position: Int) {
        holder.name.text = data[position].name
        holder.score.text = data[position].score
        holder.country.text = data[position].country
    }
}
