package com.example.rosterco.model

import androidx.compose.ui.graphics.Color
import com.example.rosterco.R

data class TaskCardModel(
    val id: String,
    val icon: Int,
    val taskName: String,
    val totalTaskNo: String,
    val color: Color,
    val taskNoColor: Color,
    val arrowColor: Color
)

fun getTaskCardDetails(): List<TaskCardModel>{
    return listOf(
        TaskCardModel(
            id= "1",
            icon= R.drawable.personal_icon,
            taskName = "Personal",
            totalTaskNo = "3",
            color = Color(0xFFFEF7E9),
            taskNoColor = Color(0xFFF8C579),
            arrowColor = Color(0xFFFECA90)
        ),
        TaskCardModel(
            id= "2",
            icon= R.drawable.work_icon,
            taskName = "Work",
            totalTaskNo = "3",
            color = Color(0xFFFFF1F0),
            taskNoColor = Color(0xFFFE8184),
            arrowColor = Color(0xFFFE8184)
        ),
        TaskCardModel(
            id= "3",
            icon= R.drawable.health_icon,
            taskName = "Health",
            totalTaskNo = "3",
            color = Color(0xFFECF5FF),
            taskNoColor = Color(0xFF6DAEEA),
            arrowColor = Color(0xFF6DAEEA)
        )
    )
}