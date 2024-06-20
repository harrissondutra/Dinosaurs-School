package com.estudo.dinosaursschool.sampledata

import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.estudo.dinosaursschool.model.Classes
import com.estudo.dinosaursschool.model.Course


val sampleClasses = listOf(
    Classes(
        name = "Java",
        description = LoremIpsum(20).values.first(),
        image = "https://logowik.com/content/uploads/images/731_java.jpg",
    ),
    Classes(
        name = "Node",
        description = LoremIpsum(20).values.first(),
        image = "https://ih1.redbubble.net/image.367014180.4385/tst,small,845x845-pad,1000x1000,f8f8f8.u3.jpg",
    ),
    Classes(
        name = "Python",
        description = LoremIpsum(20).values.first(),
        image = "https://i.pinimg.com/originals/82/a2/18/82a2188c985ce75402ae44fc43fe7e5e.png",
    ),
)


val sampleSectionsClasses = mapOf(
    "Aulas" to sampleClasses,
)
