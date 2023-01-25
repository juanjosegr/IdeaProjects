fun main(){
    val ListaDeCompra : MutableMap<String,Double>  = mutableMapOf<String,Double>()
    opciones(ListaDeCompra)
}

fun opciones(ListaDeCompra : MutableMap<String,Double>){
    println("""
        Introduce lo que deseas hacer (1, 2 o 3):
        1) Insertar producto.
        2) Actualizar producto.
        3) Borrar producto.
        4) Mostrar todo los productos.
        5) Salir.
        
    """.trimIndent())
    var opeciones = readln().toInt()
    while (opeciones != 5){
        when (opeciones) {
            1 -> Insertar(ListaDeCompra)
            2 -> Actualizar(ListaDeCompra)
            3 -> println()
            4 -> println(ListaDeCompra)
        }
    }
}
fun Insertar(ListaDeCompra : MutableMap<String,Double>){
    while (ListaDeCompra.size < 6){
        println("Dime el producto: ")
        val producto = readln()
        println("Dime el precio: ")
        val precio = readln().toDouble()
        ListaDeCompra.put(key = producto, value = precio)
    }
    for ((key, value) in ListaDeCompra) {
        println("Producto $key y precio $value€")
    }
    opciones(ListaDeCompra)
}
fun Actualizar (ListaDeCompra : MutableMap<String,Double>){
    println(ListaDeCompra)
    var borra = ("")
    while (borra != "salir "){
    println("Introduce el producto que deseas actualizar o escribe salir:")
    var borra = readln().toString()
        println("Introduce el precio a modificar: ")
        var borrap = readln().toDouble()
        ListaDeCompra[borra] = borrap
        for ((key, value) in ListaDeCompra) {
            println("Producto $key y precio $value€")
    }}

}

fun Borrar (ListaDeCompra : MutableMap<String,Double>){

}