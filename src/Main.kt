fun main(args: Array<String>) {
    val Nombre: String?
    println("El Elevador Se Encuentra Detenido En El Lobby")
    var ubicacion: Int = 1
    Nombre = readLine().toString()
    print(Edificio.Piso(ubicacion))

    //While
    var seleccion: Int? = 0
    while (seleccion != 1) {

        val estadoElevador = Elevador(1)
        print(estadoElevador)
        var valor: Int?
        println(" ¿A Que Piso Desea Ir?")
        valor = readLine()?.toInt()

        when (valor) {
            0 -> CambiarPiso(valor, ubicacion)
            1 -> CambiarPiso(valor, ubicacion)
            2 -> CambiarPiso(valor, ubicacion)
            3 -> CambiarPiso(valor, ubicacion)
            4 -> CambiarPiso(valor, ubicacion)
            5 -> CambiarPiso(valor, ubicacion)
            6 -> CambiarPiso(valor, ubicacion)
            7 -> CambiarPiso(valor, ubicacion)
            8 -> CambiarPiso(valor, ubicacion)
            9 -> CambiarPiso(valor, ubicacion)
            10 -> CambiarPiso(valor, ubicacion)
            11 -> CambiarPiso(valor, ubicacion)
            12 -> CambiarPiso(valor, ubicacion)
            13 -> CambiarPiso(valor, ubicacion)
            14 -> CambiarPiso(valor, ubicacion)
            15 -> CambiarPiso(valor, ubicacion)

            else -> {
                print("No Está En El Rango. ")
            }
        }
    }
}