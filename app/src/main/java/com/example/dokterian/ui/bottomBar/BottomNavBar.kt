//package com.example.dokterian.ui.bottomBar
//
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.DateRange
//import androidx.compose.material.icons.filled.Email
//import androidx.compose.material.icons.filled.Home
//import androidx.compose.material.icons.filled.Person
//import androidx.compose.material3.BottomAppBar
//import androidx.compose.material3.Icon
//import androidx.compose.material3.IconButton
//import androidx.compose.material3.Scaffold
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.painter.Painter
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.unit.dp
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
//import com.example.dokterian.R
//import com.example.dokterian.Screens
//import com.example.dokterian.ui.screens.chat.Chat
//import com.example.dokterian.ui.screens.home.Home
//
//
//@Composable
//fun BottomNavBar() {
//    val navigationController = rememberNavController()
//    val context = LocalContext.current.applicationContext
//    val selected = remember { mutableStateOf<Painter>(painterResource(id = R.drawable.ic_home)) }
//
//    Scaffold(
//        bottomBar = {
//            BottomAppBar(
//                containerColor = Color.White
//            ) {
//                IconButton(
//                    onClick = {
//                        selected.value = painterResource(id = R.drawable.ic_home)
//                        navigationController.navigate(Screens.Home.screens) {
//                            popUpTo(0)
//                        }
//                    },
//                    modifier = Modifier.weight(1f)
//                ) {
//                    Icon(
//                        Icons.Default.Home,
//                        contentDescription = null,
//                        modifier = Modifier.size(26.dp),
//                        tint = if (selected.value == Icons.Default.Home) Color.White else Color.DarkGray
//                    )
//                }
//
//                IconButton(
//                    onClick = {
//                        selected.value = Icons.Default.DateRange
//                        navigationController.navigate(Screens.Schedule.screens) {
//                            popUpTo(0)
//                        }
//                    },
//                    modifier = Modifier.weight(1f)
//                ) {
//                    Icon(
//                        Icons.Default.DateRange,
//                        contentDescription = null,
//                        modifier = Modifier.size(26.dp),
//                        tint = if (selected.value == Icons.Default.DateRange) Color.White else Color.DarkGray
//                    )
//                }
//
//                IconButton(
//                    onClick = {
//                        selected.value = Icons.Default.Email
//                        navigationController.navigate(Screens.Chat.screens) {
//                            popUpTo(0)
//                        }
//                    },
//                    modifier = Modifier.weight(1f)
//                ) {
//                    Icon(
//                        Icons.Default.Email,
//                        contentDescription = null,
//                        modifier = Modifier.size(26.dp),
//                        tint = if (selected.value == Icons.Default.Email) Color.White else Color.DarkGray
//                    )
//                }
//
//                IconButton(
//                    onClick = {
//                        selected.value = Icons.Default.Person
//                        navigationController.navigate(Screens.Profile.screens) {
//                            popUpTo(0)
//                        }
//                    },
//                    modifier = Modifier.weight(1f)
//                ) {
//                    Icon(
//                        Icons.Default.Person,
//                        contentDescription = null,
//                        modifier = Modifier.size(26.dp),
//                        tint = if (selected.value == Icons.Default.Person) Color.White else Color.DarkGray
//                    )
//                }
//            }
//        }
//    ) {paddingValues ->
//        NavHost(navController = navigationController, startDestination = Screens.Home.screens, modifier = Modifier.padding(paddingValues) ){
//            composable(Screens.Home.screens){ Home()}
//            composable(Screens.Schedule.screens){ Screens.Schedule }
//            composable(Screens.Chat.screens){ Chat() }
//            composable(Screens.Profile.screens){Screens.Profile}
//        }
//
//    }
//}
