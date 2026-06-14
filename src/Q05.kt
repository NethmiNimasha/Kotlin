open class BankAccount(
    val accountNumber: String,
    var balance: Double
) {
    fun deposit(amount: Double) {
        balance += amount
        println("Deposited Rs.$amount")
    }

    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            println("Withdrawn Rs.$amount")
        } else {
            println("Insufficient Balance")
        }
    }
}

class SavingsAccount(
    accountNumber: String,
    balance: Double
) : BankAccount(accountNumber, balance)

class CurrentAccount(
    accountNumber: String,
    balance: Double
) : BankAccount(accountNumber, balance)

fun main() {
    val savings = SavingsAccount("SA1001", 10000.0)
    val current = CurrentAccount("CA2001", 15000.0)

    println("Savings Account Balance: Rs.${savings.balance}")
    savings.deposit(2000.0)
    savings.withdraw(1500.0)
    println("Updated Savings Balance: Rs.${savings.balance}")

    println()

    println("Current Account Balance: Rs.${current.balance}")
    current.deposit(5000.0)
    current.withdraw(3000.0)
    println("Updated Current Balance: Rs.${current.balance}")
}