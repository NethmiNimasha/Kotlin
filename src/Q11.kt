class Contact(val name: String, val phoneNumber: String)

fun main() {
    val contact1 = Contact("Nimasha", "0771234567")

    println("Name: ${contact1.name}")
    println("Phone: ${contact1.phoneNumber}")
}