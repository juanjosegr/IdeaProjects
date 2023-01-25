fun main() {
    println("Introduce una frase: ")
    val frase = readln().toString()
    var letra = 0
    var cont = 0
    val palabras = frase.split(" ")
    var palabra_mas_larga = ""
    for (palabra in palabras) {
        if (palabra.length > palabra_mas_larga.length) {
            palabra_mas_larga = palabra
        }
    }
}