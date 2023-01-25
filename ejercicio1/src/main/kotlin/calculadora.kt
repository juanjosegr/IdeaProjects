/**
 * Calculadora es una clase que contiene operaciones basicas de aritmetica
 * @author Juan Jose
 * @version 1.0
 */

fun main() {
    val calculadora = Calculadora()
    println("Introduce el primer numero:")
    val operando1 = readln().toInt()
    println("Introduce el segundo numero:")
    val operando2 = readln().toInt()
    println("""
        Introduce el operador:
        + para sumar
        - para restar
        * para multiplicar
        / para dividir
    """.trimIndent())
    val operacion = readln()
    val resultado = when (operacion) {
        "+" -> calculadora.sumar(operando1, operando2)
        "-" -> calculadora.restar(operando1, operando2)
        "*" -> calculadora.multiplicar(operando1, operando2)
        "/" -> calculadora.dividir(operando1, operando2)
        else -> {
            println("Operación no válida")
            return
        }
    }
    println("Resultado: $resultado")
}
class Calculadora {
    fun sumar(a: Int, b: Int) = a + b
    fun restar(a: Int, b: Int) = a - b
    fun multiplicar(a: Int, b: Int) = a * b
    fun dividir(a: Int, b: Int) = a / b
}

