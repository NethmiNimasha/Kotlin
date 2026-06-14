class Car(
    val brand: String,
    val model: String,
    val year: Int,
    val price: Double
) {

    init {
        println("Car Information")
        println("Brand: $brand")
        println("Model: $model")
        println("Year: $year")
        println("Price: Rs.$price")
        println("---------------------")
    }
}

fun main() {
    val car1 = Car("Toyota", "Corolla", 2022, 7500000.0)
    val car2 = Car("Honda", "Civic", 2023, 8500000.0)
    val car3 = Car("BMW", "X5", 2024, 25000000.0)
}