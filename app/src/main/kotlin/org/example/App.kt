
package org.example

import java.time.LocalDate

fun main() {
    fun nombre_y_fecha(): String {
        val fechaActual = LocalDate.now()
        val nombre = "Noah"
        return ("Nombre: $nombre \nFecha actual: $fechaActual")
    } 
    println(nombre_y_fecha())
}