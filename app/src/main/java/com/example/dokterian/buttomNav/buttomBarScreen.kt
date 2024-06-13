package com.example.dokterian.buttomNav

import com.example.dokterian.R

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: Int,
    val icon_focused: Int
){
    // for home
    object Home: BottomBarScreen(
        route = "home",
        title = "Home",
        icon = R.drawable.ic_home,
        icon_focused = R.drawable.ic_home_focused
    )

    // for schedule
    object Schedule: BottomBarScreen(
        route = "schedule",
        title = "Schedule",
        icon = R.drawable.ic_calendar,
        icon_focused = R.drawable.ic_calendar_focused
    )

    // for message
    object Message: BottomBarScreen(
        route = "message",
        title = "Message",
        icon = R.drawable.ic_message,
        icon_focused = R.drawable.ic_message_focused
    )

    // for profile
    object Profile: BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = R.drawable.ic_profile,
        icon_focused = R.drawable.ic_profile_focused
    )
}
