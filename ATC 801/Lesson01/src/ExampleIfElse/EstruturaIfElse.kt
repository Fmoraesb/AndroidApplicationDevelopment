package ExampleIfElse

fun main(args: Array<String>) {
    val score = 80
    var grade : String? = null //Essa interrogação é o que permite que um valor nulo seja atribuido

    if (score >= 90) {
        grade = "Grade A"
    }else if (score >= 80) {
        grade = "Grade B"
    }else if (score >= 70) {
        grade = "Grade C"
    }else if (score >= 60) {
        grade = "Grade D"
    }else {
        grade = "Grade F"
    }
    println(grade)
}