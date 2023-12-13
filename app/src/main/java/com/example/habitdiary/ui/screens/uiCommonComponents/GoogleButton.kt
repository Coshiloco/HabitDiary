package com.example.habitdiary.ui.screens.uiCommonComponents

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.habitdiary.R
import com.example.habitdiary.ui.theme.secondaryHabitButtonSemiBoldHeadLineS


@Composable
fun GoogleButton(onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(255, 255, 255),
            contentColor = Color(0, 0, 0)
        ),
        contentPadding = PaddingValues(start = 16.dp),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(1.dp, Color(150, 150, 150))

    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.CenterVertically)
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_google_g_icon),
                contentDescription = "google icon",
                modifier = Modifier
                    .size(width = 24.dp, height = 24.dp)
                    .align(
                        Alignment.CenterStart
                    )
            )
            Text(
                text = stringResource(id = R.string.login_screen_google_sign_in),
                modifier = Modifier.align(Alignment.Center),
                color = Color(0, 0, 0),
                style = secondaryHabitButtonSemiBoldHeadLineS
            )
        }

    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewGoogleButton() {
    GoogleButton {}
}