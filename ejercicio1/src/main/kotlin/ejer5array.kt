fun main() {
    val numbers = IntArray(10)

    for (i in 0 until 10) {
        print("Introduce un número: ")
        val number = readLine()!!.toInt()
        print("Introduce una posición: ")
        val position = readLine()!!.toInt()

        if (number < 0 || numbers[position] != 0) {
            println("Error: número negativo o posición ocupada")
            continue
        }
        

        numbers[position] = number
    }

    println("Vector: ${numbers.joinToString()}")
}
