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
    override fun aplicarEventoAleatorio(vehiculo: Vehiculo){
        fun pinchazo(){
            vehiculo.frenar()
        }
        fun fallo(){
            while(vehiculo.velocidadActual > 0){
                vehiculo.frenar()
            }
        }
        fun gasolina(){
            if ((vehiculo.combustible + (vehiculo.combustible * 0.2).toInt()) < vehiculo.combustiblemax){
                vehiculo.combustible += (vehiculo.combustible * 0.2).toInt()
            }else{
                vehiculo.combustible = vehiculo.combustiblemax
            }
            val nroRandom = Random.nextInt(1,3)
            when(nroRandom){
                1 -> gasolina()
                2 -> fallo()
                3 -> pinchazo()
            }
        }
    }
}