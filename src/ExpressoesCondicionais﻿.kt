fun main(){
    val value1: Int
    val check = true

    if (check){
        value1 = 1
    } else {
        value1 = 2
    }

    println("Valor 1: " +value1)

    val value2 = 10
    val value3 = 20
    println(if (value2 > value3) value2 else value3)
    println()

    val obj = "ola"

    when (obj) {
        "1" -> "O valor 1"
        "ola" -> "O valor ola"
        else -> "O valor desconhecido"
    }
    println(obj)
    println()

    val temp = 18

    val description = when {
        temp < 0 -> "Muito frio"
        temp < 10 -> "um pouco frio"
        temp < 20 -> "quente"
        else -> "quente"
    }
    println("Descricao da temperatura: " +description)
    println()

    for (number in 1..10) {
        print(number)
    }
    println()

    val cakes = listOf("cenoura", "queijo", "chocolate")

    for (cake in cakes) {
        println("Gostoso, é um $cake cake")
    }
    println()

    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 3){
        println("Eat a cake")
        cakesEaten++
    }
    println()

    var cakesEaten2 = 0
    var cakesBaked2 = 0

    while (cakesEaten2 < 3){
        println("Eat a cake")
        cakesEaten++
    }
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesEaten2 < cakesBaked2)
}