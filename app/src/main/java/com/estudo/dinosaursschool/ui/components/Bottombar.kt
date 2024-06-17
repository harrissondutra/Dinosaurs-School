package com.estudo.dinosaursschool.ui.components


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.estudo.dinosaursschool.ui.theme.GreenPrincipal

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun MyBottomBar() {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                actions = {
                    Row(
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        IconButton(onClick = { /* do something */ }) {
                            Icon(
                                Icons.Filled.Info,
                                contentDescription = "Localized description",
                                tint = GreenPrincipal
                            )
                        }
                        IconButton(onClick = { /* do something */ }) {
                            Icon(
                                Icons.Filled.Info,
                                contentDescription = "Localized description",
                                tint = GreenPrincipal
                            )
                        }
                        IconButton(onClick = { /* do something */ }) {
                            Icon(
                                Icons.Filled.Info,
                                contentDescription = "Localized description",
                                tint = GreenPrincipal
                            )
                        }
                        IconButton(onClick = { /* do something */ }) {
                            Icon(
                                Icons.Filled.Info,
                                contentDescription = "Localized description",
                                tint = GreenPrincipal
                            )
                        }
                        IconButton(onClick = { /* do something */ }) {
                            Icon(
                                Icons.Filled.Info,
                                contentDescription = "Localized description",
                                tint = GreenPrincipal
                            )
                        }

                    }

                }
            )
        },
    ) { innerPadding ->
        Text(
            modifier = Modifier.padding(innerPadding),
            text = "Example of a scaffold with a bottom app bar."
        )
    }
}