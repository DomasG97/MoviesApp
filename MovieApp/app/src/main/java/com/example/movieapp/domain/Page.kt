package com.example.movieapp.domain

data class Page(
    val page: Int,
    val results: List<Movie>,
    val total_pages: Int,
    val total_results: Int
)
