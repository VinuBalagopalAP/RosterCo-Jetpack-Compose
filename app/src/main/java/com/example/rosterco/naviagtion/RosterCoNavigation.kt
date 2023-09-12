package com.example.rosterco.naviagtion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.rosterco.screens.HomeScreen
import com.example.rosterco.screens.RollScreen

@Composable
fun RosterCoNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = RosterCoRoutes.RollScreen.name){
        composable(RosterCoRoutes.RollScreen.name){
            RollScreen(navController)
        }
        composable(RosterCoRoutes.HomeScreen.name){
            HomeScreen(navController)
        }
    }
}