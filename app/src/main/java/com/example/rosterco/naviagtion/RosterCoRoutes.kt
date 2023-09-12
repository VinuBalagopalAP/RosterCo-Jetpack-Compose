package com.example.rosterco.naviagtion

enum class RosterCoRoutes {
    RollScreen,
    HomeScreen;

    companion object {
        fun fromRoute(route: String?): RosterCoRoutes
                = when(route?.substringBefore("/")){
            RollScreen.name -> RollScreen
            HomeScreen.name -> HomeScreen

            null -> RollScreen
            else -> throw IllegalArgumentException("Route $route is not recognised")
        }
    }
}