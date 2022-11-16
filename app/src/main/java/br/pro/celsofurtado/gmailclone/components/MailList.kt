package br.pro.celsofurtado.gmailclone.components

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.pro.celsofurtado.gmailclone.model.MailData
import br.pro.celsofurtado.gmailclone.ui.theme.mailList

@Composable
fun MailList(paddingValues: PaddingValues) {

    Box(
        modifier = Modifier
            .padding(paddingValues)
            /*.background(Color.LightGray)*/){
        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)){
            items(mailList){
                xxx ->
                MailItem(mailData = xxx)
            }
        }
    }

}

@Composable
fun MailItem(mailData: MailData, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(
                bottom = 8.dp
            )
    ) {
        Card(
            modifier = modifier
                .padding(end = 8.dp)
                .size(40.dp)
                .clip(CircleShape),
            backgroundColor = Color.LightGray
        ) {
            Text(
                text = mailData.userName[0].toString(),
                textAlign = TextAlign.Center,
                modifier = modifier.padding(8.dp)
            )
        }
        Column(modifier.weight(2.0f)) {
            Text(
                text = mailData.userName,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = mailData.subject,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = mailData.body,
                fontSize = 14.sp
            )
        }

        Column {
            Text(text = mailData.timestamp)
            IconButton(
                onClick = { Log.i("xpto", "${mailData.mailId}") },
                modifier = Modifier
                    .size(50.dp)
                    .padding(top = 16.dp)
            ) {
                Icon(
                    imageVector = Icons.Outlined.StarOutline,
                    contentDescription = mailData.subject)
            }
        }
    }
    //Divider()
}

@Preview(showBackground = true)
@Composable
fun MailItemPreview() {
    MailItem(
        mailData = MailData(
            mailId = 4,
            userName = "Celso furtado",
            subject = "Email regarding something important.",
            body = "This is regarding an important oportunity.",
            timestamp = "22:32"
        )
    )
}