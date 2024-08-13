package com.example.chatgpt.views

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.chatgpt.navigation.Navigator
import com.example.chatgpt.theme.ChatGPTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChatGPTTheme {
                Navigator()
                }
            }
        }
    }


@Composable
fun Greeting() {
    Navigator()

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ChatGPTTheme {
        Greeting()
    }
}