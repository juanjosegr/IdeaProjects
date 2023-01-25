fun main(){
    println("Introduce un número: ")
    val numero = readln().toInt()

    for (i in numero downTo 0 ){
        println(i)
    }
}