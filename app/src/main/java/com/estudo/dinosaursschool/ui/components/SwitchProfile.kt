package com.estudo.dinosaursschool.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun MySwitch() {
    var statusSwitch by remember { mutableStateOf(true) }
    Column (
        Modifier
            .fillMaxSize()
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(40.dp))
                .background(Color(0xFFF2F2F2))
        ){
            if (statusSwitch) {
                Button(
                    onClick = { statusSwitch = true },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF5DB075)
                    ),
                    modifier = Modifier
                        .padding(2.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .fillMaxWidth(0.5f)
                        .background(
                            Color(0xFFF2F2F2),
                            shape = RoundedCornerShape(20.dp)
                        )
                ) {
                    Text(
                        text = "Posts",
                        Modifier.padding(12.dp))
                }
                TextButton(
                    onClick = { statusSwitch = false},
                ) {
                    Text(text = "Photos", Modifier.padding(12.dp), color = Color(0xFFBDBDBD))
                }

            } else {

                TextButton(
                    onClick = { statusSwitch = true },
                ) {
                    Text(text = "Posts", Modifier.padding(12.dp), color = Color(0xFFBDBDBD))
                }
                Button(
                    onClick = { statusSwitch = false },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF5DB075)
                    ),
                    modifier = Modifier
                        .padding(2.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .fillMaxWidth(0.65f)
                        .background(
                            Color(0xFFF2F2F2),
                            shape = RoundedCornerShape(20.dp)
                        )
                ) {
                    Text(
                        text = "Photos",
                        Modifier.padding(12.dp))
                }
            }

        }
    }
}