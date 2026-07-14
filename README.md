# LlanquihueTour

## Descripción

Sistema orientado a objetos desarrollado para representar distintas entidades vinculadas a una agencia de turismo ubicada en la comuna de Llanquihue. El proyecto permite gestionar guías turísticos mediante la lectura de datos desde un archivo CSV, además de administrar vehículos y colaboradores externos utilizando interfaces, herencia, polimorfismo y colecciones dinámicas. También incorpora una interfaz gráfica básica con JOptionPane para facilitar el ingreso y visualización de información.

---

## Estructura del proyecto

### Paquete app

- Main.java

### Paquete model

- Direccion.java
- Persona.java
- GuiaTuristico.java
- Vehiculo.java
- ColaboradorExterno.java
- Registrable.java

### Paquete service

- GuiaService.java

### Paquete data

- GestorEntidades.java
- guias.csv

### Paquete ui

- MenuGUI.java

### Paquete util

- ArchivoUtil.java

---

## Conceptos aplicados

- Encapsulamiento mediante atributos privados.
- Uso de constructores.
- Métodos getter y setter.
- Sobrescritura del método `toString()`.
- Herencia (`GuiaTuristico` y `ColaboradorExterno` heredan de `Persona`).
- Composición (`Persona` contiene una `Direccion`).
- Interfaces (`Registrable`).
- Polimorfismo.
- Uso de `instanceof`.
- Organización del código en paquetes.
- Uso de colecciones mediante `ArrayList`.
- Lectura de archivos CSV.
- Búsqueda de información mediante filtros.
- Manejo básico de excepciones con `try-catch`.
- Interfaz gráfica utilizando `JOptionPane`.

---

## Funcionalidades

- Cargar guías turísticos desde un archivo CSV.
- Almacenar entidades en una colección dinámica (`ArrayList`).
- Registrar guías turísticos.
- Registrar vehículos.
- Registrar colaboradores externos.
- Mostrar información mediante polimorfismo.
- Diferenciar entidades utilizando `instanceof`.
- Buscar guías según el idioma (Inglés o Español).
- Interactuar con el sistema mediante una interfaz gráfica simple.

---

## Ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el archivo `guias.csv` se encuentre dentro del paquete `data`.
3. Ejecutar la clase `Main` ubicada en el paquete `app`.
4. Utilizar el menú para registrar nuevas entidades o visualizar la información almacenada.
5. La información también se mostrará por consola para demostrar el funcionamiento del polimorfismo y el uso de `instanceof`.

---

## Autor del proyecto

Mariana Benavides