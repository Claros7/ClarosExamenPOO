class Elevador(var estado: Int){

    override fun toString(): String {
        if (estado == 0) {
            return "Elevador Detenido"

        } else if (estado == 1) {
            return "Elevador Subiendo"

        } else {
            return "Elevador Bajando"
        }
    }
}