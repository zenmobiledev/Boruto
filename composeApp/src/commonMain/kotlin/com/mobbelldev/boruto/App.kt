package com.mobbelldev.boruto

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mobbelldev.boruto.navigation.SetupNavGraph
import org.jetbrains.compose.ui.tooling.preview.Preview

private lateinit var navHostController: NavHostController

@Composable
@Preview
fun App() {
    MaterialTheme {
        navHostController = rememberNavController()
        SetupNavGraph(
            navHostController = navHostController
        )
    }
}