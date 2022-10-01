package com.chanoktrue.bottomnavigationdemo.BottomNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.chanoktrue.bottomnavigationdemo.HomeNavigation.HomeNav
import com.chanoktrue.bottomnavigationdemo.HomeView.HomeView
import com.chanoktrue.bottomnavigationdemo.InfoNavigation.InfoNav
import com.chanoktrue.bottomnavigationdemo.InfoView.InfoView

@Composable
fun BottomNav(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = BottomMenu.Home.route
    ){
        composable(BottomMenu.Home.route) {
            HomeNav()
        }
        composable(BottomMenu.Info.route) {
            InfoNav()
        }
    }

}