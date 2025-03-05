package org.example.lesson_3

fun main() {
    val phrase = "D2-D4;0"
    val spliting = phrase.split("-",";")
    val whereFrom = spliting[0]
    val where = spliting[1]
    val moveNumber = spliting[2].toInt()

    println("Откуда: $whereFrom")
    println("Куда: $where")
    println("Номер хода: $moveNumber")
}