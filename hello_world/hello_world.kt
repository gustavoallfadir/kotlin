class HelloWorld {

    var nombre: String 
    var apellido: String 
    var edad: Short = 0

    constructor (nombre: String, apellido: String, edad: Short){
        this.nombre = nombre
        this.apellido = apellido
        this.edad = edad
    }

    fun saludo(): String {
        return "¡Hola ${this.nombre}!"
    }

    fun despedida(): String {
        return "¡Hasta luego, ${this.nombre}!"
    }
    
    fun get_edad(): Short {
        return this.edad
    }

    fun get_nombre_completo(): String {
        return "${this.nombre} ${this.apellido}"
    }
}


fun main(){
    var objeto = HelloWorld("Gustavo", "Robledo", 33)
    println(objeto.saludo())
    println("Su edad es de " + objeto.get_edad())
    println("Su nombre completo es " + objeto.get_nombre_completo())
    println(objeto.despedida())
}