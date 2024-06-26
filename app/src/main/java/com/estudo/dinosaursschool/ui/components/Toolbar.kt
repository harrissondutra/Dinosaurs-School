package com.estudo.dinosaursschool.ui.components

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import com.estudo.dinosaursschool.ui.theme.GreenPrincipal

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Toolbar(
    title: String,
    navigate: String? = null,
    action: String? = null,
    color: String = "#FFFFFF",
    textColor: String = "#000000"
) {


    Scaffold(
        modifier = Modifier

            .fillMaxWidth()
            .height(100.dp)
            .background(Color(color.toColorInt())),
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(color.toColorInt()),
                    titleContentColor = Color(textColor.toColorInt()),
                ),
                title = {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            title,
                            fontWeight = FontWeight(600),
                            fontSize = 36.sp,
                        )
                    }
                },
                navigationIcon = {

                    Box(
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        if (navigate != null) {
                            Text(text = navigate, color = GreenPrincipal, fontSize = 20.sp)
                        } else {
                            IconButton(onClick = { "do something" }) {
                                Icon(
                                    imageVector = Icons.Filled.ArrowDropDown,
                                    contentDescription = "Localized description"
                                )
                            }
                        }
                    }

                },
                actions = {
                    Box(
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        if (action != null) {
                            Text(text = action, color = GreenPrincipal, fontSize = 20.sp)
                        } else {
                            IconButton(onClick = { "do something" }) {
                                Icon(
                                    imageVector = Icons.Filled.Menu,
                                    contentDescription = "Localized description"
                                )
                            }
                        }
                    }


                }, modifier = Modifier.fillMaxHeight()
            )
        },
    ) {
    }
}