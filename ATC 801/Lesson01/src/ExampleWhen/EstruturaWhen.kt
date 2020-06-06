package ExampleWhen

fun main (args: Array<String>) {
    println("================= Pizza Order =================")
    print("Enter the Pizza size: 1 => Small; 2 => Medium; 3 => Larger Size =>")
    var size = readLine()!!.toInt() //Esse sinal (!!) é usado quando o programador
    // se compromete com a JVM que o valor entrado não sera nulo
    var price : Int = 0

    when (size) {
        1 -> price = 5;
        2 -> price = 7;
        3 -> price = 10;
        else -> println("Enter a correct size!") //Essas setas (->) são o que se chama de Lambda,
        //ou Declaração de Função Anonima
    }
    println("Total Price = $price USD")
}