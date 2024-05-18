package com.salem.za.ui.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.salem.za.R
import com.salem.za.ui.theme.ChangeStatusBarColorAndNavigationBar
import com.salem.za.ui.theme.fonts.OmnesArabic
import com.salem.za.ui.theme.fonts.gilroySemiBold
import com.salem.za.ui.widgets.CustomButton
import com.salem.za.ui.widgets.spaces.SpaceHeight15
import com.salem.za.ui.widgets.spaces.SpaceHeight30
import com.salem.za.ui.widgets.spaces.SpaceHeight40
import com.salem.za.ui.widgets.spaces.SpaceHeight50
import com.salem.za.ui.widgets.spaces.SpaceHeight70

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun LoginScreen() {
    ChangeStatusBarColorAndNavigationBar(
        isStatusBarIconColorDark = true,
        isNavigationBarIconColorDark = true,
        isContentTopTransparent = false
    )

    val scroll = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = colorResource(id = R.color.white_alpha_080)
            ).verticalScroll(scroll),

        ) {


        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            painter = painterResource(id = R.drawable.vegetables_img),
            contentDescription = "",
            contentScale = ContentScale.FillWidth
        )


        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp)
        )
        {

            Column {
                Text(
                    text = stringResource(
                        id = R.string.get_your_groceries,
                    ),
                    color = colorResource(id = R.color.black),
                    fontFamily = OmnesArabic(),
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,

                )

                SpaceHeight40()


                Text(
                    text       = stringResource(id = R.string.choose_login_type),
                    fontFamily = gilroySemiBold(),
                    modifier   = Modifier.align(Alignment.CenterHorizontally),
                    fontSize   = 18.sp

                )

                SpaceHeight50()


                CustomButton(
                    backgroundColor = colorResource(id = R.color.blue_800),
                    text = stringResource(id = R.string.continue_with_google),
                    icon = painterResource(id = R.drawable.ic_google)

                )
                SpaceHeight30()


                CustomButton(
                    backgroundColor = colorResource(id = R.color.blue_900),
                    text = stringResource(id = R.string.continue_with_facebook),
                    icon = painterResource(id = R.drawable.facebook_icon)
                )

                SpaceHeight70()


            }
        }
    }
}