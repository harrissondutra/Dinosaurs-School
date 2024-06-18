package com.estudo.dinosaursschool.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.estudo.dinosaursschool.model.Course
import com.estudo.dinosaursschool.sampledata.sampleCourses
import com.estudo.dinosaursschool.ui.theme.DinosaursSchoolTheme

@Composable
fun CourseSection(
    title: String,
    products: List<Course>,
    modifier: Modifier = Modifier
) {
    Column (modifier){
        Text(
            text = title,
            Modifier.padding(
                start = 16.dp,
                end = 16.dp
            ),
            fontSize = 20.sp,
            fontWeight = FontWeight(400)
        )
        LazyColumn(
            Modifier
                .padding(
                    top = 8.dp
                )
                .fillMaxWidth().height(100.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(horizontal = 16.dp) //Adiciona espaços no início e fom da LazyRow, pode também ser vertical
        ) {
            items(sampleCourses){
                p -> CoursesItem(course = p)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductsSectionPreview() {
    DinosaursSchoolTheme {
        Surface {
            CourseSection("Cursos", products = sampleCourses)
        }
    }
}
