fun main (){
    val bonoloto: MutableList<Int> = mutableListOf()
    while (bonoloto.size<5) {
        var numero = 0
        println("Dime un numero: ")
        numero = readln().toInt()
        if (numero in bonoloto){
            println("Ese numero ya esta.")
        }else{
            bonoloto.add(numero)
        }
    }
    bonoloto.sort()
    for ((index, value ) in bonoloto.withIndex()){
        println(value)}
}