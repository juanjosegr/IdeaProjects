fun main() {
    println("Introduce tu nota")
    val nota = readln().toInt()
    when (nota) {
        1,2,3,4 -> println("Has suspendido")
        5 -> println("Has aprobado")
        6 -> println("Has sacado un bien")
        7,8 -> println("Has sacado un notable")
        9 -> println("Has sacado un sobresaliente")
        else -> println("Nota no valida")
    }
}