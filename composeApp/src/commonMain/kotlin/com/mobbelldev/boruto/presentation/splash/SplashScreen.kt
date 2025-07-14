package com.mobbelldev.boruto.presentation.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import boruto.composeapp.generated.resources.Res
import boruto.composeapp.generated.resources.app_name
import boruto.composeapp.generated.resources.shuriken
import com.mobbelldev.boruto.ui.theme.purple500
import com.mobbelldev.boruto.ui.theme.purple700
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun SplashScreen(navHostController: NavHostController) {
    Splash()
}

@Composable
fun Splash() {
    if (isSystemInDarkTheme()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black),
            contentAlignment = Alignment.Center,
        ) {
            Image(
                painter = painterResource(Res.drawable.shuriken),
                contentDescription = stringResource(resource = Res.string.app_name)
            )
        }
    } else {
        Box(
            Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        listOf(
                            purple700,
                            purple500
                        )
                    )
                ),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(Res.drawable.shuriken),
                contentDescription = stringResource(resource = Res.string.app_name)
            )
        }
    }
}

@Composable
@Preview
fun SplashScreenPreview() {
    Splash()
}