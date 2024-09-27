fun main() {
    val score = arrayOf(59, 69, 79, 89, 99)
    for (x in score) {
        if (x < 60) {
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