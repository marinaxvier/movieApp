package com.example.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movieDBAPI = RetrofitHelper.getInstance().create(MovieDBAPI::class.java)

        GlobalScope.launch {
            val result = movieDBAPI.getPopularMovies()
            if (result != null)
                Log.d("result: ", result.body().toString())
        }
    }
}