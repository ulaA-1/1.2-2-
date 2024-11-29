package ru.netology

fun main() {
    var likes = 95

    val wordForm = if (likes % 10 == 1 && likes % 100 != 11) {
        "человеку"
    } else if (likes % 10 in 2..4 && likes % 100 !in 12..14) {
        "людям"
    } else {
        "людям"
    }

    println("Понравилось $likes $wordForm")
}