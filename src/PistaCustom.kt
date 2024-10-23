import kotlin.random.Random

class PistaCustom(
    longitud: Int,
    clima: String
):Pista(longitud,clima) {
    var climas: ArrayList<String> =arrayListOf("soleado", "lluvia", "niebla", "normal")

    fun aplicarCondiciones(vehiculo: Vehiculo){

    }
    override fun cambiarClima(){
        clima = climas[Random.nextInt(0, 3)]
    }
    fun aplicarEventoAleatorio(vehiculo: Vehiculo){

    }
}