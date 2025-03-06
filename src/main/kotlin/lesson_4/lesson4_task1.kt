package org.example.lesson_4

fun main() {
    val totalTables = 13
    val bookedTablesToday = 13
    val bookedTablesTomorrow = 9

    val availableTablesToday = totalTables > bookedTablesToday
    val availableTablesTomorrow = totalTables > bookedTablesTomorrow

    println(
        "[Доступность столиков на сегодня: $availableTablesToday],\n" +
                "[Доступность столиков на завтра: $availableTablesTomorrow]."
    )
}