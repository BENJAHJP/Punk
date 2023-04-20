package com.example.punk

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.compose.collectAsLazyPagingItems
import com.example.punk.presentation.beer.BeerScreen
import com.example.punk.presentation.beer.BeerViewModel
import com.example.punk.presentation.theme.PunkTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PunkTheme {
                val viewModel = hiltViewModel<BeerViewModel>()
                val beers = viewModel.beerPagingFlow.collectAsLazyPagingItems()
                BeerScreen(beers = beers)
            }
        }
    }
}