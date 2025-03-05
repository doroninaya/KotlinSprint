package org.example.lesson_2

fun main() {
    val numberOfEmployees = 50
    val salaryOfEmployees = 30000
    val numberOfInterns = 30
    val salaryOfInterns = 20000

    val salaryExpensesForEmployees = numberOfEmployees * salaryOfEmployees
    println("Расходы на выплату зарплаты постоянных сотрудников: $salaryExpensesForEmployees рублей.")

    val commonSalaryExpenses = salaryExpensesForEmployees + numberOfInterns * salaryOfInterns
    println("Общие расходы по ЗП после прихода стажеров: $commonSalaryExpenses рублей.")

    val averageSalary = commonSalaryExpenses / (numberOfEmployees + numberOfInterns)
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary рублей.")
}