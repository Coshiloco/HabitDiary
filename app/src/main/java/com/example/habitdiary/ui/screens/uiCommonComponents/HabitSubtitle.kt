package com.example.habitdiary.ui.screens.uiCommonComponents

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.habitdiary.R
import com.example.habitdiary.ui.theme.secundaryHabitSubtitleRegularBodyL

@Composable
fun HabitSubtitle(modifier: Modifier) {
    Text(
        text = stringResource(id = R.string.welcome_screen_habit_subtitle),
        modifier = modifier,
        style = secundaryHabitSubtitleRegularBodyL
    )
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HabitSubtitlePreview() {
    HabitSubtitle(modifier = Modifier)
}



