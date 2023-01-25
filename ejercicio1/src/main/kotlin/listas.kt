fun main(){
val listaprueba = mutableListOf('a','b','c')
    listaprueba.add('d')
    listaprueba.remove(element = 'b')
    listaprueba.removeAt(index = 0)
    listaprueba[1] ='x'
    println( listaprueba.indexOf('x'))
    println(listaprueba)
    for ((index, value ) in listaprueba.withIndex()){
        println(value)
    }
}