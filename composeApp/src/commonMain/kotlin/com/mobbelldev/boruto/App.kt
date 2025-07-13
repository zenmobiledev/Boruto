package com.mobbelldev.boruto

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import org.jetbrains.compose.ui.tooling.preview.Preview

private lateinit var navHostController: NavHostController
private val platform = getPlatform()

@Composable
@Preview
fun App() {
    MaterialTheme {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = greet()
            )
        }
    }
//    MaterialTheme {
//        navHostController = rememberNavController()
//        SetupNavGraph(
//            navHostController = navHostController
//        )
//    }
}

fun greet(): String = "Hi, ${platform.name}"