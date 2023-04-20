package com.example.punk.data.remote.dto

data class BeerDto(
    val id: Int,
    val name: String,
    val tagLine: String,
    val description: String,
    val first_brewed: String,
    val image_url: String?
)
