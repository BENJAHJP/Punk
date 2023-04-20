package com.example.punk.domain.model

data class Beer(
    val id: Int,
    val name: String,
    val tagLine: String,
    val description: String,
    val first_brewed: String,
    val image_url: String?
)
