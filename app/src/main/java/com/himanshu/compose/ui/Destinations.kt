package com.himanshu.compose.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.ui.graphics.vector.ImageVector
import com.himanshu.compose.R

sealed class Destinations(
    val route: String,
    val title: String? = null,
    val icon: Int? = null
) {
    data object HomeScreen : Destinations("home_screen", "Home", R.drawable.tinder)
    data object SearchScreen : Destinations("search_screen", "Search", R.drawable.search)
    data object Favourite : Destinations(route = "favourite_screen", title = "Favorite", icon = R.drawable.favourites)
    data object Chat : Destinations(route = "notification_screen", title = "Chat", icon = R.drawable.chat)
    data object Profile : Destinations(route = "profile_screen", title = "Profile", icon = R.drawable.profile)
}