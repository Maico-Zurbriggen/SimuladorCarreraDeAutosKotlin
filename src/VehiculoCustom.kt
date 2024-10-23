open class VehiculoCustom(
    nombre: String,
    velocidadMaxima: Int,
    combustible: Int,
    aceleracion: Int,
    frenado: Int,
    consumo: Int = 1
):Vehiculo(nombre, velocidadMaxima, combustible, aceleracion, frenado) {
    override fun acelerar() {
        if (combustible == 0) {
            println("No hay combustible suficiente.")
        }else{
            if ((velocidadActual+aceleracion) <= velocidadMaxima) {
                velocidadActual += aceleracion
                combustible-= consumo
                println("$velocidadActual $combustible\n")
            }
        }
    }

    override fun avanzar() {
        distanciaRecorrida += velocidadActual

        println("El vehiculo recorrio $distanciaRecorrida")
    }

    override fun frenar() {
        velocidadActual -= frenado

        if (velocidadActual < 0){
            velocidadActual = 0
        }

        println("La velocidad actual es $velocidadActual")
    }

    override fun toString(): String {
        return "nombre: $nombre | velocidad maxima: $velocidadMaxima | combustible: $combustible | aceleracion: $aceleracion | frenado: $frenado"
    }
}