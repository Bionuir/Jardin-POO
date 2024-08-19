package Jardin

fun construirJardin() {
    val jardin1 = Jardin()
    jardin1.imprimirTamano()
    val jardin2 = Jardin(ancho = 75)
    jardin2.imprimirTamano()
    val jardin3 = Jardin(largo = 150, ancho = 75)
    jardin3.imprimirTamano()
    val jardinCircular = JardinCircular(diametro = 100, ancho = 100)
    jardinCircular.imprimirTamano()
}

fun plantarPlantas() {
    val rosa = Rosa()
    val girasol = Girasol()

    println("Rosa color: ${rosa.color}")
    rosa.crecer()

    println("Girasol color: ${girasol.color}")
    girasol.crecer()
}

fun main() {
    construirJardin()
    plantarPlantas()
}
