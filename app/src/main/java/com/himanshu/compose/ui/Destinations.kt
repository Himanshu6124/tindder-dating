package com.himanshu.compose.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Destinations(
    val route: String,
    val title: String? = null,
    val icon: ImageVector? = null
) {
    data object HomeScreen : Destinations("home_screen", "Home", Icons.Outlined.Home)
    data object Favourite : Destinations(route = "favourite_screen", title = "Favorite", icon = Icons.Outlined.Favorite)
    data object Notification : Destinations(route = "notification_screen", title = "Notification", icon = Icons.Outlined.Notifications)
}