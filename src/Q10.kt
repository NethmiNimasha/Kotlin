fun main() {
    print("Enter a number: ")
    val number = readLine()!!.toInt()

    if (number > 0) {
        println("Positive")
    } else if (number < 0) {
        println("Negative")
    } else {
        println("Zero")
    }
}