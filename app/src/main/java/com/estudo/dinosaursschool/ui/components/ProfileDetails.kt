package com.estudo.dinosaursschool.ui.components

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.estudo.dinosaursschool.R


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview
@Composable
fun MyProfileDetails() {

    var showSheet by remember { mutableStateOf(false) }

    if (showSheet) {
        MyBottomSheet() {
            showSheet = false
        }
    }

    Scaffold {
        Card()
        {
            Column(
                Modifier
                    .fillMaxSize()
                    .background(Color.White)
            ) {
                val imageSize = 160.dp
                Box(
                    modifier = Modifier
                        .background(Color(0xFF5DB075))
                        .fillMaxWidth()
                        .fillMaxHeight(0.25f)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.maria),
                        contentDescription = "Imagem da Maria",
                        Modifier
                            .size(imageSize)
                            .offset(y = imageSize / 4)
                            .clip(shape = CircleShape)
                            .align(Alignment.BottomCenter)
                            .border(
                                BorderStroke(2.dp, Color.White),
                                CircleShape
                            )
                            .padding(2.dp)
                            .clickable { showSheet = true }
                    )

                }
                Spacer(modifier = Modifier.height(imageSize / 4))
                Column(
                    Modifier
                        .padding(16.dp)
                        .align(Alignment.CenterHorizontally)

                ) {
                    Text(
                        text = "Victoria Robertson",
                        textAlign = TextAlign.Center,
                        fontSize = 30.sp,
                        fontWeight = FontWeight(600)
                    )
                    Text(
                        text = "A mantra goes here",
                        fontSize = 18.sp,
                        fontWeight = FontWeight(600),
                        modifier = Modifier
                            .padding(8.dp)
                            .align(Alignment.CenterHorizontally)
                    )
                }
                MySwitch()
                MyBottomBar()
            }
        }

    }
}