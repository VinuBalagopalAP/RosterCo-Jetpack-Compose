package com.example.rosterco.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.rosterco.R
import com.example.rosterco.naviagtion.RosterCoRoutes

@Composable
fun RollScreen(navController: NavController) {

    val ranchoFont = FontFamily(
        Font(R.font.rancho_regular)
    )

    val indieFlowerFont = FontFamily(
        Font(R.font.indie_flower_regular)
    )

    val metropolisFont = FontFamily(
        Font(R.font.metropolis_bold)
    )

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth(),) {
        Spacer(modifier = Modifier.height(48.dp))
        Text(
            text = "Roster Co",
            style = TextStyle(
                fontSize = 52.sp,
                fontFamily = ranchoFont),
            fontWeight = FontWeight(400),
            color = Color(0xFF000000) ,
        )
        Spacer(modifier = Modifier.height(40.dp))
        Card(
            modifier = Modifier
                .size(300.dp),
            colors = CardDefaults.cardColors(Color.White),
            shape = RoundedCornerShape(10.dp)
        ){
            Image(
                painterResource(R.drawable.roll_img),
                contentDescription = "",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.fillMaxSize()
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Welcome!",
            style = TextStyle(
                fontSize = 25.sp,
                fontFamily = metropolisFont,
                fontWeight = FontWeight(700),
                color = Color(0xFF000000),
            )
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Welcome to our little space, Here you can make yourself better each day!",
            style = TextStyle(
                fontSize = 21.sp,
                fontFamily = indieFlowerFont,
                fontWeight = FontWeight(400),
                color = Color(0xFF717171),
                textAlign = TextAlign.Center,
            )
        )
        Spacer(modifier = Modifier.height(100.dp))
        Row(
            modifier = Modifier
                .align(Alignment.End)
                .padding(20.dp)
        ) {
            Box(
                modifier = Modifier
                    .shadow(
                        elevation = 4.dp,
                        spotColor = Color(0x40000000),
                        ambientColor = Color(0x40000000)
                    )
                    .width(55.dp)
                    .height(53.dp)
                    .background(
                        color = Color(0xFF000000),
                        shape = RoundedCornerShape(size = 15.dp)
                    )
                    .clickable {
                        println("navigating")
                        navController.navigate(route = RosterCoRoutes.HomeScreen.name)
                        println("navigated")
                    }
            ){
                Icon(
                    Icons.Filled.ArrowForward,
                    "Back button",
                    tint= Color.White,
                    modifier= Modifier
                        .align(Alignment.Center)
                )
            }
        }
    }
}