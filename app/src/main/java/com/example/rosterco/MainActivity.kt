package com.example.rosterco

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.rosterco.naviagtion.RosterCoNavigation
import com.example.rosterco.ui.theme.RosterCoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                RosterCoNavigation()
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    RosterCoTheme {
        content()
    }
}
