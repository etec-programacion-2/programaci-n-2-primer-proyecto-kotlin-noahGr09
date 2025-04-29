
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
fun uno_al_diez() {
    println("Con for:")
    for (x in 1..10) {
        println(x)
    }
    println("Con while:")
    var x = 1
    while (x<=10) {
        println(x)
        x++
    }
    println("Con do while:")
    x = 1
    do {
        println(x)
        x++
    } while (x<=10)
}
fun pares_al_veinte() {
    for (x in 1..20){
        if (x%2 == 0){
            println(x)
        }
    }
}
fun factorial(num: Int): Int{
    var a = num
    for (x in 1..num-1){
        a *= x
    }
    return a
}
fun saludar(nombre: String): String{
    return "Hola $nombre"
}
fun potencia(base: Double, exp: Int): Double {
    var resultado = 1.0
    for (x in 1..exp) {
        resultado *= base  
    }
    return resultado
}
fun explicarVisibilidad() {
   val mensaje = "Visible en toda esta función"
   
   if (mensaje.length > 5) {
       val resultado = "Solo existo dentro del if"
       println("$resultado y puedo ver: $mensaje")
   }
   
   for (indice in 1..2) {
       val elementoTemporal = "Item temporal #$indice"
       println("$elementoTemporal usando información de: $mensaje")
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
    println(uno_al_diez())
    println(pares_al_veinte())
    println(factorial(5))
    println(saludar("noah"))
    println(potencia(5.0, 3))
    println(explicarVisibilidad())
}