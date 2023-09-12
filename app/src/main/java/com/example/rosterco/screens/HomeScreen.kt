package com.example.rosterco.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Movies",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis)},
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Magenta))
        }) {
        Surface(modifier = Modifier.padding(it)) {
            HomeContent(navController = navController)
        }
    }
}

@Composable
fun HomeContent(navController: NavController) {
    Column {
        Text(text = "Hi")
    }
}