package com.example.punk.data.local

import androidx.room.PrimaryKey

data class BeerEntity(
    @PrimaryKey
    val id: Int,
    val name: String,
    val tagLine: String,
    val description: String,
    val first_brewed: String,
    val image_url: String?
)