package com.example.chatgpt.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.chatgpt.views.ChatScreen
import com.example.chatgpt.views.MainScreen

@Composable

fun Navigator(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "main") {
        composable("main"){
            MainScreen(navController)
        }
        composable("chat"){
            ChatScreen(navController)
        }
    }
}