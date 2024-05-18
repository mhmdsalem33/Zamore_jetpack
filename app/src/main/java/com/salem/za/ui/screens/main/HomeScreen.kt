package com.salem.za.ui.screens.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import kotlinx.serialization.Serializable


@Composable
fun HomeScreen(){
    Surface (
        modifier =  Modifier.fillMaxSize()
    ){
        Column(
            modifier =  Modifier.fillMaxSize()
        ) {
            Text(text = "Home")
        }
    }

}

@Serializable
object Home