package com.darkpiv.androidnvp.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.darkpiv.androidnvp.core.network.RetrofitClient
import com.darkpiv.androidnvp.model.Squad
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

  private val _listSquads = MutableLiveData<List<Squad>>()
  val listSquad: LiveData<List<Squad>> = _listSquads

  fun fetchSquads() {
    try {
      viewModelScope.launch(Dispatchers.IO) {
        val squads = RetrofitClient.webservice.getListSquads()
        if (squads.meta?.ok == true) {
          _listSquads.postValue(squads.result?.sortedWith(compareBy({ -(it.totalTasks ?: 0) }, { it.name })))
        }
      }
    } catch (error: Throwable) {
      Log.e("tag", "Error nnetowrk", error)
    }
  }
}