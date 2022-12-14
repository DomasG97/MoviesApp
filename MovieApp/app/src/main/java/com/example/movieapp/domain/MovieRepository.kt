package com.example.movieapp.domain

import com.example.movieapp.data.RetrofitInstance

class MovieRepository {
    suspend fun getPopularMovies() = RetrofitInstance.api.getPopularMovies()
}