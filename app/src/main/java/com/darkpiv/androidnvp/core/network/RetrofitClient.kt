package com.darkpiv.androidnvp.core.network

import com.darkpiv.androidnvp.model.Post
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

object RetrofitClient {
  val webservice by lazy {
    Retrofit.Builder()
      .baseUrl("https://jsonplaceholder.typicode.com/")
      .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
      .build().create(ApiService::class.java)
  }

}

interface ApiService {
  @GET("")
  suspend fun getPosts(): List<Post>
}