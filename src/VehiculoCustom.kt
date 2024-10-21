open class VehiculoCustom(
    nombre: String,
    velocidadMaxima: Int,
    combustible: Int,
    aceleracion: Int,
    frenado: Int
):Vehiculo(nombre, velocidadMaxima, combustible, aceleracion, frenado) {
    override fun acelerar() {

    }

    override fun avanzar(){
        distanciaRecorrida += velocidadActual
        println("El vehiculo recorrio ${distanciaRecorrida}")
    }

    override fun frenar() {

    }

    override fun toString(): String {
        return "nombre: $nombre | velocidad maxima: $velocidadMaxima | combustible: $combustible | aceleracion: $aceleracion | frenado: $frenado"
    }
}