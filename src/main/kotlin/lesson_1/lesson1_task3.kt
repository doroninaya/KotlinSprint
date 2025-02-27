package org.example.lesson_1

fun main(){

    val year: String = "1961" //не меняем значения переменной VAL
    var hour: String = "09"   //меняем значение VAR
    var minute: String = "07" //меняем значение VAR

    //Выведи год, час и минуту взлета по одной переменной на каждую строку
    println("Год взлета: "+year)
    println("Час: "+hour)
    println("Минута: "+minute)

    //Затем измени значения переменных hour и minute, чтобы они теперь имели значение часа и минуты посадки
    hour = "10"
    minute = "55"

    //Выведи время посадки в одной строке
    print("Время посадки: "+hour+":"+minute)

    //либо
    //print(hour)
    //print(":")
    //print(minute)
}