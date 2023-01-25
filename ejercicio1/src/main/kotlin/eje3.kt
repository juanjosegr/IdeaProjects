fun main() {
    println("Dime un numero: ")
    val num = readln().toInt()
    for (numero in 0..num){
        if (numero %2 != 0){
            println("$numero,")
        }
    }

}