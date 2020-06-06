package ExampleInferArrayType

fun main (args: Array<String>) {
    var arrayDeInteiros = arrayOf(3,5,7,9) //Novamente ele infere o tipo do Array pelo valores adicionados
    println(arrayDeInteiros[0])
    println(arrayDeInteiros[1])
    println(arrayDeInteiros[2])
    println(arrayDeInteiros[3])
}