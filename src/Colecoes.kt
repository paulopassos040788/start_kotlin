fun main() {

    println("As listas armazenam itens na ordem em que são adicionados e permitem itens duplicados.")
    println()

    println("Lista imutavel")
    val readOnlyShapes = listOf("triângulo", "quadrado", "circulo")
    println(readOnlyShapes)

    println("O primeiro item da lista é: ${readOnlyShapes[0]}")
    println("O primeiro item da lista é: ${readOnlyShapes.first()}")
    println("O ultimo item da lista é: ${readOnlyShapes[2]}")
    println("Esta lista contem ${readOnlyShapes.count()}")
    println("circulo" in readOnlyShapes)
    println()

    println("Lista mutavel")
    val shapes: MutableList<String> = mutableListOf( "quadrado", "circulo")
    shapes.add("triângulo")
    println(shapes)
    shapes.remove("circulo")
    println(shapes)
    println()

    println("Os conjuntos não são ordenados e armazenam apenas itens únicos.")
    println()

    val readOnlyFruit = setOf("maçã", "banana", "cereja", "cereja")
    val fruit: MutableSet<String> = mutableSetOf("maçã", "banana", "cereja", "cereja")
    //val fruitLocked: Set<String> = fruit // Esta imutavel agora
    println(readOnlyFruit)
    println("Quantos item tem ? ${readOnlyFruit.count()}")
    println("banana" in readOnlyFruit)
    println("Tem banana ? " +readOnlyFruit.contains("banana"))
    println()

    fruit.add("manga")
    println(fruit)
    fruit.remove("banana")
    println(fruit)
    println()

    println("Conjutos de chave e valor (Map)")
    println()

    val readOnlyJuiceMenu = mapOf("maçã" to 100, "banana" to 50, "cereja" to 60, "cereja" to 80)
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("maçã" to 100, "banana" to 50, "cereja" to 60, "cereja" to 80)
    //val juiceMenuLocked: Map<String, Int> = juiceMenu
    println(readOnlyJuiceMenu)
    println("O valor do suco de maçã é ${readOnlyJuiceMenu["maçã"]}")
    println("Este mapa tem ${readOnlyJuiceMenu.count()} pares de valores-chave")
    println("Chaves: " + readOnlyJuiceMenu.keys)
    println("Valores: " + readOnlyJuiceMenu.values)
    println("laranja" in readOnlyJuiceMenu.keys)
    println(200 in readOnlyJuiceMenu.values)
    println()

    juiceMenu.put("Uva", 45)
    println(juiceMenu)
    juiceMenu.remove("banana")
    println(juiceMenu)
    
}