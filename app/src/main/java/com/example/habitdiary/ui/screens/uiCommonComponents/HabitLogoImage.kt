package com.example.habitdiary.ui.screens.uiCommonComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.habitdiary.R


@Composable
fun HabitLogoImage() {
    Image(
        painter = painterResource(id = R.drawable.logoapphabitdairy),
        contentDescription = "HabitDiary Logo Image App",
        modifier = Modifier.size(width = 214.dp, height = 197.dp),
    )
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HabitLogoImagePreview() {
    HabitLogoImage()
}