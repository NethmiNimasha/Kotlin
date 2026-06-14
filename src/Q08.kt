fun main() {
    print("Enter password: ")
    val password = readLine()!!

    var hasNumber = false
    var hasUppercase = false

    for (ch in password) {
        if (ch.isDigit()) {
            hasNumber = true
        }
        if (ch.isUpperCase()) {
            hasUppercase = true
        }
    }

    if (password.length >= 8 && hasNumber && hasUppercase) {
        println("Password is valid.")
    } else {
        println("Password is invalid.")
        println("Password must:")
        println("- Contain at least 8 characters")
        println("- Contain at least one number")
        println("- Contain at least one uppercase letter")
    }
}