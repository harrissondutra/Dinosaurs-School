package com.estudo.dinosaursschool.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.estudo.dinosaursschool.R

@Preview(name = "Course", showBackground = true)
@Composable
fun CoursesItem() {
    Row(Modifier.background(Color.White)) {

            val gradient = Brush.linearGradient(
                colors = listOf(Color.Red, Color.Blue)
            )
            Image(
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    /*.border(
                        3.dp, brush = gradient, shape = CircleShape
                    )*/,
                painter = painterResource(id = R.drawable.not_image),
                contentDescription = null,
            )


        Column(
            Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Java",
                Modifier
                    .fillMaxWidth()
            )
            Text(text = "Descrição")
        }
    }
}
