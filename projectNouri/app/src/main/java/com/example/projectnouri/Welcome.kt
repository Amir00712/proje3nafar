package com.example.projectnouri

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.material3.Text as matte
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Welcome(navController: NavController){
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        repeat(10){
            Row(Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly) {
                repeat(2){
                    GridCell()
                }

            }
        }
    }
}

@Composable
fun GridCell(){
    Card(elevation = 16.dp,
        modifier = Modifier.padding(8.dp)) {
        Box(modifier = Modifier
            .requiredSize(180.dp, 180.dp)
            .padding(8.dp)) {

            Image(painter = painterResource(id = com.example.projectnouri.R.drawable.car),
                contentDescription ="car")
            Text(text = "Car", fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
                    .background(Color.Green)
                    .align(Alignment.BottomEnd))
        }

    }
}