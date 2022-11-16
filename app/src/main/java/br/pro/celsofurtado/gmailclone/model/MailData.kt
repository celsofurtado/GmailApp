package br.pro.celsofurtado.gmailclone.model

import java.sql.Timestamp

data class MailData(
    val mailId: Int,
    val userName: String,
    val subject: String,
    val body: String,
    val timestamp: String
) {
}