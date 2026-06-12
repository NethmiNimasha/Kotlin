fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun main() {
    val result = max(10, 25)
    println("Maximum number is: $result")
}