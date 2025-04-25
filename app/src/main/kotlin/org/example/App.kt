
package org.example
fun <T> mostrar_tipo(variable: T): String {
    return "Variable de tipo: ${variable!!::class.simpleName}"
}
fun area_rectangulo(base: Double, altura: Double): String{
    return "${base*altura}cm2"
}
fun main() {
    val nombre = "Noah"
    val num = 24
    val bool = true
    val decimal = 3.14
    println(mostrar_tipo(bool))
    println(area_rectangulo(5.0, 3.0))
}