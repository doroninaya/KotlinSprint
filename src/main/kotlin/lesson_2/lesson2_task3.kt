package org.example.lesson_2

fun main() {
    val NUMBER_OF_MINUTES_IN_HOUR = 60
    val departureHours = 9
    val departureMinutes = 39
    val travelTime = 457

    val departureTimeInMinutes = NUMBER_OF_MINUTES_IN_HOUR * departureHours + departureMinutes
    val arrivalTimeInMinutes = departureTimeInMinutes + travelTime

    val arrivalHours = arrivalTimeInMinutes / NUMBER_OF_MINUTES_IN_HOUR
    val arrivalMinutes = arrivalTimeInMinutes % arrivalHours

    val formattedArrivalHours = arrivalHours.toString()
    val formattedArrivalMinutes = arrivalMinutes.toString()

    print("Время прибытия поезда $formattedArrivalHours:$formattedArrivalMinutes")
}