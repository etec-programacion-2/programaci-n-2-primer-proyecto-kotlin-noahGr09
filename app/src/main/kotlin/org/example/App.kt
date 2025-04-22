
package org.example

fun main() {
    fun <T> mostrar_tipo(variable: T): String {
        return "Variable de tipo: ${variable!!::class.simpleName}"
    }
    val nombre = "Noah"
    val num = 24
    val bool = true
    val decimal = 3.14
    println(mostrar_tipo(bool))
}