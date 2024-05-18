package com.salem.za.presentation.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandIn
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.shrinkOut
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import androidx.navigation.toRoute
import com.salem.za.presentation.ui.activity.Screen
import com.salem.za.presentation.ui.activity.ScreenB
import com.salem.za.presentation.ui.activity.WelcomeScreen
import com.salem.za.presentation.ui.screens.auth.ScreenA
import com.salem.za.presentation.ui.screens.auth.ScreenC
import com.salem.za.presentation.ui.screens.auth.WelcomeScreen
import kotlinx.serialization.Serializable


fun NavGraphBuilder.authGraph(
    navController: NavHostController
) {


    composable<WelcomeScreen>(
        enterTransition = {
//                          EnterTransition.None

//            fadeIn(tween(700))
//            scaleIn(spring(Spring.DampingRatioHighBouncy))


            slideIntoContainer(AnimatedContentTransitionScope.SlideDirection.Start, tween(700))


//            expandIn(tween(700, easing = LinearEasing))


//            fadeIn(animationSpec = tween(1000))
        },
        exitTransition = {
//            ExitTransition.None


//            shrinkOut(tween(700))
//            scaleOut(spring(Spring.DampingRatioHighBouncy))


            slideOutOfContainer(AnimatedContentTransitionScope.SlideDirection.Start, tween(700))

//            fadeOut(tween(300))
//            slideOutOfContainer(
//                AnimatedContentTransitionScope.SlideDirection.Start, tween(700)
//            )
        },
        popExitTransition = {
            shrinkOut()
        }
//        popEnterTransition = {
//            slideIntoContainer(
//                AnimatedContentTransitionScope.SlideDirection.End, tween(700)
//            )
//        }

    ) {

        WelcomeScreen(navController)
    }

    composable<ScreenB>(

    ){
        val args = it.toRoute<ScreenB>()

        val name = args.name
        val age = args.age

        Screen(navController , name , age )
    }
}







@Serializable
object ScreenA

@Serializable
object ScreenC