package br.pro.celsofurtado.gmailclone.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import br.pro.celsofurtado.gmailclone.model.BottomMenuData

@Composable
fun HomeBottomMenu() {

    val items = listOf(
        BottomMenuData.Mail,
        BottomMenuData.Meet,
        BottomMenuData.Add,
        BottomMenuData.Settings
    )

    BottomNavigation(
        backgroundColor = Color.White,
        contentColor = Color.Black
    ) {
        items.forEach {
            BottomNavigationItem(
                selected = false,
                onClick = {},
                icon = { Icon(imageVector = it.icon, contentDescription = it.title) },
                label = { Text(text = it.title) },
                alwaysShowLabel = true
            )
        }
    }

}