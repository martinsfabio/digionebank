package one.digitalinnovation.digionebank

class Person {
    var name: String = "Fabio"
    var cpf: String = "123.123.123-12"
}

fun main() {
    val fabio = Person()
    println(fabio.name)
    println(fabio.cpf)
}