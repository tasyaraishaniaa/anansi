fun main() {
//    val score = arrayOf(59, 69, 79, 89, 99, -1, 101)
//    for (x in score) {
//        if (x < 0 || x > 100) {
//            println("Invalid score.")
//        } else if (x < 60) {
//            println("F")
//        } else if (x < 70) {
//            println("D")
//        } else if (x < 80) {
//            println("C")
//        } else if (x < 90) {
//            println("B")
//        } else {
//            println("A")
//        }
//    }

//    val experience = arrayOf(200, 150, 50, 40)
//    val salary = 10000
//    for (x in experience) {
//        if (x < 2) {
//            println(0)
//        } else if (x <= 5) {
//            println(salary * 0.1)
//        } else {
//            println(salary * 0.2)
//        }
//    }

    val totalSpent = arrayOf(300, 150, 50, 40)
    for (x in totalSpent) {
        if (x < 50) {
            println(x)
        } else if (x <= 100) {
            println(x * 0.9)
        } else if (x <= 200) {
            println(x * 0.8)
        } else {
            println(x * 0.7)
        }
    }

}