package com.example.chatgpt.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.chatgpt.R

@Composable

fun ChatScreen(navController: NavController){
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
            Spacer(modifier = Modifier.height(30.dp))
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start){
                Spacer(modifier = Modifier.width(20.dp))
                Button(modifier = Modifier , onClick = {navController.navigate("main")},colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF53d0d6),
                    contentColor = Color.White)) {
                Text("Back")
                }
            }
            Spacer(modifier = Modifier.height(350.dp))
            LottieAnimationScreenSmall()
            Spacer(modifier = Modifier.height(400.dp))
            ChatInputBar( )
            Spacer(modifier = Modifier.height(10.dp))
        }

    }
}
@Composable
fun LottieAnimationScreenSmall() {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.animation))

    LottieAnimation(
        composition = composition,
        iterations = LottieConstants.IterateForever,
        modifier = Modifier
            .size(100.dp)
    )
}
@Composable
fun ChatInputBar() {
    var text by remember { mutableStateOf(TextFieldValue("")) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF53d0d6))
            .padding(1.dp),
        verticalAlignment = Alignment.Bottom
    ) {
        BasicTextField(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier
                .weight(1f)
                .padding(8.dp)
                .background(Color.White)
                .padding(8.dp)
        )
        Spacer(modifier = Modifier.width(9.dp))
        Button(
            onClick = { println("Enviar") },
            modifier = Modifier,colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color(0xFF53d0d6))
        ) {
            Text("Send", fontSize = 18.sp)
        }
    }
}