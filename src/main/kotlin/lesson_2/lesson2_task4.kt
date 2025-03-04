package org.example.lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val Buf = 0.2
    val bufCrystalOre = (Buf * crystalOre).toInt()
    val bufIronOre = (Buf * ironOre).toInt()

    println("Koличество бонусной кристаллической руды: " + bufCrystalOre)
    println("Koличество бонусной железной руды: " + bufIronOre)
}