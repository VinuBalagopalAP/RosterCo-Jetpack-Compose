package com.example.rosterco.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
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
fun HomeTaskSection() {
    val metropolisFont = FontFamily(
        Font(R.font.metropolis_bold)
    )

    Column {
        Text(
            text = "Tasks",
            style = TextStyle(
                fontSize = 22.sp,
                fontFamily = metropolisFont,
                fontWeight = FontWeight(700),
                color = Color(0xFF000000),

                ),
            modifier = Modifier
                .padding(10.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        HSCard()
    }
}

@Composable
fun HSCard() {

    val metropolisFont = FontFamily(
        Font(R.font.metropolis_bold)
    )

    Card(
        modifier = Modifier
            .width(210.dp)
            .padding(10.dp),
        colors = CardDefaults.cardColors(Color(0xFFFEF7E9))
    ) {
        Column(
            modifier = Modifier
                .padding(10.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.personal_icon),
                contentDescription = "image description",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.size(40.dp),
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Personal",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = metropolisFont,
                    fontWeight = FontWeight(700),
                    color = Color(0xFF000000),
                )
            )
            Spacer(modifier = Modifier.height(5.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Card(
                    modifier = Modifier
                        .width(63.dp)
                        .height(32.dp),
                    colors = CardDefaults.cardColors(Color.White)
                ){
                    Text(
                        text = "3 Tasks",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontFamily = metropolisFont),
                        fontWeight = FontWeight(700),
                        color = Color(0xFFF8C579),
                    )
                }
                Icon(
                    Icons.Filled.ArrowForward,
                    "Back button",
                    tint= Color(0xFFF8C579),
                )
            }

        }
    }
}
