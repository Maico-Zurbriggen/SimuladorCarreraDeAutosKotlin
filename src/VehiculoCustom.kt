open class VehiculoCustom(
    nombre: String,
    velocidadMaxima: Int,
    combustible: Int,
    aceleracion: Int,
    frenado: Int
):Vehiculo(nombre, velocidadMaxima, combustible, aceleracion, frenado) {
    override fun acelerar() {

    }

    override fun avanzar() {

    }

    override fun frenar() {
        velocidadActual -= frenado

        if (velocidadActual < 0){
            velocidadActual = 0
        }
        println("La nueva velocidad es $velocidadActual km/h")
    }

    override fun toString(): String {
        return "nombre: $nombre | velocidad maxima: $velocidadMaxima | combustible: $combustible | aceleracion: $aceleracion | frenado: $frenado"
    }
}