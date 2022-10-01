package com.chanoktrue.bottomnavigationdemo.InfoNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.chanoktrue.bottomnavigationdemo.InfoView.InfoDetailView
import com.chanoktrue.bottomnavigationdemo.InfoView.InfoView

@Composable
fun InfoNav() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = InfoMenu.Info
    ){
        composable(InfoMenu.Info) {
            InfoView(navController = navController)
        }
        composable(InfoMenu.InfoDetail) {
            InfoDetailView(navController = navController)
        }
    }

}