fun main() {
    Supermercado()
    Opciones()
    Compra()
    }


fun Opciones(){
    println("""
        Introduce lo que deseas hacer (1, 2 o 3):
        1) Insertar producto.
        2) Actualizar producto.
        3) Borrar producto.
    """.trimIndent())
    var opeciones = readln().toInt()
    when (opeciones){
        1-> println()
        2-> println()
        3-> println()
    }
}

fun Supermercado(){
    val Supermercado = mutableMapOf<String, Double>()
    while (Supermercado.size < 6){
        println("Dime el producto: ")
        val producto = readln()
        println("Dime el precio: ")
        val precio = readln().toDouble()
        Supermercado.put(key = producto, value = precio)
    }
    for ((key, value) in Supermercado) {
        println("Producto $key y precio $value€")
    }
}

fun Compra(){

}