package com.estudo.dinosaursschool.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.AlertDialog
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.estudo.dinosaursschool.model.Classes
import com.estudo.dinosaursschool.sampledata.sampleClasses
import com.estudo.dinosaursschool.sampledata.sampleSectionsClasses
import com.estudo.dinosaursschool.ui.components.CardClassesItem
import com.estudo.dinosaursschool.ui.components.SearchTextField
import com.estudo.dinosaursschool.ui.components.Toolbar
import com.estudo.dinosaursschool.ui.theme.DinosaursSchoolTheme
import com.estudo.dinosaursschool.ui.theme.GreenPrincipal

class ClassesActivity : ComponentActivity() {


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
                ClassesScreen(sections = sampleSectionsClasses)
            }
        }
    }
}

@Composable
fun ClassesScreen(
    sections: Map<String, List<Classes>>,
    searchText: String = "",

    ) {
    var countCheck = 0
    Column {
        Toolbar(
            title = "Aulas",
            navigate = "Back",
            action = "Filter",
            color = "#FFFFFF",
            textColor = "#000000"
        )
        var text by remember { mutableStateOf(searchText) }

        SearchTextField(
            searchText = text,
            onSearchChanged = {
                text = it
            }
        )

        val searchedClasses = remember(text) {
            if (text.isNotBlank()) {
                sampleClasses.filter { classes ->
                    classes.name.contains(text, ignoreCase = true) ||
                            classes.description?.contains(text, ignoreCase = true) ?: false
                }
            } else {
                emptyList()
            }
        }

        // State to track if all classes are completed
        var allClassesCompleted by remember { mutableStateOf(false) }

        LazyColumn(
            Modifier
                .fillMaxSize()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(bottom = 16.dp)
        ) {
            if (text.isBlank()) {
                sections.forEach { (title, classes) ->

                    items(classes) { c ->
                        val checkedState = remember { mutableStateOf(false) }

                        ClassItem(
                            classes = c,
                            checked = checkedState.value,
                            onCheckedChange = { isChecked ->
                                checkedState.value = isChecked
                                val allInSectionChecked = classes.all { checkedState.value }
                                allClassesCompleted = allInSectionChecked
                            }
                        )
                    }
                }
            } else {
                items(searchedClasses) { c ->
                    CardClassesItem(
                        classes = c,
                        Modifier.padding(horizontal = 16.dp),
                    )
                }
            }
        }

        if (allClassesCompleted) {
            
                AlertDialog(
                    onDismissRequest = { allClassesCompleted = false },
                    title = { Text("Parabéns!") },
                    text = { Text("Você concluiu todas as aulas. Deseja gerar o certificado?") },
                    confirmButton = {
                        TextButton(
                            onClick = {
                                // Implementar lógica para gerar o certificado
                                allClassesCompleted = false
                            }
                        ) {
                            Text("Gerar Certificado")
                        }
                    },
                    dismissButton = {
                        TextButton(
                            onClick = { allClassesCompleted = false }
                        ) {
                            Text("Cancelar")
                        }
                    }
                )
        }
    }
}

@Composable
fun ClassItem(
    classes: Classes,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    Column {
        CardClassesItem(
            classes = classes,
            Modifier.padding(horizontal = 16.dp),
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {
            Box {
                Text("Curso realizado")
            }
            Checkbox(
                modifier = Modifier.padding(end = 10.dp),
                checked = checked,
                onCheckedChange = onCheckedChange
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CoursesScreenPreview() {
    ClassesScreen(
        sections = sampleSectionsClasses,
        searchText = "",
    )
}
