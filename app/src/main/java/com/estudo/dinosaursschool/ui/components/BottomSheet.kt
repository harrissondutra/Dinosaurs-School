package com.estudo.dinosaursschool.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyBottomSheet(onDismiss: () -> Unit) {
    val modalBottomSheetState = rememberModalBottomSheetState()

    ModalBottomSheet(
        onDismissRequest = { onDismiss() },
        sheetState = modalBottomSheetState,
        dragHandle = { BottomSheetDefaults.DragHandle() },
    ) {
        Column(
            Modifier
                .padding(16.dp)
                .align(Alignment.CenterHorizontally)

        ) {
            Text(
                text = "Draw Header",
                textAlign = TextAlign.Center,
                fontSize = 34.sp,
                fontWeight = FontWeight(600),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)

            )
            Text(
                text = "Consequat velit qui adipisicing sunt do reprehenderit ad laborum tempor ullamco exercitation.",
                fontSize = 18.sp,
                fontWeight = FontWeight(600),
                modifier = Modifier
                    .padding(8.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Button(
                onClick = { onDismiss() },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF5DB075)
                ),
                modifier = Modifier
                    .padding(2.dp)
                    .align(Alignment.CenterHorizontally)
                    .clip(RoundedCornerShape(20.dp))
                    .fillMaxWidth(0.5f)
                    .background(
                        Color(0xFFF2F2F2),
                        shape = RoundedCornerShape(20.dp)

                    )
            ) {
                Text(
                    text = "Click Me",
                    fontSize = 18.sp,
                    fontWeight = FontWeight(600),
                    modifier = Modifier
                        .padding(8.dp)
                )
            }
            Text(
                text = "Secondary Action.",
                fontSize = 16.sp,
                color = Color(0xFF5DB075),
                fontWeight = FontWeight(600),
                modifier = Modifier
                    .padding(8.dp)
                    .align(Alignment.CenterHorizontally)
            )
        }
    }
}