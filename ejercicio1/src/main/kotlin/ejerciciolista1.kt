fun main(){
    val nombreAlumnos = listOf( "Curro", "Juanjo", "Alvaro", "Daniel", "Adrian")
    println(nombreAlumnos)
    for ((index, value ) in nombreAlumnos.withIndex()){
        println(value)
    }
}