package com.estudo.dinosaursschool.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SearchTextField(searchText: String, onSearchChanged: (String) -> Unit) {


    OutlinedTextField(
        value = searchText,
        onValueChange = { newValue ->
            onSearchChanged(newValue)
        },
        Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(100),
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Imagem de lupa"
            )
        },
        label = {
            Text(text = "Cursos")
        },
        placeholder = {
            Text(text = "O que você procura?")
        }

    )
}

@Preview
@Composable
private fun SearchFieldPreview() {

}
