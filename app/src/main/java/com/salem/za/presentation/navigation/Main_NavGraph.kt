package com.salem.za.presentation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.salem.za.ui.screens.main.Home
import com.salem.za.ui.screens.main.HomeScreen

fun NavGraphBuilder.mainGraph(navController: NavHostController) {


    composable<Home>{
        HomeScreen()
    }


}