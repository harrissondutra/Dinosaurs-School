package com.estudo.dinosaursschool.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.estudo.dinosaursschool.R
import com.estudo.dinosaursschool.ui.theme.GreenPrincipal
import com.estudo.dinosaursschool.ui.theme.MessageIncoming
import kotlinx.coroutines.launch

//=================================================================
data class Message(val mensagem: String, val tipo: Boolean)

val m1 = Message(mensagem = "Ola", tipo = false)
val m2 = Message(mensagem = "Vc sumiu", tipo = false)
//=================================================================

@Preview
@Composable
fun MyChatSend() {

    val myList = remember { mutableStateListOf<Message>(m1, m2) }
    var value by remember { mutableStateOf("") }

    val listState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()

    LaunchedEffect(Unit) {
        coroutineScope.launch {
            listState.scrollToItem(myList.size - 1)
        }
    }

    LazyColumn(
        state = listState,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp)
    ) {
        //Percorre a lista de mensagens
        for (element in myList)
            item {
                NewMessage(element.mensagem, element.tipo)
            }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        TextField(
            value = value,
            onValueChange = { value = it },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = MessageIncoming,
                unfocusedContainerColor = MessageIncoming,
                disabledIndicatorColor = Color.Transparent
            ),
            modifier = Modifier
                .fillMaxWidth()
                .imePadding()
                .padding(16.dp)
                .clip(RoundedCornerShape(20.dp))
                .border(0.dp, Color.White, shape = RoundedCornerShape(0.dp))
                .background(
                    Color(0xFFF2F2F2),
                    shape = RoundedCornerShape(20.dp)
                )
                .align(Alignment.BottomCenter),

            placeholder = { Text("Message here...") },
            trailingIcon = {
                IconButton(onClick = {
                    //Adiciona nova mensagem na lista
                    myList.add(Message(value, true))
                }) {
                    Icon(
                        painter = painterResource(id = R.drawable.arrow_circle_up_fill),
                        contentDescription = "",
                        tint = GreenPrincipal,
                        modifier = Modifier.size(50.dp)
                    )
                }
            }
        )
    }
}


@Composable
fun NewMessage(texto: String, Tipo: Boolean) {
    //Exibe a mensagem
    //Tipo: false = recebida e true = enviada
    if (Tipo) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = texto, color = Color.Black,
                modifier = Modifier
                    .clip(
                        RoundedCornerShape(
                            topStart = 48f,
                            topEnd = 48f,
                            bottomStart = 48f,
                            bottomEnd = 0f
                        )
                    )
                    .background(MessageIncoming)
                    .padding(24.dp)
            )
        }
    } else {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = texto,
                color = Color.White,
                modifier = Modifier
                    .clip(
                        RoundedCornerShape(
                            topStart = 48f,
                            topEnd = 48f,
                            bottomStart = 0f,
                            bottomEnd = 48f
                        )
                    )
                    .background(GreenPrincipal)
                    .padding(24.dp)
            )
        }
    }
}