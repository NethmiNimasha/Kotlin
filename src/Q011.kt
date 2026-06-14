fun main() {

    print("Enter your age: ")
    val age = readLine()!!.toInt()

    try {
        validateAge(age)
        println("Access granted. You are eligible.")
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}

fun validateAge(age: Int) {
    if (age < 18) {
        throw IllegalArgumentException("Age must be 18 or above. Access denied!")
    }
}