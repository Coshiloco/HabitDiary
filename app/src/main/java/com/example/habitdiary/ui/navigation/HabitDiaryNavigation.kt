package com.example.habitdiary.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.habitdiary.ui.screens.login.WelcomeScreen
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.google.accompanist.navigation.material.ModalBottomSheetLayout
import com.google.accompanist.navigation.material.rememberBottomSheetNavigator


@OptIn(ExperimentalMaterialNavigationApi::class)
@Composable
fun HabitDiaryNavigation() {

    val bottomSheetNavigator = rememberBottomSheetNavigator()
    val navController = rememberNavController(bottomSheetNavigator)

    ModalBottomSheetLayout(bottomSheetNavigator) {
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

}