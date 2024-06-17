package com.estudo.dinosaursschool.model

data class Classes(
    val name: String,
    val courses: List<Course>? = null,
    val description: String? = null,
    val image: String? = null,
    val isChecked: Boolean? = false
)
