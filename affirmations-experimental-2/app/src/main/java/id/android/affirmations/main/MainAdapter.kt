package id.android.affirmations.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import id.android.affirmations.R
import id.android.affirmations.main.MainAdapter.MainViewHolder
import kotlinx.android.synthetic.main.item_main.view.*

class MainAdapter(private val values: List<String>) : Adapter<MainViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
    MainViewHolder(
      LayoutInflater.from(parent.context).inflate(
        R.layout.item_main, parent, false
      )
    )

  override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
    holder.bind(values[holder.adapterPosition])
  }

  override fun getItemCount() = values.count()

  inner class MainViewHolder(private val item: View) : ViewHolder(item) {

    fun bind(value: String) {
      with(item) {
        tv_main.text = value
      }
    }
  }
}