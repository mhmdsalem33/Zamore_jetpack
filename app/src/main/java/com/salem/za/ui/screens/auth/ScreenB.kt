package com.salem.za.ui.screens.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.salem.za.ui.theme.ChangeStatusBarColorAndNavigationBar

@Composable
fun Screen(navController: NavHostController, name: String?, age: Int ) {
    Surface(
        modifier = Modifier.fillMaxSize().background(Color.White)
    ) {
//        ChangeStatusBarColorAndNavigationBar(
//            isStatusBarIconColorDark = true ,
//            isNavigationBarIconColorDark = true,
//            isContentTopTransparent = false
//        )
       Column {
           Text(text = "$name")
           Text(text = "$age")
       }

    }
}