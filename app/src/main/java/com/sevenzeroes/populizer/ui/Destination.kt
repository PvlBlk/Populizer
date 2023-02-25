package com.sevenzeroes.populizer.ui

sealed class Destination(val route: String) {
    object Settings : Destination(route = "settings")
    object Live : Destination(route = "live")
}
