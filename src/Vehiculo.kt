abstract class Vehiculo(
    val nombre: String,
    val velocidadMaxima: Int,
    var combustible: Int,
    val aceleracion: Int,
    val frenado: Int,
    var consumo: Int = 1
) {
    // region Properties
    var velocidadActual: Int = 0
    var distanciaRecorrida: Int = 0
    val combustiblemax: Int = combustible
    // endregion

    // region Abstract function
    abstract fun acelerar()
    abstract fun frenar()
    abstract fun avanzar()
    // endregion

    override fun toString(): String {
        return "Velocidad: $velocidadActual km/h | Combustible: $combustible | Distancia: $distanciaRecorrida m"
    }
}