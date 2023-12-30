package com.example.habitdiary.ui.screens.uiCommonComponents

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


@Composable
fun CustomSpacer(size: Dp) {
    Spacer(modifier = Modifier.size(size))
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun CustomSpacerPreview() {
    CustomSpacer(8.dp)
}