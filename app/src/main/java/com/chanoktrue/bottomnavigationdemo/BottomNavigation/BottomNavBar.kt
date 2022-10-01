package com.chanoktrue.bottomnavigationdemo.BottomNavigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavBar(navController: NavController) {

    var menus = listOf(BottomMenu.Home, BottomMenu.Info)

    BottomNavigation(
        backgroundColor = Color.White,
        contentColor = Color.Red
    ) {

        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        menus.forEach { menu ->
            BottomNavigationItem(
                icon = { Icon(imageVector = menu.icon, contentDescription = menu.title)},
                label = { Text(text = menu.title)},
                selectedContentColor = Color.Red,
                unselectedContentColor = Color.Gray,
                selected = currentRoute == menu.route,
                onClick = {
                    navController.navigate(menu.route) {
                        navController.graph.startDestinationRoute?.let {
                            popUpTo(route = it) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                }
            )
        }
    }

}