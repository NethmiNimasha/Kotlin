fun main() {

    val products = arrayOf("Laptop", "Headphones", "Keyboard", "Mouse")
    val prices = doubleArrayOf(4500.0, 1200.0, 800.0, 500.0)

    var total = 0.0

    println("Available Products:")
    println("-------------------")

    for (i in products.indices) {
        println("${products[i]} - Rs.${prices[i]}")
        total += prices[i]
    }

    println("\nTotal Purchase Value: Rs.$total")

    val finalPrice = if (total > 5000) {
        total - (total * 0.10)
    } else {
        total
    }

    if (total > 5000) {
        println("Discount Applied: 10%")
    } else {
        println("No Discount Applied")
    }

    println("Final Price: Rs.$finalPrice")
}