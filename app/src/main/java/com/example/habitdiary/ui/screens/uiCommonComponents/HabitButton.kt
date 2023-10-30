package com.example.habitdiary.ui.screens.uiCommonComponents

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Login
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.habitdiary.ui.theme.secondaryHabitButtonBoldHeadLineS

@Composable
fun HabitButton(
    modifier: Modifier = Modifier,
    @StringRes text: Int,
    onClick: () -> Unit,
    enabled: Boolean = true
) {
    ElevatedButton(
        onClick = onClick,
        enabled = enabled,
        modifier = modifier
            .fillMaxWidth()
            .height(48.dp),
        shape = RoundedCornerShape(16.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(255, 227, 140),
            contentColor = Color(143, 140, 129)
        )
    ) {
        Box(
            Modifier
                .fillMaxSize()
                .align(Alignment.CenterVertically)
        ) {
            Icon(
                imageVector = Icons.Filled.Login,
                contentDescription = "Icon Sign In",
                modifier = Modifier.align(Alignment.CenterStart)
            )
            Text(
                text = stringResource(id = text),
                modifier = Modifier.align(Alignment.Center),
                color = Color(143, 140, 129),
                style = secondaryHabitButtonBoldHeadLineS
            )
        }
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HabitButtonPreview() {
    HabitButton(
        modifier = Modifier,
        0,
        onClick = {},
        true
    )
}