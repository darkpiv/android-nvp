package com.darkpiv.androidnvp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.darkpiv.androidnvp.R

class HomeFragment : Fragment() {

  private lateinit var homeViewModel: HomeViewModel
  val adapter: ListSquadAdapter = ListSquadAdapter()

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    homeViewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
    val root = inflater.inflate(R.layout.fragment_home, container, false)
    val textView: TextView = root.findViewById(R.id.text_home)
    val listSquad = root.findViewById<RecyclerView>(R.id.listSquad)
    listSquad.adapter = adapter
    homeViewModel.listSquad.observe(this, Observer {
      textView.text = "You have ${it.size} squads"
      adapter.refreshData(it)
    })

    return root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    homeViewModel.fetchSquads()
  }
}