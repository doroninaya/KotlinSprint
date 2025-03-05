package org.example.lesson_3

fun main() {
    var greetingText: String
    val customerName = "Иван"

    //приветствие для дня
    greetingText = "Добрый день, $customerName! Рады приветствовать вас!"
    println(greetingText)

    //приветствие для вечера
    greetingText = "Вечер добрый, $customerName! Спасибо, что вы с нами!"
    println(greetingText)
}