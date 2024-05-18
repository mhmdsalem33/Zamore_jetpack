package com.salem.za.ui.widgets

import androidx.annotation.ColorRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.salem.za.R
import com.salem.za.ui.theme.fonts.gilroySemiBold

@Composable
@Preview(showBackground = true )
fun CustomButton(
    @ColorRes backgroundColor: Color =  colorResource(id = R.color.blue_800),
    roundSize : Dp = 14.dp,
    text :  String = stringResource(id = R.string.continue_with_google),
    marginHorizontal : Dp = 0.dp,
    icon : Painter = painterResource(id = R.drawable.ic_google)
){
    Row (
        modifier = Modifier
            .padding(horizontal = marginHorizontal)
            .clip(RoundedCornerShape(roundSize))
            .fillMaxWidth()
            .height(60.dp)
            .background(backgroundColor),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ){

        Image(
            modifier = Modifier.size(20.dp),
            painter = icon,
            contentDescription = ""
        )

        Spacer(modifier = Modifier.width(30.dp))

        Text(
            text = text ,
            fontFamily = gilroySemiBold(),
            color = Color.White
        )
        
    }

}