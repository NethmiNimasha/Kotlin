fun calculateAge(birthYear: Int): Int {
    val currentYear = 2026
    return currentYear - birthYear
}

fun main() {
    val age = calculateAge(2000)
    println("Age: $age")
}