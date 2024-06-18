package com.estudo.dinosaursschool.sampledata

import com.estudo.dinosaursschool.model.Course


val sampleBackend = listOf(
    Course(
        name = "Java",
        description = "Curso de Java",
        image = "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg",
    ),
    Course(
        name = "Node",
        description = "Curso de Node",
        image = "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg",
    ),
    Course(
        name = "Pythos",
        description = "Curso de Python",
        image = "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg",
    ),
)

val sampleFrontend = listOf(
    Course(
        name = "Angular",
        description = "Curso de Angular",
        image = "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg",
    ),
    Course(
        name = "HTML",
        description = "Curso de HTML",
        image = "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg",
    ),
    Course(
        name = "CSS",
        description = "Curso de CSS",
        image = "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg",
    ),
)

val sampleCourses: List<Course> = listOf(
    Course(
        name = "Scrum",
        description = "Curso de Scrum",
        image = "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg",
    ),
    Course(
        name = "Itil",
        description = "Curso de Itil",
        image = "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg",
    ),
    Course(
        name = "Cobit",
        description = "Curso de Cobit",
        image = "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg",
    ),
    *sampleBackend.toTypedArray(), *sampleFrontend.toTypedArray(),
)

val sampleSections = mapOf(
    "Governança" to sampleCourses,
    "Backend" to sampleBackend,
    "Frontend" to sampleFrontend
)
