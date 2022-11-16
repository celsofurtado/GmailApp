package br.pro.celsofurtado.gmailclone.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.VideoCall
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomMenuData(
    val icon: ImageVector,
    val title: String
) {

    object Mail: BottomMenuData(icon = Icons.Outlined.Mail, title = "Mail")
    object Meet: BottomMenuData(icon = Icons.Outlined.VideoCall, title = "Meet")
    object Settings: BottomMenuData(icon = Icons.Outlined.Settings, title = "Config")
    object Add: BottomMenuData(icon = Icons.Outlined.Add, title = "Add")

}