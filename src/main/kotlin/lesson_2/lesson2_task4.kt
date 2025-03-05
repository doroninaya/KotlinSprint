package org.example.lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val bonusPercentage = 20 // Проценты
    // Преобразование процента в десятичное значение (20% = 0.2)
    val bonusFactor = bonusPercentage / 100.0

    val bufCrystalOre = (bonusFactor * crystalOre).toInt()
    val bufIronOre = (bonusFactor * ironOre).toInt()

    println("Koличество бонусной кристаллической руды: $bufCrystalOre")
    println("Koличество бонусной железной руды: $bufIronOre")
}