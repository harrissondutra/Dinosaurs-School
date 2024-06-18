package com.estudo.dinosaursschool.sampledata

import com.estudo.dinosaursschool.model.Course


val sampleBackend = listOf(
    Course(
        name = "Java",
        description = "Curso de Java",
        image = "https://logowik.com/content/uploads/images/731_java.jpg",
    ),
    Course(
        name = "Node",
        description = "Curso de Node",
        image = "https://ih1.redbubble.net/image.367014180.4385/tst,small,845x845-pad,1000x1000,f8f8f8.u3.jpg",
    ),
    Course(
        name = "Python",
        description = "Curso de Python",
        image = "https://i.pinimg.com/originals/82/a2/18/82a2188c985ce75402ae44fc43fe7e5e.png",
    ),
)

val sampleFrontend = listOf(
    Course(
        name = "Angular",
        description = "Curso de Angular",
        image = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Angular_full_color_logo.svg/2048px-Angular_full_color_logo.svg.png",
    ),
    Course(
        name = "HTML",
        description = "Curso de HTML",
        image = "https://blog.menzzo.com.br/wp-content/uploads/2024/04/Aprenda-HTML-em-5-Minutos-de-Maneira-Simples-1.jpg",
    ),
    Course(
        name = "CSS",
        description = "Curso de CSS",
        image = "https://logowik.com/content/uploads/images/123_css3.jpg",
    ),
)

val sampleCourses: List<Course> = listOf(
    Course(
        name = "Scrum",
        description = "Curso de Scrum",
        image = "https://img.freepik.com/vetores-premium/cone-de-vetor-scrum-para-web_116137-5749.jpg",
    ),
    Course(
        name = "Itil",
        description = "Curso de Itil",
        image = "https://t4.ftcdn.net/jpg/04/46/00/79/360_F_446007947_zKgjgfhAD7qufUPIqeeqDl3Le6cy8QvT.jpg",
    ),
    Course(
        name = "Cobit",
        description = "Curso de Cobit",
        image = "https://iconape.com/wp-content/png_logo_vector/cobit-logo.png",
    ),
//    *sampleBackend.toTypedArray(), *sampleFrontend.toTypedArray(),
)

val sampleSections = mapOf(
    "Governança" to sampleCourses,
    "Backend" to sampleBackend,
    "Frontend" to sampleFrontend
)
