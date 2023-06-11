package com.example.movieapp

import retrofit2.Response
import retrofit2.http.GET


interface MovieDBAPI {
        @GET("3/movie/popular")
        suspend fun getPopularMovies() : Response<Movie>
}