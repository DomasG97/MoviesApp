package com.example.movieapp.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.movieapp.MainActivity
import com.example.movieapp.domain.Movie
import com.example.movieapp.domain.MovieRepository
import com.example.movieapp.domain.Page

@Composable
fun MovieList(){
    val movieViewModel = viewModel(modelClass = MovieViewModel::class.java)
    movieViewModel.getPopularMovies()
    val movies = movieViewModel.response

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(items = movies.results) { item ->
            MovieItem(movie = item)
        }
    }
}