fun main() {
    println("Introduce un numero")
    var num = readln().toInt()
    for (i in num downTo 0) {
        print("$i, ")
    }
}