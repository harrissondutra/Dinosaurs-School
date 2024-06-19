package com.estudo.dinosaursschool.activities

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.estudo.dinosaursschool.ui.components.Toolbar
import com.estudo.dinosaursschool.ui.theme.DinosaursSchoolTheme
import com.estudo.dinosaursschool.ui.theme.GreenPrincipal
import com.estudo.dinosaursschool.ui.theme.GreenSecondary

class RegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge( statusBarStyle = SystemBarStyle.dark(
            scrim = Color.White.toArgb(),
        ),
            navigationBarStyle = SystemBarStyle.light(
                scrim = Color.White.toArgb(),
                darkScrim = Color.White.toArgb()
            ))
        setContent {
            DinosaursSchoolTheme {
                RegisterScreen()
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen() {
    var passwordVisible by remember { mutableStateOf(false) }
    Column(
        Modifier
            .fillMaxWidth()
    ) {
        Scaffold (topBar = {
            Toolbar("Sign Up", color = Color.White.toString(), textColor = GreenPrincipal.toArgb().toString())
        }){
            paddingValues ->
            Box(modifier = Modifier.padding(paddingValues)){
                Column (Modifier.padding(16.dp)){
                    var name by remember {
                        mutableStateOf("")
                    }
                    OutlinedTextField(
                        value = name,
                        onValueChange = {
                            name = it
                        },
                        Modifier.fillMaxWidth(),
                        label = {
                            Text(text = "Nome")
                        },
                        placeholder = {
                            Text(text = "Ex: Alberto Craveiro")
                        },
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Text,
                            imeAction = ImeAction.Next,
                            capitalization = KeyboardCapitalization.Words
                        )
                    )

                    var email by remember {
                        mutableStateOf("")
                    }
                    OutlinedTextField(
                        value = email,
                        onValueChange = {
                            email = it
                        },
                        Modifier.fillMaxWidth(),
                        label = {
                            Text(text = "Email")
                        },
                        placeholder = {
                            Text(text = "Ex: Digite sua senha")
                        },
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Email,
                            imeAction = ImeAction.Next,
                        ),
                    )

                    var password by remember {
                        mutableStateOf("")
                    }
                    OutlinedTextField(
                        value = password,
                        onValueChange = {
                            password = it
                        },
                        Modifier.fillMaxWidth(),
                        label = {
                            Text(text = "Password")
                        },
                        placeholder = {
                            Text(text = "Ex: Digite sua senha")
                        },
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Password,
                            imeAction = ImeAction.Next,
                        ),
                        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                        trailingIcon = {
                            val image = if (passwordVisible)
                                Icons.Filled.Visibility
                            else Icons.Filled.VisibilityOff
                            val description = if (passwordVisible) "Hide password" else "Show password"
                            IconButton(onClick = {passwordVisible = !passwordVisible}){
                                Icon(imageVector  = image, description)
                            }
                        }
                    )
                    Spacer(modifier = Modifier.height(32.dp))

                    Button(
                        onClick = { /* Handle login logic */ },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = GreenPrincipal,
                            contentColor = Color.White
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                    ) {
                        Text("Sign Up")
                    }
                   /* Spacer(modifier = Modifier.height(16.dp))

                   Box(modifier = Modifier.fillMaxWidth(),
                       contentAlignment = Alignment.Center){
                       Text(
                           text = "Forgot your password?",
                           color = GreenPrincipal,
                           modifier = Modifier
                               .padding(horizontal = 16.dp)
                               .clickable { *//* Handle forgot password logic *//* },
                       )
                   }*/
                }
            }

        }

    }

}

@Preview(showSystemUi = true)
@Composable
private fun RegisterPreview() {
    RegisterScreen()
}
