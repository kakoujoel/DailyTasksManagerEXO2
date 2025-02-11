package com.example.dailytasksmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dailytasksmanager.ui.theme.DailyTasksManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DailyTasksManagerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DailyTasksManagerUsers(
                        notification = "",
                        observation = ""
                    )
                }
            }
        }
    }
}

@Composable
fun DailyTasksManagerUsers(notification: String, observation: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.ic_task_completed),
            contentDescription = "hand"
        )
        Text(
            text = notification,
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = observation,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true, showSystemUi = true )
@Composable
fun GreetingPreview() {
    DailyTasksManagerTheme {
        DailyTasksManagerUsers(
            stringResource(R.string.tasksManager),
            stringResource(R.string.observation)
        )
    }
}