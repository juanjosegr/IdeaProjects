fun main() {
    println("Introduzca tu nombre:")
    var nombre = readln()
    println("Introduce un numero de repeticiones")
    var num= readln().toInt()
    println("Hola $nombre \n".repeat(num))
}
