package com.example.habitdiary.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.habitdiary.ui.screens.login.WelcomeScreen


@Composable
fun HabitDiaryNavigation() {

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = HabitDiaryRoutes.WelcomeScreen.route
    ) {
        composable(HabitDiaryRoutes.WelcomeScreen.route) {
            WelcomeScreen(navController = navController)
        }
        composable(HabitDiaryRoutes.HomeScreen.route) {

        }
    }
}
