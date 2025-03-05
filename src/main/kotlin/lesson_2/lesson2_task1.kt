package org.example.lesson_2

fun main() {
    /*val markOfFirstStudent = 3
    val markOfSecondStudent = 4
    val markOfThirdStudent = 3
    val markOfFourthStudent = 5

    var average = (markOfFirstStudent + markOfSecondStudent + markOfThirdStudent + markOfFourthStudent)/ 4f)*/

    val marks = listOf(3, 4, 3, 5)
    val newAverage = marks.average()
    println("Average value is " + newAverage)
}