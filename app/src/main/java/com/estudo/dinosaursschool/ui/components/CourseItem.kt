package com.estudo.dinosaursschool.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.estudo.dinosaursschool.R
import com.estudo.dinosaursschool.model.Course
import com.estudo.dinosaursschool.ui.theme.DinosaursSchoolTheme

@Composable
fun CoursesItem(course: Course, modifier: Modifier = Modifier) {
    Row(Modifier.background(Color.White)) {
        val imageSize = 100.dp
        Box(modifier = Modifier
            ){
            AsyncImage(
                model = course.image,
                contentDescription = null,
                Modifier
                    .size(imageSize)
                    .clip(shape = CircleShape)
                    .align(Alignment.BottomCenter),
                contentScale = ContentScale.Crop
            )
        }


        Column(
            Modifier.fillMaxWidth()
        ) {
            Text(
                text = course.name,
                Modifier
                    .fillMaxWidth().padding(start = 16.dp, top = 10.dp)
            )
            Text(
                text = course.description.toString(),
                Modifier.padding(start = 16.dp, top = 8.dp, bottom = 16.dp)
            )
        }
    }
}

@Preview
@Composable
private fun CourseItemPreview() {

    DinosaursSchoolTheme {
        Surface {
            CoursesItem(

                Course(
                    name = "Teste",
                    description = "Teste de descrição"
                )
            )
        }
    }

}
