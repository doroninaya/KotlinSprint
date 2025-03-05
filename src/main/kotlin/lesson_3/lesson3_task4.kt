package org.example.lesson_3

fun main() {
    var fromWhere = "E2"
    var where = "E4"
    var moveNumber = 1

    println("Откуда: $fromWhere, куда: $where, № хода: $moveNumber")

    fromWhere = "D2"
    where = "D${2 + 1}"//вперед на одну клетку
    moveNumber++

    println("Откуда: $fromWhere, куда: $where, № хода: $moveNumber")
}