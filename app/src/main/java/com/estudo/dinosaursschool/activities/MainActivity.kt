package com.estudo.dinosaursschool.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import com.estudo.dinosaursschool.ui.theme.DinosaursSchoolTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.dark(
                scrim = Color.White.toArgb(),
            ),
            navigationBarStyle = SystemBarStyle.light(
                scrim = Color.White.toArgb(),
                darkScrim = Color.White.toArgb()
            )
        )
        setContent {
            DinosaursSchoolTheme {
                Surface {
                    App()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() {
    Column {
        Scaffold { paddingValues ->
            Box(modifier = Modifier.padding(paddingValues)) {
                LoginScreen()
            }

        }
    }


}

@Preview(showSystemUi = true)
@Composable
private fun AppPreview() {
    App()

}


