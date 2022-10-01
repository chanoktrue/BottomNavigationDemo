package com.chanoktrue.bottomnavigationdemo.HomeNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.chanoktrue.bottomnavigationdemo.HomeView.HomeDetailView
import com.chanoktrue.bottomnavigationdemo.HomeView.HomeView

@Composable
fun HomeNav() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = HomeMenu.Home
    ){
        composable(HomeMenu.Home) {
            HomeView(navController = navController)
        }
        composable(HomeMenu.HomeDetail) {
            HomeDetailView(navController = navController)
        }
    }

}