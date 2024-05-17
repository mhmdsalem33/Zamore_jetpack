package com.salem.za.presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.salem.za.R
import com.salem.za.ui.theme.fonts.AbeeZeeRegular
import com.salem.za.ui.theme.fonts.gilroySemiBold
import com.salem.za.presentation.widgets.spaces.SpaceHeight10
import com.salem.za.presentation.widgets.spaces.SpaceHeight40


@Composable
@Preview(showBackground = true, showSystemUi = true)
fun WelcomeScreen() {
    Box(
        Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.black))
    )
    {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.welcome_image),
            contentDescription = "",
            contentScale = ContentScale.FillBounds
        )

        ConstraintLayout(
            modifier = Modifier.fillMaxSize()

        ) {

            val ( mainColumn )  = createRefs()
            val centerGuideline = createGuidelineFromTop(0.5f)

            Column(
                modifier =
                Modifier
                    .fillMaxWidth()
                    .constrainAs(mainColumn) {
                        top.linkTo(centerGuideline)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        width = Dimension.fillToConstraints
                        height = Dimension.wrapContent
                    }, horizontalAlignment = Alignment.CenterHorizontally

            ) {

                ImageIconCarrot()

                SpaceHeight10()

                Text(
                    text       = stringResource(id = R.string.welcomeMessage),
                    textAlign  = TextAlign.Center,
                    fontFamily = AbeeZeeRegular(),
                    fontSize   = 24.sp,
                    color      = Color.White
                )

                SpaceHeight10()

                Text(
                    text       = stringResource( id = R.string.welcomeSecondMessage),
                    textAlign  = TextAlign.Center,
                    fontFamily = FontFamily( Font(R.font.abee_zee_regular)),
                    fontSize   = 14.sp,
                    color      = colorResource(id = R.color.offWhite)
                )
                SpaceHeight40()

                ButtonGetStarted()

            }
        }
    }
}


@Composable
fun ImageIconCarrot() {
    Image(
        modifier = Modifier.size(85.dp),
        painter = painterResource(id = R.drawable.ic_carrot),
        contentDescription = ""
    )
}

@Composable
fun ButtonGetStarted(){
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .padding(horizontal = 25.dp),
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = colorResource(id = R.color.green)
        ),
        shape =  RoundedCornerShape(14.dp)
    ) {
        Text(
            text         = stringResource( id = R.string.get_started ),
            color        = Color.White,
            fontFamily   = gilroySemiBold()
        )
    }
}




