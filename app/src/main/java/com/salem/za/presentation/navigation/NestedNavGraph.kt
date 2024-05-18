package com.salem.za.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

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

