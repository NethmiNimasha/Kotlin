class Passenger(
    private val passengerName: String,
    private val passportNumber: String,
    private val destination: String
) {

    fun displayTicketInfo() {
        println("----- Ticket Information -----")
        println("Passenger Name   : $passengerName")
        println("Passport Number   : $passportNumber")
        println("Destination       : $destination")
        println("-----------------------------\n")
    }
}

fun main() {

    // a. Create multiple passenger objects
    val passenger1 = Passenger("Nethmi Nimasha", "N1234567", "Dubai")
    val passenger2 = Passenger("Kavindu Perera", "N7654321", "Singapore")
    val passenger3 = Passenger("Tharushi Silva", "N1122334", "London")

    // b. Display ticket information
    passenger1.displayTicketInfo()
    passenger2.displayTicketInfo()
    passenger3.displayTicketInfo()
}