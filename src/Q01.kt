fun main() {
    print("Enter parking hours: ")
    val hours = readLine()!!.toInt()

    val fee = if (hours >= 1 && hours <= 2) {
        100
    } else if (hours >= 3 && hours <= 5) {
        250
    } else if (hours > 5) {
        500
    } else {
        0
    }

    println("Parking Fee = Rs.$fee")
}