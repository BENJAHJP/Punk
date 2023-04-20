package com.example.punk.data.mapper

import com.example.punk.data.local.BeerEntity
import com.example.punk.data.remote.dto.BeerDto
import com.example.punk.domain.model.Beer

fun BeerDto.toBeerEntity(): BeerEntity{
    return BeerEntity(
        id = id,
        name = name,
        tagLine = tagLine,
        description = description,
        first_brewed = first_brewed,
        image_url = image_url
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagLine = tagLine?:"",
        description = description,
        first_brewed = first_brewed,
        image_url = image_url
    )
}