package Jardin

interface AccionPlanta {
    fun crecer()
}

abstract class Planta {
    abstract val color: String
}

class Rosa : Planta(), AccionPlanta {
    override val color = "rojo"

    override fun crecer() {
        println("Rosa floreciendo con pétalos de color $color")
    }
}

class Girasol : Planta(), AccionPlanta {
    override val color = "amarillo"

    override fun crecer() {
        println("Girasol creciendo hacia el sol con pétalos de color $color")
    }
}
