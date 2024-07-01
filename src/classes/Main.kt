package classes

fun main(){

    val contact1 = Contact(1, "paulo@paulo.com")
    val contact2 = Contact(2, "paulo2@paulo2.com")
    val contact3 = Contact(3, "paulo3@paulo3.com")

    val user1 = User(1, "paulo")
    val user2 = User(2, "jose")

    println(contact1.id)
    println(contact1.email)
    println("Their email address is: ${contact2.email}")
    contact3.printId()

    println(user1)
    println(user2)
    println("User sao iguais ? ${user1 == user2}")
    println(user1.copy())
    println(user1.copy(4, "Pedro"))
}