package com.chanoktrue.bottomnavigationdemo.BottomNavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomMenu(
    var title: String,
    var icon: ImageVector,
    var route: String
) {
    object Home: BottomMenu("Home", Icons.Default.Home, "home")
    object Info: BottomMenu("Info", Icons.Default.Info, "info")
}
