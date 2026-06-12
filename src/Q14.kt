fun main() {
    var input: String

    do {
        print("Continue? (yes/no): ")
        input = readLine()!!.lowercase()

    } while (input != "no")

    println("Program stopped.")
}