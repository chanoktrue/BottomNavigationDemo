package com.chanoktrue.bottomnavigationdemo.InfoView

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.chanoktrue.bottomnavigationdemo.InfoNavigation.InfoMenu

@Composable
fun InfoView(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedButton(
            onClick = {
                navController.navigate(InfoMenu.InfoDetail)
            }
        ) {
            Text(text = "Go to Info Details >>")
        }
    }
}