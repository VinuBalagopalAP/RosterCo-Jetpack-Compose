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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
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
import com.example.rosterco.model.TaskCardModel
import com.example.rosterco.model.getTaskCardDetails


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
        HSCard(taskList = getTaskCardDetails())
    }
}

@Composable
fun HSCard(taskList: List<TaskCardModel>) {

    val metropolisFont = FontFamily(
        Font(R.font.metropolis_bold)
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.padding(8.dp),
    ){
        items(taskList){ taskCardModel ->
            Card(
                modifier = Modifier
                    .width(210.dp)
                    .padding(10.dp),
                colors = CardDefaults.cardColors(taskCardModel.color)
            ) {
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                ) {
                    Image(
                        painter = painterResource(id = taskCardModel.icon),
                        contentDescription = "image description",
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier.size(40.dp),
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = taskCardModel.taskName,
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
                                text = "${taskCardModel.totalTaskNo} Tasks",
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    fontFamily = metropolisFont),
                                fontWeight = FontWeight(700),
                                color = taskCardModel.taskNoColor,
                            )
                        }
                        Icon(
                            Icons.Filled.ArrowForward,
                            "Back button",
                            tint= taskCardModel.arrowColor,
                        )
                    }
                }
            }
        }
    }
}