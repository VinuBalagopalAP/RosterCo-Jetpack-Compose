package com.example.rosterco.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.rosterco.screens.components.DailyMotivationCard
import com.example.rosterco.screens.components.HomeTaskSection
import com.example.rosterco.screens.components.HomeTopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {

    Scaffold()
         {
        Surface(modifier = Modifier.padding(it)) {
            HomeContent(navController = navController)
        }
    }
}

@Composable
fun HomeContent(navController: NavController) {
    Column{
        HomeTopBar()
        DailyMotivationCard()
        Spacer(modifier = Modifier.height(40.dp))
        HomeTaskSection()
    }
}
