package com.mobbelldev.boruto.presentation.splash

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
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
    val infiniteTransition = rememberInfiniteTransition()
    val degrees by infiniteTransition.animateFloat(
        initialValue = 0F,
        targetValue = 360F,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 2000,
                easing = LinearEasing
            )
        )
    )
    Splash(
        degrees = degrees
    )
}

@Composable
fun Splash(degrees: Float) {
    if (isSystemInDarkTheme()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black),
            contentAlignment = Alignment.Center,
        ) {
            Image(
                modifier = Modifier.rotate(degrees = degrees),
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
                modifier = Modifier.rotate(degrees = degrees),
                painter = painterResource(Res.drawable.shuriken),
                contentDescription = stringResource(resource = Res.string.app_name)
            )
        }
    }
}

@Composable
@Preview
fun SplashScreenPreview() {
    Splash(
        degrees = 0F
    )
}