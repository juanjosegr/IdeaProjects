fun main(){
    println("Introduce una palabra: ")
    val palabra = readln().toString()
    val cadena: MutableList<String> = mutableListOf()
    for (letra in palabra){
        cadena.add(letra.toString())
    }
    println(cadena)

    println("""
        1) Mostra lista.
        2) Insertar un caracter.
        3) Actualizar posición de caracter.
        4) Borrar posición de caracter.
        5) Borrar caracter por valor.
        6) Modificar todo valor por otro.
        7) Salir.
    """.trimIndent())
    val opcion = readln().toInt()
    if (opcion == 1 ){
       println(cadena)
    }else if (opcion == 2){
    println("Dime la letra a añadir: ")
        var letra = readln().toString()
        println("Dime la posición a añadir: ")
        var num = readln().toInt()
        cadena.add(num,letra)
        println(cadena)
    }else if (opcion == 3){
        println("Dime la posición: ")
        var posicion = readln().toInt()
        println("Dime la letra a modificar: ")
        var modificacion = readln().toString()
        cadena[posicion] = modificacion
        println(cadena)
    }else if (opcion == 4){
    println("Dime una posición a borrar: ")
        var borrar = readln().toInt()
        cadena.removeAt(borrar)
        println(cadena)
    }else if (opcion == 5){
        println("Dime la letra a borrar: ")
        var borrar = readln().toString()
        cadena.remove(borrar)
        println(cadena)
    }else if (opcion == 6){
    println("Dime la letra a modificar: ")
        var letra = readln()
    }else if (opcion == 7){

    }
}