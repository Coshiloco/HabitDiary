package com.example.habitdiary.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class HabitDiaryBottomNavItems(val title: String, val icon: ImageVector, val route: String) {
    object Home: HabitDiaryBottomNavItems("Home", Icons.Filled.Home, HabitDiaryRoutes.HomeScreen.route)
}
