package com.example.habitdiary.ui.navigation

sealed class HabitDiaryRoutes(val route: String) {
    object WelcomeScreen: HabitDiaryRoutes(route = "welcome")
    object HomeScreen : HabitDiaryRoutes(route = "home")
}
