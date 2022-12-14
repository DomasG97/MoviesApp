package com.example.movieapp.presentation

import androidx.compose.runtime.*
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.movieapp.data.RetrofitInstance
import com.example.movieapp.domain.MovieRepository
import com.example.movieapp.domain.Page
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import retrofit2.Response

class MovieViewModel(
    //private val movieRepository: MovieRepository
) : ViewModel() {

    //val response: MutableLiveData<Page> = MutableLiveData()
    lateinit var response: Page

    fun getPopularMovies() {
        viewModelScope.launch {
            response = RetrofitInstance.api.getPopularMovies()
        }
    }
}