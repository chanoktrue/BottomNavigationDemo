package com.chanoktrue.bottomnavigationdemo.HomeView

import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.chanoktrue.bottomnavigationdemo.HomeNavigation.HomeMenu

@Composable
fun HomeView(navController: NavController) {

    Scaffold(
        topBar = { HeaderView()}
    ) {
        BodyView(navController = navController)
    }

}

@Composable
fun HeaderView() {
    Row(
        modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        OutlinedButton(onClick = { /*TODO*/ }) {
            Text(text = "< Back")
        }
        OutlinedButton(onClick = { /*TODO*/ }) {
            Text(text = "Done")
        }
    }
}

@Composable
fun BodyView(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedButton(
            onClick = {
                navController.navigate(HomeMenu.HomeDetail)
            }
        ) {
            Text(text = "Go to Home Details >>")
        }
    }
}