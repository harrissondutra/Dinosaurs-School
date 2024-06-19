package com.estudo.dinosaursschool.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.estudo.dinosaursschool.R
import com.estudo.dinosaursschool.model.Course
import com.estudo.dinosaursschool.ui.theme.DinosaursSchoolTheme
import com.estudo.dinosaursschool.ui.theme.GreenPrincipal

@Composable
fun CardCourseItem(
    course: Course,
    modifier: Modifier = Modifier,
    elevation: Dp = 4.dp

) {
    Card(
        modifier
            .fillMaxWidth()
            .heightIn(150.dp)
            .shadow(elevation),
    ) {
        Column {
            AsyncImage(
                model = course.image,
                contentDescription = null,
                Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                placeholder = painterResource(id = R.drawable.placeholder),
                contentScale = ContentScale.Crop
            )
            Column(
                Modifier
                    .fillMaxWidth()
                    .background(GreenPrincipal)
                    .padding(16.dp)
            ) {
                Text(
                    text = course.name
                )

            }
            course.description?.let {
                Text(
                    text = it,
                    Modifier
                        .padding(16.dp)
                )
            }
        }
    }
}

@Preview
@Composable
private fun CardProductItemPreview() {
    DinosaursSchoolTheme {
        Surface {
            CardCourseItem(
                course = Course(
                    name = "Teste",
                    description = "Teste de descrição"
                ),
            )
        }
    }
}

@Preview
@Composable
private fun CardProductItemWithDescription() {
    DinosaursSchoolTheme {
        Surface {
            CardCourseItem(
                course = Course(
                    name = "Teste",
                    description = "Teste de descrição"
                ),
            )
        }
    }
}