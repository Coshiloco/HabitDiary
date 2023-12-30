package com.example.habitdiary.ui.screens.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.habitdiary.R
import com.example.habitdiary.ui.screens.uiCommonComponents.CustomSpacer
import com.example.habitdiary.ui.screens.uiCommonComponents.GoogleButton
import com.example.habitdiary.ui.screens.uiCommonComponents.HabitButton
import com.example.habitdiary.ui.screens.uiCommonComponents.HabitLogoImage
import com.example.habitdiary.ui.screens.uiCommonComponents.HabitMainTitle
import com.example.habitdiary.ui.screens.uiCommonComponents.HabitSubtitle

@Composable
fun WelcomeScreen(
    navController: NavController,
    viewModel: WelcomeViewModel = hiltViewModel(),
    modifier: Modifier = Modifier
) {
    WelcomeContent(
        modifier,
        onLoginEmailClick = {},
        onLoginGoogleClick = {}
    )
}

@Composable
fun WelcomeContent(
    modifier: Modifier,
    onLoginEmailClick: () -> Unit,
    onLoginGoogleClick: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HabitLogoImage()
        CustomSpacer(size = 50.dp)
        HabitMainTitle()
        CustomSpacer(size = 8.dp)
        HabitSubtitle(Modifier.align(Alignment.Start))
        CustomSpacer(size = 50.dp)
        HabitButton(
            text = R.string.welcome_screen_habit_login_register,
            onClick = onLoginEmailClick
        )
        CustomSpacer(size = 25.dp)
        GoogleButton(
            onClick = onLoginGoogleClick
        )
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WelcomeScreenPreview() {
    WelcomeContent(modifier = Modifier, onLoginEmailClick = {}, onLoginGoogleClick = {})
}


