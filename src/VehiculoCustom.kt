open class VehiculoCustom(
    nombre: String,
    velocidadMaxima: Int,
    combustible: Int,
    aceleracion: Int,
    frenado: Int
):Vehiculo(nombre, velocidadMaxima, combustible, aceleracion, frenado) {
    override fun acelerar() {
        if (combustible == 0) {
            println("No hay combustible suficiente.")
        }else{
            if ((velocidadActual+aceleracion) <= velocidadMaxima) {
                velocidadActual += aceleracion
                combustible-=1
                println("$velocidadActual $combustible\n")
            }
        }
    }

    override fun avanzar() {

    }

    override fun frenar() {

    }

    override fun toString(): String {
        return "nombre: $nombre | velocidad maxima: $velocidadMaxima | combustible: $combustible | aceleracion: $aceleracion | frenado: $frenado"
    }
}