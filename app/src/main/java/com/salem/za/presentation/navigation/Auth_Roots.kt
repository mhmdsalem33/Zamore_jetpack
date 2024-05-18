package com.salem.za.presentation.navigation

import kotlinx.serialization.Serializable

@Serializable
object WelcomeScreen


@Serializable
object LoginScreen


@Serializable
data class ScreenB(
    val name : String?,
    val age : Int
)



