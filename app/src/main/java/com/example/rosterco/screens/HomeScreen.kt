package com.example.rosterco.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.rosterco.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {

    Scaffold()
         {
        Surface(modifier = Modifier.padding(it)) {
            HomeContent(navController = navController)
        }
    }
}

@Composable
fun HomeContent(navController: NavController) {
    Row(
        modifier = Modifier
            .padding(20.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        HiUser()
        Image(
            painterResource(R.drawable.menu),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 10.dp)
                .width(5.dp)
                .height(18.dp),

            )
    }
}

@Composable
fun HiUser() {
    val metropolisFont = FontFamily(
        Font(R.font.metropolis_bold)
    )

    Row {
        Card(
            modifier = Modifier.size(48.dp),
            shape = RectangleShape,
        ) {
            Image(
                painterResource(R.drawable.roll_img),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text = "Hi, User!",
            style = TextStyle(
                fontSize = 28.sp,
                fontFamily = metropolisFont,
                fontWeight = FontWeight(700),
                color = Color(0xFF000000),
            )
        )

    }
}