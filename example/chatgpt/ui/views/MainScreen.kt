package com.example.chatgpt.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.ui.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import com.airbnb.lottie.compose.LottieConstants
import com.example.chatgpt.R


@Composable
fun MainScreen(navController: NavController) {
    Box(
        modifier = Modifier

            .fillMaxSize()
            .background(Color(0xFFFFFFFF))
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            LottieAnimationScreen()

            Spacer(modifier = Modifier.height(100.dp))

            Button(
                modifier = Modifier.width(370.dp).height(55.dp),colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF53d0d6),
                    contentColor = Color.White),
                onClick = { navController.navigate("chat") }) {
                Text("Log In",fontSize = 25.sp)
            }
            Spacer(modifier = Modifier.height(16.dp))

            Button(
                modifier = Modifier.width(370.dp).height(55.dp),colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF53d0d6),
                    contentColor = Color.White),
                onClick = { navController.navigate("chat") }) {
                Text("Continue with Google",fontSize = 24.sp)
            }
            Spacer(modifier = Modifier.height(16.dp))

            Button(
                modifier = Modifier.width(370.dp).height(55.dp),colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF53d0d6),
                    contentColor = Color.White),
                onClick = { navController.navigate("chat") }) {
                Text("Sign Up with Email", fontSize = 24.sp)
            }
            Spacer(modifier = Modifier.height(60.dp))
        }
    }
}

@Composable
fun LottieAnimationScreen() {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.animation))

    LottieAnimation(
        composition = composition,
        iterations = LottieConstants.IterateForever,
        modifier = Modifier
            .fillMaxWidth()
            .height(450.dp)
    )
}
