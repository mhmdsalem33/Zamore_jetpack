package com.salem.za.presentation.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.LocalUseFallbackRippleImplementation
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.colorResource
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.salem.za.R
import com.salem.za.presentation.NestedNavGraph
import com.salem.za.ui.theme.ZaTheme
import com.salem.za.presentation.ui.screens.auth.WelcomeScreen
import com.salem.za.ui.theme.ChangeStatusBarColorAndNavigationBar
import kotlinx.serialization.Serializable

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen().setKeepOnScreenCondition { false }
//        enableEdgeToEdge(
//            statusBarStyle = SystemBarStyle.light(
//                android.graphics.Color.TRANSPARENT,
//                android.graphics.Color.TRANSPARENT,
//            ),
//            navigationBarStyle = SystemBarStyle.light(
//                android.graphics.Color.TRANSPARENT,
//                android.graphics.Color.TRANSPARENT,
//            ),
//        )


        super.onCreate(savedInstanceState)
        setContent {


            CompositionLocalProvider(LocalUseFallbackRippleImplementation provides true) {
                ZaTheme {

                    NestedNavGraph()
                }
            }
        }
    }
}


@Composable
fun Screen( navController: NavHostController , name: String? , age: Int ) {
    Surface(
        modifier = Modifier.fillMaxSize().background(Color.White)
    ) {
        ChangeStatusBarColorAndNavigationBar(
            isStatusBarIconColorDark = true ,
            isNavigationBarIconColorDark = true,
            isContentTopTransparent = false
        )
       Column {
           Text(text = "$name")
           Text(text = "$age")
       }

    }
}

@Serializable
object WelcomeScreen

@Serializable
data class ScreenB(
    val name : String?,
    val age : Int
)





