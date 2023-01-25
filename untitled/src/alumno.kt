class alumno(dni,edad,nota1, nota2, nota3) {
        var edad = Int
        var dni = String
        var nota1 = Int
        var nota2 = Int
        var nota3 = Int
    init {
         this.edad = edad
         this.dni =  dni
         this.nota1 = nota1
         this.nota2 = nota2
         this.nota3 = nota3
    }

    override fun toString(): String {
        return "alumno(edad=$edad, dni=$dni, nota1=$nota1, nota2=$nota2, nota3=$nota3)"
    }


}