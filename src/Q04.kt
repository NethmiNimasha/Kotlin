fun main() {
    // Daily data usage in GB for 7 days
    val usage = doubleArrayOf(3.5, 6.2, 4.8, 7.1, 2.9, 5.5, 4.0)

    var highest = usage[0]
    var lowest = usage[0]
    var total = 0.0

    // Find highest, lowest, and total
    for (data in usage) {
        if (data > highest) highest = data
        if (data < lowest) lowest = data
        total += data
    }

    val average = total / usage.size

    println("Highest Usage: $highest GB")
    println("Lowest Usage: $lowest GB")
    println("Average Usage: $average GB")

    println("\nDays Exceeding 5 GB:")
    for (i in usage.indices) {
        if (usage[i] > 5) {
            println("Day ${i + 1}: ${usage[i]} GB")
        }
    }
}