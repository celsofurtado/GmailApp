package br.pro.celsofurtado.gmailclone.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.pro.celsofurtado.gmailclone.DrawerMenuData

@Composable
fun GmailDrawerMenu() {

    val menuList = listOf(DrawerMenuData.AllInboxes)

    Column() {
        Text(
            text = "Gmail",
            color = Color.Red,
            modifier = Modifier.padding(start = 20.dp, top = 20.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    }
}