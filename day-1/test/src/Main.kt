var availableSeats = arrayOf(1, 2, 3, 4, 5)
fun reserveSeat(name: String, seatNumber: Int) {
    var i = 0
    for (x in availableSeats) {
        if (x == seatNumber) {
            availableSeats[i] = 0  // Mark the seat as reserved by setting it to 0
            println("$name reserved seat $seatNumber.")
            return
        }
        i++
    }
    println("Seat $seatNumber is already reserved.")
}

fun main() {
    reserveSeat("John", 2)
    reserveSeat("Sarah", 2)
}

