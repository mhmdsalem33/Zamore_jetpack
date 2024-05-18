package com.salem.za.presentation.navigation

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.salem.za.ui.screens.auth.LoginScreen
import com.salem.za.ui.screens.auth.Screen
import com.salem.za.ui.screens.auth.WelcomeScreen


fun NavGraphBuilder.authGraph(
    navController: NavHostController
) {
    composable<WelcomeScreen>(
        enterTransition = {
            EnterTransition.None
        },
        exitTransition = {
            ExitTransition.None
        },
        popExitTransition = {
            ExitTransition.None
        }
    )
    {
        WelcomeScreen(navController)
    }

    composable<LoginScreen>(
        enterTransition = {
            EnterTransition.None
        },
        exitTransition = {
            ExitTransition.None
        },
        popExitTransition = {
            ExitTransition.None
        }
    ){
       LoginScreen()
    }

    composable<ScreenB> {
        val args = it.toRoute<ScreenB>()

        val name = args.name
        val age = args.age

        Screen( navController , name , age )
    }
}
