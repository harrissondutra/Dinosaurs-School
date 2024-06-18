package com.estudo.dinosaursschool.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.estudo.dinosaursschool.activities.App
import com.estudo.dinosaursschool.ui.theme.DinosaursSchoolTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Toolbar() {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

    Scaffold(
        modifier = Modifier
            .nestedScroll(scrollBehavior.nestedScrollConnection)
            .heightIn(min = 50.dp, max = 80.dp),

        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.White,
                    titleContentColor = Color.Black,
                ),
                title = {
                    Box(modifier = Modifier.fillMaxWidth()
                        .fillMaxHeight(),
                        contentAlignment = Alignment.Center){
                        Text(
                            "Log In",
                            fontWeight = FontWeight(600),
                            fontSize = 36.sp,
                        )
                    }
                },
                navigationIcon = {
                   /* IconButton(onClick = { *//* do something *//* }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Localized description"
                        )
                    }*/
                },
                actions = {
                    /*IconButton(onClick = { *//* do something *//* }) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Localized description"
                        )
                    }*/
                },
                scrollBehavior = scrollBehavior,
            )
        },
    ){
        paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)){

        }
    }

}

@Preview
@Composable
private fun ToolbarPreview() {
    DinosaursSchoolTheme {
        Surface {
           Toolbar()
        }
    }
}



