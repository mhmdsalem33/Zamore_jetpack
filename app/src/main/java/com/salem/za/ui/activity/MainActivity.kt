package com.salem.za.ui.activity

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
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavHostController
import com.salem.za.presentation.navigation.NestedNavGraph
import com.salem.za.ui.theme.ZaTheme
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
            ZaTheme {
                NestedNavGraph()
            }

//            ZaTheme {
//
//                Surface {
//
//
//
//                }
//
//            }


        }
    }
}






