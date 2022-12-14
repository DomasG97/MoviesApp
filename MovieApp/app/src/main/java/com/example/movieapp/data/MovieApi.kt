package com.example.movieapp.data

import com.example.movieapp.domain.Page
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {
    @GET("popular?")
    suspend fun getPopularMovies(
        @Query("api_key")
        api_key : String = "c659e05f7719f2f21391826041dfd788"
    ): Page //Response<Page>
}