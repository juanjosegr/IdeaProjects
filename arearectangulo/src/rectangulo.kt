class rectangulo() {
    var base = 0.0
    var altura = 0.0
    fun area ():Double {
        return (base * altura)
    }
    fun perimetro(): Double {
        return (base * 2 + altura * 2)
    }
    fun imprimir(){
    println("El area de ${base} de base, y ${altura} de altura es de ${area()}")
    println("El perímetro de ${base} de base y ${altura} de altura es de ${perimetro()}")
    }

}
