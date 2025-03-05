package org.example.lesson_1

const val NUMBER_OF_SECONDS_IN_HOUR = 3600
const val NUMBER_OF_SECONDS_IN_MINUTE = 60

fun main() {
    val seconds = 6480 // проведенное в космосе в секундах
    // Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
    val hoursInSpace = seconds / NUMBER_OF_SECONDS_IN_HOUR
    val minutesInSpace = (seconds % NUMBER_OF_SECONDS_IN_HOUR) / NUMBER_OF_SECONDS_IN_MINUTE
    val secondsInSpace = (seconds % NUMBER_OF_SECONDS_IN_HOUR) % NUMBER_OF_SECONDS_IN_MINUTE

    // Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
    val formattedTime = String.format("%02d:%02d:%02d", hoursInSpace, minutesInSpace, secondsInSpace)
    println("Время, проведенное в космосе $formattedTime")
}