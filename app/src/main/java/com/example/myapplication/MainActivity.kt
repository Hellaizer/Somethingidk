package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyScaffoldWithBarsAndFAB()

            }
        }
    }


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview
@Composable
fun MyScaffoldWithBarsAndFAB() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "My App") }
            )
        },
        bottomBar = {
            BottomAppBar {
                BottomAppBarContent()
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Действие при нажатии на FAB */ }
            ) {
                Text(text = "+")
            }
        },

        content = {
            // Основное содержимое экрана
            Column(modifier = Modifier.fillMaxSize()) {
                Text(text = "Привет, мир!")
                ElevatedCardExample()
            }
        }
    )
}

@Composable
fun BottomAppBarContent() {
    // Содержимое нижней панели
    Text(text = "Bottom Bar")
}

@Preview
@Composable
fun MyScaffoldWithBarsAndFABPreview() {
    MyScaffoldWithBarsAndFAB()
}

@Composable
fun ElevatedCardExample() {
    ElevatedCard(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(130.dp)
    ) {
        Row (
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)
                .padding(15.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Column {
                modifier =
            }
        }


            }
        )
    }
}



