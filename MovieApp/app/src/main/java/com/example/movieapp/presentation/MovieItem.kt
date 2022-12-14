package com.example.movieapp.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.movieapp.domain.Movie

@Composable
fun MovieItem(movie: Movie){
//fun MovieItem(title: String, overview: String){
    Row(
        Modifier
            .padding(20.dp)
            .clickable { "" }
    ) {
        Box(
            modifier = Modifier.weight(0.2f)
        ){
            Text(
                text = "Movie image"
            )
        }
        Column(
            modifier = Modifier.weight(0.8f)
        ) {
            Text(
                text = movie.original_title
            )
            Text(
                text = movie.overview,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}