import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter first number:")
    val number1 = scanner.nextDouble()

    println("Enter second number:")
    val number2 = scanner.nextDouble()

    println("Enter an choice")
    val choice = scanner.nextInt()

    val result = when (choice) {
        1-> number1 + number2
        2-> number1 - number2
        3-> number1 * number2
        4-> {
            if (number2 != 0.0) {
                number1 / number2
            } else {
                println("Error: Division by zero is not allowed.")
                null
            }
        }
        else -> {
            println("Error: Invalid operator.")
            null
        }
    }

    if (result != null) {
        println("Result: $result")
    }
}
