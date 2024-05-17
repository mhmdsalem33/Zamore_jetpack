package com.salem.za

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.salem.za.ui.theme.ZaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

//
//        enableEdgeToEdge(
//            statusBarStyle = SystemBarStyle.light(
//                android.graphics.Color.TRANSPARENT,
//                android.graphics.Color.TRANSPARENT
//            )
//        )

     
        
        installSplashScreen().setKeepOnScreenCondition{
            true
        }

        super.onCreate(savedInstanceState)


        setContent {
            ZaTheme{

//                setStatusBarColor(color = Color.Red)



                val isSystemInDarkMode = isSystemInDarkTheme()


                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Text(text = "afsafsasf")
                }
            }
        }
    }
}



@SuppressLint("ComposableNaming")
@Composable
fun setStatusBarColor(color: Color){
    val view = LocalView.current
    if (!view.isInEditMode){
        LaunchedEffect(key1 = true) {
            val window = (view.context as Activity).window
            window.statusBarColor = color.toArgb()
            
        }
    }
}
