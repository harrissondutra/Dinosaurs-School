package com.estudo.dinosaursschool.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.estudo.dinosaursschool.model.Course
import com.estudo.dinosaursschool.sampledata.sampleCourses
import com.estudo.dinosaursschool.sampledata.sampleSections
import com.estudo.dinosaursschool.ui.components.CardCourseItem
import com.estudo.dinosaursschool.ui.components.CourseSection
import com.estudo.dinosaursschool.ui.components.CoursesItem
import com.estudo.dinosaursschool.ui.components.SearchTextField
import com.estudo.dinosaursschool.ui.components.Toolbar
import com.estudo.dinosaursschool.ui.theme.DinosaursSchoolTheme
import com.estudo.dinosaursschool.ui.theme.GreenPrincipal

class CoursesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.dark(
                scrim = GreenPrincipal.toArgb(),
            ),
            navigationBarStyle = SystemBarStyle.light(
                scrim = Color.White.toArgb(),
                darkScrim = Color.White.toArgb()
            )
        )
        setContent {
            DinosaursSchoolTheme {
                CoursesScreen(sections = sampleSections)
            }
        }
    }
}


@Composable
fun CoursesScreen(
    sections: Map<String, List<Course>>,
    searchText: String = ""
) {

    Column {
        Toolbar(
            title = "Cursos",
            navigate = "Back",
            action = "Filter"
        )
        var text by remember { mutableStateOf(searchText) }

        SearchTextField(
            searchText = text,
            onSearchChanged = {
                text = it
            }
        )

        val searchedProducts = remember(text) {
            if (text.isNotBlank()) {
                sampleCourses.filter { course ->
                    course.name.contains(text, ignoreCase = true)||
                        course.description?.contains(text, ignoreCase = true) ?: false
                }
            } else {
                emptyList()
            }
        }

        LazyColumn(
            Modifier
                .fillMaxSize()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(bottom = 16.dp)
        ) {
            if (text.isBlank()) {
                for (section in sections) {
                    val title = section.key
                    val course = section.value
                    items(course){
                            c -> CoursesItem(course = c) // Pega todos os Cursos
                    } }
            } else {
                items(searchedProducts) { c ->
                    CardCourseItem(
                        course = c,
                        Modifier.padding(horizontal = 16.dp),
                    )
                }
            }

        }
    }

}

@Preview(showSystemUi = true)
@Composable
private fun CoursesScreenPreview() {
    CoursesScreen(
        sections = sampleSections,
        searchText = "a",
    )
}
