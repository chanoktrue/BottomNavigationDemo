package com.chanoktrue.bottomnavigationdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.chanoktrue.bottomnavigationdemo.BottomNavigation.BottomNav
import com.chanoktrue.bottomnavigationdemo.BottomNavigation.BottomNavBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          Menu()
        }
    }
}

@Composable
fun Menu() {
   var navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomNavBar(navController = navController) }
    ) {
        BottomNav(navController = navController)
    }

}

@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    Menu()
}