
package org.example
fun <T> mostrar_tipo(variable: T): String {
    return "Variable de tipo: ${variable!!::class.simpleName}"
}
fun area_rectangulo(base: Double, altura: Double): String{
    return "${base*altura}cm2"
}
fun par_o_impar(num: Int): String{
    if (num%2 == 0) {
        return "Par"
    } else {
        return "Impar"
    }
}
fun positivo(num: Int): String{
    if(num>0){
        return "Positivo"
    }else if (num<0){
        return "negativo"
    }else {
        return "Cero"
    }
}
fun main() {
    val nombre = "Noah"
    val num = 24
    val bool = true
    val decimal = 3.14
    println(mostrar_tipo(bool))
    println(area_rectangulo(5.0, 3.0))
    println(par_o_impar(16))
    println(positivo(0))
}