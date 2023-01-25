fun main(){
    println("Introduce tus horas de trabajo:")
    val horas = readln().toInt()
    println("Introduce el precio por hora")
    val precio = readln().toInt()
    val total = horas * precio
    println("Tu importe total es de $total€, las horas trabajadas son $horas y cobras por hora $precio€")
}