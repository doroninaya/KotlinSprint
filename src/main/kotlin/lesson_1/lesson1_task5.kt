package org.example.lesson_1

import kotlin.math.abs

fun main(){
    //время взлета
    var hour = 9
    var minute = 7

    var timeSpentInSpace = hour*3600 + minute*60
    //println(timeSpentInSpace)

    //Затем измени значения переменных hour и minute, чтобы они теперь имели значение часа и минуты посадки
    hour = 10
    minute = 55
    timeSpentInSpace = abs(timeSpentInSpace - (hour*3600 + minute*60)) //время проведенное в космосе

    println(timeSpentInSpace)

    // Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
    val hoursInSpace = timeSpentInSpace/3600
    val minutesInSpace = (timeSpentInSpace - hoursInSpace*3600)/60
    val secondsInSpace = timeSpentInSpace - hoursInSpace*3600 - minutesInSpace*60
    //println(hoursInSpace)
    //print(minutesInSpace)
    //println(secondsInSpace)

    // Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
    // Значения часов, минут и секунд отображать двумя цифрами.
    print("0")
    print(hoursInSpace)
    print(":")
    print(minutesInSpace)
    print(":")
    print("0")
    print(secondsInSpace)
}