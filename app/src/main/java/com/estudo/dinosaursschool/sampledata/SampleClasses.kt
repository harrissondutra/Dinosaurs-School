package com.estudo.dinosaursschool.sampledata

import com.estudo.dinosaursschool.model.Classes
import com.estudo.dinosaursschool.model.Course


val sampleClasses = listOf(
    Classes(
        name = "Java",
        description = "Curso de Java",
        image = "https://logowik.com/content/uploads/images/731_java.jpg",
    ),
    Classes(
        name = "Node",
        description = "Curso de Node",
        image = "https://ih1.redbubble.net/image.367014180.4385/tst,small,845x845-pad,1000x1000,f8f8f8.u3.jpg",
    ),
    Classes(
        name = "Python",
        description = "Curso de Python",
        image = "https://i.pinimg.com/originals/82/a2/18/82a2188c985ce75402ae44fc43fe7e5e.png",
    ),
)


val sampleSectionsClasses = mapOf(
    "Aulas" to sampleClasses,
)
