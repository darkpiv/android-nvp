package com.darkpiv.androidnvp.core.network

import com.darkpiv.androidnvp.model.ListSquadResponse
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

object RetrofitClient {
  val webservice by lazy {
    Retrofit.Builder()
      .baseUrl("https://internal.geekup.vn/api/")
      .addConverterFactory(GsonConverterFactory.create(GsonBuilder().apply {
      }.create()))
      .build().create(ApiService::class.java)
  }

}

interface ApiService {
  @GET("alfred/project/list?userId=139")
  suspend fun getListSquads(): ListSquadResponse
}