package com.tubesmobile.newsapp.networking

import com.tubesmobile.newsapp.model.ModelNews
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("top-headlines")
    fun getTechnology(
        @Query("country") country: String?,
        @Query("category") category: String?,
        @Query("apiKey") apiKey: String?
    ): Call<ModelNews>

    @GET("everything")
    fun getNewsSearch(
        @Query("q") keyword: String?,
        @Query("language") language: String?,
        @Query("apiKey") apiKey: String?
    ): Call<ModelNews>

}