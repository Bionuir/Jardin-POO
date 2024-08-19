package Jardin

import kotlin.math.PI

open class Jardin(open var largo: Int = 100, open var ancho: Int = 50) {
    open val forma = "rectángulo"
    open var area: Int
        get() = largo * ancho
        set(valor) {
            ancho = valor / largo
        }

    open fun imprimirTamano() {
        println(forma)
        println("Ancho: $ancho cm Largo: $largo cm")
        println("Área: $area cm²")
    }
}

class JardinCircular(override var ancho: Int, var diametro: Int) : Jardin(ancho = diametro, largo = diametro) {
    override val forma = "círculo"
    override var area: Int
        get() = (PI * (diametro / 2) * (diametro / 2)).toInt()
        set(valor) {
            ancho = (valor / PI).toInt()
        }

    override fun imprimirTamano() {
        println(forma)
        println("Diámetro: $diametro cm")
        println("Área: $area cm²")
    }
}
