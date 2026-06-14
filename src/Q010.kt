fun main() {

    val patientQueue = mutableListOf(
        "Amal Perera",
        "Nimal Silva",
        "Kavindu Fernando",
        "Tharushi Wickramasinghe",
        "Nethmi Nimasha"
    )

    fun displayQueue(queue: List<String>) {
        println("\n--- Current Patient Queue ---")
        if (queue.isEmpty()) {
            println("No patients in the queue.")
        } else {
            for ((index, patient) in queue.withIndex()) {
                println("${index + 1}. $patient")
            }
        }
    }

    displayQueue(patientQueue)

    println("\nServing patients...\n")

    if (patientQueue.isNotEmpty()) {
        println("Served: ${patientQueue.removeAt(0)}")
    }

    if (patientQueue.isNotEmpty()) {
        println("Served: ${patientQueue.removeAt(0)}")
    }

    displayQueue(patientQueue)
}