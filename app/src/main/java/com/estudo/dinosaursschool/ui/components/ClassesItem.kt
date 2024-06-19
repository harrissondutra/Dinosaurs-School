package com.estudo.dinosaursschool.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.estudo.dinosaursschool.R
import com.estudo.dinosaursschool.model.Classes
import com.estudo.dinosaursschool.model.Course
import com.estudo.dinosaursschool.ui.theme.DinosaursSchoolTheme
import com.estudo.dinosaursschool.ui.theme.GreenPrincipal

@Composable
fun ClassesItem(
    classes: Classes,
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
                model = classes.image,
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
                    text = classes.name
                )

            }
            classes.description?.let {
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
private fun CourseItemPreview() {

    DinosaursSchoolTheme {
        Surface {
            ClassesItem(

                Classes(
                    name = "Teste",
                    description = "Teste de descrição"
                )
            )
        }
    }

}
