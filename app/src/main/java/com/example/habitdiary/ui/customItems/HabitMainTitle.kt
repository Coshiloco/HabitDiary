package com.example.habitdiary.ui.customItems

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.habitdiary.R
import com.example.habitdiary.ui.theme.primaryHabitMainTitleBoldDisplayS

@Composable
fun HabitMainTitle() {
    Column {
        Text(
            text = stringResource(id = R.string.welcome_screen_habit_main_title),
            modifier = Modifier.fillMaxWidth(),
            style = primaryHabitMainTitleBoldDisplayS
        )
        Text(
            text = stringResource(id = R.string.welcome_screen_habit_main_title_second),
            modifier = Modifier.fillMaxWidth(),
            style = primaryHabitMainTitleBoldDisplayS
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HabitMainTitlePreview() {
    HabitMainTitle()
}



