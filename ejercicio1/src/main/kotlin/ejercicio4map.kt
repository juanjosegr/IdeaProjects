fun main() {
    dnilinked()
    println("---------------")
    dnisort()
}

fun dnilinked(){
    val dni = linkedMapOf<Int,String>(1234 to "juan", 4567 to "Curro", 7890 to "Dani", 2456 to "Edu")
    for ((key,value) in dni){
        println("$value tiene el numero de dni $key")
    }
}

fun dnisort(){
    val dni = sortedMapOf<Int,String>(1234 to "juan", 4567 to "Curro", 7890 to "Dani", 2456 to "Edu")
    for ((key,value) in dni){
        println("$value tiene el numero de dni $key")
    }
}