package org.example.lesson_2

const val NUMBER_OF_MINUTES_IN_HOUR = 60
fun main() {
    val departureHours = 9
    val departureMinutes = 39
    val travelTime = 457

    val departureTimeInMinutes = NUMBER_OF_MINUTES_IN_HOUR * departureHours + departureMinutes
    val arrivalTimeInMinutes = departureTimeInMinutes + travelTime

    val arrivalHours = arrivalTimeInMinutes / NUMBER_OF_MINUTES_IN_HOUR
    val arrivalMinutes = arrivalTimeInMinutes % arrivalHours

//похоже форматировать необязательно
//    val formattedArrivalHours = arrivalHours.toString()
//    val formattedArrivalMinutes = arrivalMinutes.toString()

    print("Время прибытия поезда $arrivalHours:$arrivalMinutes")
}