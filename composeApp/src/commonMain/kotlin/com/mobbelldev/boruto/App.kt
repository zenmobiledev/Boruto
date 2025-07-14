package com.mobbelldev.boruto

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.mobbelldev.boruto.presentation.splash.SplashScreenPreview
import org.jetbrains.compose.ui.tooling.preview.Preview

private lateinit var navHostController: NavHostController

@Composable
@Preview
fun App() {
    MaterialTheme {
        SplashScreenPreview()
    }
//    MaterialTheme {
//        navHostController = rememberNavController()
//        SetupNavGraph(
//            navHostController = navHostController
//        )
//    }
}