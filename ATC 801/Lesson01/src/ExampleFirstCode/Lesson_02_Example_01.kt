package ExampleFirstCode

fun main (args: Array<String>) {
    val primeiroValor = 1 //val é a declaração de constante em Kotlin
    val segundoValor = 4;// Outro ponto interessante é que ele infere o tipo da variável pelo que for
    //atribuida a ela

    val total = primeiroValor + segundoValor
    println("A soma de $primeiroValor com $segundoValor é $total");
}