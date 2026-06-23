# LlanquihueTour

## Descripción

Sistema básico orientado a objetos desarrollado para representar personas vinculadas a una agencia de turismo ubicada en la comuna de Llanquihue. Este proyecto permite gestionar la información de guías turísticos mediante la lectura de datos desde un archivo CSV, almacenándolos en una colección dinámica para su posteriormente visualizarlos y búscarlos.
## Estructura del proyecto

### Paquete app

* Main.java

### Paquete model

* Direccion.java
* Persona.java
* GuiaTuristico.java

### Paquete service
* GuiaService.java

###  Paquete util
* ArchivoUtil.java

### Paquete data
* guias.csv

## Conceptos aplicados

* Encapsulamiento mediante atributos privados.
* Uso de constructores.
* Métodos getter y setter.
* Método toString().
* Herencia (GuiaTuristico hereda de Persona).
* Composición (Persona contiene una Direccion).
* Organización del código en paquetes.
* Uso de colecciones mediante ArrayList.
* Lectura de archivos CSV.
* Búsqueda de información mediante filtros.
* Manejo básico de excepciones con try-catch.

## Funcionalidades
* Cargar guías turísticos desde un archivo CSV.
* Almacenar información en una colección dinámica.
* Mostrar el listado de guías por consola.
* Buscar guías según el idioma que manejan (Inglés o Español).

## Ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el archivo guias.csv se encuentre dentro del paquete data.
3. Ejecutar la clase Main ubicada en el paquete app.
4. Visualizar los resultados en la consola.

## Autor del proyecto

Nombre: Mariana Benavides
