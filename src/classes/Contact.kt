package classes

class Contact(val id: Int, var email: String) {

    //val category: String = "work"

    fun printId(){
        println("ID: $id -- Email: $email")
    }
}