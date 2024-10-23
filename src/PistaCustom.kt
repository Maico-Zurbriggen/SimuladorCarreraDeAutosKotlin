import kotlin.math.roundToInt

class PistaCustom(
    longitud: Int,
    clima: String
):Pista(longitud,clima) {
    override fun aplicarCondiciones(vehiculo: Vehiculo){
        if (clima == "lloviendo"){
            vehiculo.velocidadActual = vehiculo.velocidadActual/2
        }
        else if (clima == "niebla"){
            vehiculo.velocidadActual = (vehiculo.velocidadActual*0.2).toInt()
        }
        else if (clima == "soleado"){
            vehiculo.consumo = (vehiculo.consumo + vehiculo.consumo * 0.05).toInt()
        }
    }
    fun cambiarClima(){

    }
    fun aplicarEventoAleatorio(vehiculo: Vehiculo){

    }
}