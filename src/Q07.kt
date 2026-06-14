fun main() {
    try {
        print("Enter file size (MB): ")
        val fileSize = readLine()!!.toDouble()

        print("Enter internet speed (MB/s): ")
        val internetSpeed = readLine()!!.toDouble()

        if (internetSpeed == 0.0) {
            throw ArithmeticException("Internet speed cannot be zero.")
        }

        val downloadTime = fileSize / internetSpeed

        println("Estimated Download Time: $downloadTime seconds")

    } catch (e: NumberFormatException) {
        println("Invalid input! Please enter numeric values.")
    } catch (e: ArithmeticException) {
        println("Error: ${e.message}")
    } catch (e: Exception) {
        println("Unexpected Error: ${e.message}")
    }
}