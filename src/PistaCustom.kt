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