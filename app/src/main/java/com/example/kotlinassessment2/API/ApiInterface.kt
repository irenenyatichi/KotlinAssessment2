package com.example.kotlinassessment2.API

import com.example.kotlinassessment2.models.Post
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    @GET("photos")
    fun getPosts(postId:String):retrofit2.Call<List<Post>>
    @GET("photos/{id}/{caption}")
    fun getCaptionsById(@Path(value = "caption":String):retrofit2.Call<caption>)

}