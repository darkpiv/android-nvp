package com.darkpiv.androidnvp.ui.home

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.darkpiv.androidnvp.model.Squad
import kotlinx.android.synthetic.main.item_squad.view.*


class ListSquadAdapter(private val items: MutableList<Squad> = mutableListOf()) : RecyclerView.Adapter<ListSquadHolder>() {
  override fun setHasStableIds(hasStableIds: Boolean) {
    super.setHasStableIds(true)
  }

  fun refreshData(data: List<Squad>) {
    this.items.clear()
    this.items.addAll(data)
    notifyDataSetChanged()
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSquadHolder {
    return ListSquadHolder(LayoutInflater.from(parent.context).inflate(com.darkpiv.androidnvp.R.layout.item_squad, parent, false))
  }

  override fun getItemCount(): Int {
    return items.size
  }

  override fun onBindViewHolder(holder: ListSquadHolder, position: Int) {
    val data = items[position]
    holder.itemView.squadName.text = data.name
    holder.itemView.totalTasks.text = "Total tasks: ${data.totalTasks}"
    when (data.expertiseRoles?.size) {
      null, 0 -> {
        holder.itemView.expertiseRole1.visibility = View.INVISIBLE
        holder.itemView.expertiseRole2.visibility = View.INVISIBLE
      }
      1 -> {
        holder.itemView.expertiseRole1.visibility = View.VISIBLE
        holder.itemView.expertiseRole2.visibility = View.INVISIBLE
        holder.itemView.expertiseRole1.text = data.expertiseRoles!![0].shortName
      }
      else -> {
        holder.itemView.expertiseRole1.visibility = View.VISIBLE
        holder.itemView.expertiseRole2.visibility = View.VISIBLE
        holder.itemView.expertiseRole1.text = data.expertiseRoles!![0].shortName
        holder.itemView.expertiseRole2.text = data.expertiseRoles!![1].shortName
      }
    }

    holder.itemView.expertiseRole1.background = getGradientDrawable()
    holder.itemView.expertiseRole2.background = getGradientDrawable()

  }
}

fun getGradientDrawable(): GradientDrawable {
  val draw = GradientDrawable()
  draw.shape = GradientDrawable.RECTANGLE
  draw.setColor(Color.parseColor(colors.random()))
  draw.cornerRadius = 30F
  return draw
}

val colors = mutableListOf<String>("#5E97F6", "#9CCC65", "#FF8A65", "#9E9E9E", "#BA68C8")

class ListSquadHolder(view: View) : RecyclerView.ViewHolder(view)