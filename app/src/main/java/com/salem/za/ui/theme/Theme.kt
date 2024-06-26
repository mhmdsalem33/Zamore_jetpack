package com.salem.za.ui.theme

import android.app.Activity
import android.os.Build
import androidx.annotation.ColorRes
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.colorResource
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import com.salem.za.R

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun ZaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    ChangeStatusBarColorAndNavigationBar()

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )




}


@Composable
fun ChangeStatusBarColorAndNavigationBar(
    statusBarColor: Int = Color.Transparent.toArgb(),
    navigationBarColor: Int = Color.Transparent.toArgb(),
    isStatusBarIconColorDark: Boolean = false,
    isNavigationBarIconColorDark: Boolean = false,
    isContentTopTransparent: Boolean = false
) {
    val view = LocalView.current
    val window = (view.context as Activity).window


    if (!view.isInEditMode) {
        SideEffect {
            WindowCompat.setDecorFitsSystemWindows(window, isContentTopTransparent)
            window.statusBarColor = statusBarColor
            window.navigationBarColor = navigationBarColor
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars =
                isStatusBarIconColorDark
            WindowCompat.getInsetsController(window, view).isAppearanceLightNavigationBars =
                isNavigationBarIconColorDark
        }
    }
}


//@Composable
//fun ChangeStatusBarColorAndNavigationBar(
//    statusBarColor     : Int = Color.Transparent.toArgb(),
//    navigationBarColor : Int = Color.Transparent.toArgb(),
//    isDarkTheme        : Boolean = false
//){
//    val view = LocalView.current
//    if (!view.isInEditMode) {
//        SideEffect {
//            val window = (view.context as Activity).window
//            window.statusBarColor     = statusBarColor
//            window.navigationBarColor = navigationBarColor
//            WindowCompat.setDecorFitsSystemWindows( window, false )
//            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = isDarkTheme
//            WindowCompat.getInsetsController(window, view).isAppearanceLightNavigationBars = isDarkTheme
//
//        }
//    }
//
//
//
//}