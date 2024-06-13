package com.example.dokterian.buttomNav

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.dokterian.ui.screens.home.HomeScreen
import com.example.dokterian.ui.screens.message.MessageScreen
import com.example.dokterian.ui.screens.profile.ProfileScreen
import com.example.dokterian.ui.screens.schedule.ScheduleScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ){
        composable(route = BottomBarScreen.Home.route)
        {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Schedule.route)
        {
            ScheduleScreen()
        }
        composable(route = BottomBarScreen.Message.route)
        {
            MessageScreen()
        }
        composable(route = BottomBarScreen.Profile.route)
        {
            ProfileScreen()
        }
    }
}