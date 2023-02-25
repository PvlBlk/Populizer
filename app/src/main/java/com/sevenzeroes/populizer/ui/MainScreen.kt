package com.sevenzeroes.populizer.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sevenzeroes.live_screen.LiveScreen
import com.sevenzeroes.settings_screen.SettingsScreen

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Destination.Settings.route) {
        composable(route = Destination.Settings.route) {
            SettingsScreen(navController = navController)
        }
        composable(route = Destination.Live.route) {
            LiveScreen(navController = navController)
        }
    }
}
