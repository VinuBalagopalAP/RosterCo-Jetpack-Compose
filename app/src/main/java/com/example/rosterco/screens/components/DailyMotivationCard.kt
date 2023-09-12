package com.example.rosterco.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rosterco.R

@Composable
fun DailyMotivationCard() {
    val metropolisFont = FontFamily(
        Font(R.font.metropolis_bold)
    )

    val interFont = FontFamily(
        Font(R.font.inter_font)
    )

    Card (
        modifier = Modifier
            .width(352.dp)
            .height(121.dp)
            .background(
                color = Color.Black,
                shape = RoundedCornerShape(size = 20.dp)
            ),
        colors= CardDefaults.cardColors(
            containerColor = Color.Black
        )
    ){
        Row {
            Image(
                painter = painterResource(id = R.drawable.star),
                contentDescription = "image description",
                contentScale = ContentScale.None,
                modifier = Modifier
                    .padding(0.dp)
                    .width(40.dp)
                    .height(40.dp)
            )
            Column {
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Daily motivation!",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontFamily = metropolisFont),
                    fontWeight = FontWeight(700),
                    color = Color(0xFFFFFFFF),
                    modifier = Modifier
                        .width(151.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "The question isn’t who’s going to let me, it’s who is going to stop me!",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = interFont),
                    fontWeight = FontWeight(400),
                    color = Color(0x75FFFFFF),
                )
            }
        }
    }
}
