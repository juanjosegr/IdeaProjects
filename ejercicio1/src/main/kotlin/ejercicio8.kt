fun main() {
    println("Introduce un numero")
    val numero = readln().toInt()
    var punto = "*"
    for (i in 0 .. numero){
        println(punto)
        punto += "*"
    }
}