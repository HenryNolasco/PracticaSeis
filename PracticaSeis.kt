import java.io.File

fun leerArchivo(ruta: String): String{
val archivo = File(ruta)
return archivo.readText()
} 

fun escribirEnArchivos(ruta: String, content: String){
    val archivo = File(ruta)
    archivo.appendText(content)
}

fun main(args: Array<String>) {
    val ruta = "C:\\Users\\NEXTCOM2\\Documents\\Estructura de Datos\\Practicas\\PracticaSeis\\Documentos\\archivo.txt"
    val contenido = leerArchivo(ruta)

    /* Ejemplo 1 - Lectura de Archivos */
    println(contenido)
    println("\n")

    /* Ejemplo 2 - Escribir un archivo */
    val estructura = "\nEsta es una prueba de appendText."

    escribirEnArchivos(ruta, estructura)
    println("Creado Exictosamente")
}

