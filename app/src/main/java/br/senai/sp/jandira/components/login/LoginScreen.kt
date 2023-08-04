package br.senai.sp.jandira.components.login.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun loginScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Red)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(25.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Login",
                fontSize = 24.sp,
                color = Color.White
            )
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                modifier = Modifier.size(width = 200.dp, height = 50.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(Color.White),
                onClick = { navController.navigate("menu") }
            ) {
                Text(
                    text = "Entrar",
                    color = Color.Blue,
                    fontSize = 16.sp
                )
            }
        }
    }
}

