package com.salem.za.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.salem.za.presentation.navigation.ScreenA
import com.salem.za.presentation.navigation.authGraph
import com.salem.za.presentation.navigation.mainGraph
import com.salem.za.presentation.ui.activity.WelcomeScreen
import com.salem.za.presentation.ui.screens.auth.ScreenA
import com.salem.za.presentation.ui.screens.auth.ScreenC
import com.salem.za.presentation.ui.screens.main.Home

@Composable
fun NestedNavGraph( isLoggedIn : Boolean = false ){

    val navController = rememberNavController()
    NavHost( navController = navController  , startDestination =  WelcomeScreen ) {


        authGraph(navController)
//        mainGraph(navController)

    }

}


//private fun determineStartDestination( isLoggedIn: Boolean = false ) : Any{
//    return if (isLoggedIn) Home else WelcomeScreen
//}

