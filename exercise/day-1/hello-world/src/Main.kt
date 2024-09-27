fun main() {
    val score = arrayOf(59, 69, 79, 89, 99, -1, 101)
    for (x in score) {
        if (x < 0 || x > 100) {
            println("Invalid score.")
        } else if (x < 60) {
            println("F")
        } else if (x < 70) {
            println("D")
        } else if (x < 80) {
            println("C")
        } else if (x < 90) {
            println("B")
        } else {
            println("A")
        }
    }
}