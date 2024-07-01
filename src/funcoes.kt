import java.util.*

fun main(args: Array<String>) {
    hello()
    println(soma(4, 4))
    println(mult(4, 4))
    println(div(4, 4))
    println(resto(5, 4))
    println(sub(4, 10))
    println()

    println("Argumentos nomeados e valores de parâmetro padrão")
    hello2(message = "hello", name = "Paulo")
    hello2(message = "hello", name = "Paulo", lastName = "Pereira")
    println()

    println("Expressões lambda")
    println(uppercaseString("um dia qualquer"))
    println()
    println({text: String -> text.uppercase()} ("hello"))
    val upperCaseString = { s: String -> s.uppercase() }
    println(upperCaseString("hello 2"))
    println()

    println("Passar para outra função")
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { x -> x < 0 }
    println(positives)
    println(negatives)
    println()

    val numbers2 = listOf(1, -2, 3, -4, 5, -6)
    val doubled = numbers2.map { x -> x * 2 }
    val tripled = numbers2.map { x -> x * 3 }
    println(doubled)
    println(tripled)

    println(upperCaseString2("texto qualquer"))
    println()

    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2sec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
    println("Total time is $totalTimeInSeconds secs")
    println({ text: String -> text.uppercase() }("hello 3"))
    println(listOf(1, 2, 3).fold(0) { x, item -> x + item })
}

fun hello(){
    println("Hello World")
}

fun soma (x: Int, y: Int): Int{
    return x + y
}

fun mult (x: Int, y: Int) = x * y
fun div (x: Int, y: Int) = x / y
fun resto (x: Int, y: Int) = x % y
fun sub (x: Int, y: Int) = x - y

fun hello2 (message: String, name: String, lastName: String = "Passos") {
    println("$message $name $lastName")
}

fun uppercaseString(text: String): String {
    return text.uppercase(Locale.getDefault())
}
val upperCaseString2: (String) -> String = { text -> text.uppercase() }

fun toSeconds(time: String): (Int) -> Int  = when (time) {
    "hour" -> { value -> value * 60 * 60 }
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value}
}