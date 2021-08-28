package com.example.kotlinassessment2.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    var retrofit = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.13.244.243.129/photos/")
        .addConverterFactory(GsonConverterFactory.create())
    fun <T> buildApiClient(apiInterface: Class<T>) : Retrofit.Builder? {
        return retrofit
    }
}
