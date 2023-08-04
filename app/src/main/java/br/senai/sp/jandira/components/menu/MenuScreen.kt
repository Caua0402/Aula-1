package br.senai.sp.jandira.components.menu

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
fun menuScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Blue)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(25.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Menu",
                fontSize = 24.sp,
                color = Color.White
            )
        }
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                modifier = Modifier.size(width = 200.dp, height = 50.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(Color.White),
                onClick = { navController.navigate("perfil/Maria da Silva") }
            ) {
                Text(
                    text = "Perfil",
                    color = Color.Blue,
                    fontSize = 16.sp
                )
            }
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
                onClick = { navController.navigate("pedidos") }
            ) {
                Text(
                    text = "Pedidos",
                    color = Color.Blue,
                    fontSize = 16.sp
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                modifier = Modifier.size(width = 200.dp, height = 50.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(Color.White),
                onClick = { navController.navigate( "login") }
            ) {
                Text(
                    text = "Sair",
                    color = Color.Blue,
                    fontSize = 16.sp
                )
            }
        }
    }
}
