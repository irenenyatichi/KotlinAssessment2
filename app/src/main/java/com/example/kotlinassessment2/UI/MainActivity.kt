package com.example.kotlinassessment2.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinassessment2.API.ApiClient
import com.example.kotlinassessment2.API.ApiInterface
import com.example.kotlinassessment2.R
import com.example.kotlinassessment2.models.Post
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var rvPosts:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvPosts = findViewById(R.id.rvPosts)
        rvPosts.layoutManager = LinearLayoutManager(baseContext)

        getPosts()
    }
    fun getPosts(){
        var retrofit = ApiClient.buildApiClient(ApiInterface::class.java)
        var postId:0
        var request = retrofit.String().also { postId = it }
        request.enqueue(object : Callback<List<Post>>{
            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                if (response.isSuccessful){
                    var postList = response.body()!!
                    if (postList!=null){

                    }
                }
            }

            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                Toast.makeText(baseContext,"Failed",Toast.LENGTH_LONG).show()
            }
        })
    }

}
