# LlanquihueTour

## Descripción

LlanquihueTour es un sistema desarrollado en Java utilizando Programación Orientada a Objetos para representar y gestionar distintas entidades vinculadas a una agencia de turismo ubicada en la comuna de Llanquihue.

El proyecto permite administrar guías turísticos, vehículos y colaboradores externos, aplicando principios como encapsulamiento, composición, herencia, polimorfismo e interfaces. Además, utiliza colecciones dinámicas (`ArrayList`), lectura de datos desde un archivo de texto (`.txt`) e incorpora una interfaz gráfica básica mediante `JOptionPane` para facilitar la interacción con el usuario.

---

# Estructura del proyecto

```
src
│
├── app
│   └── Main.java
│
├── data
│   ├── GestorEntidades.java
│   └── guias.txt
│
├── model
│   ├── Persona.java
│   ├── Direccion.java
│   ├── GuiaTuristico.java
│   ├── Vehiculo.java
│   ├── ColaboradorExterno.java
│   └── Registrable.java
│
├── service
│   └── GuiaService.java
│
├── ui
│   └── MenuGUI.java
│
└── util
    └── ArchivoUtil.java
```

---

# Clases principales

### Persona
Clase base que almacena la información común de las personas del sistema.

### Direccion
Representa la dirección de una persona y se utiliza mediante composición.

### GuiaTuristico
Hereda de `Persona` y representa a un guía turístico con su idioma correspondiente.

### Vehiculo
Representa un vehículo disponible para realizar los recorridos turísticos.

### ColaboradorExterno
Hereda de `Persona` y representa colaboradores pertenecientes a empresas externas.

### Registrable
Interfaz implementada por las entidades registrables del sistema para aplicar polimorfismo.

### GestorEntidades
Administra las entidades utilizando una colección dinámica de tipo `ArrayList<Registrable>`.

### GuiaService
Contiene la lógica para mostrar y buscar guías turísticos.

### ArchivoUtil
Permite leer el archivo `guias.txt` y convertir la información en objetos del sistema.

---

# Conceptos de Programación Orientada a Objetos aplicados

- Encapsulamiento mediante atributos privados.
- Uso de constructores.
- Métodos getter y setter.
- Sobrescritura del método `toString()`.
- Herencia (`GuiaTuristico` y `ColaboradorExterno` heredan de `Persona`).
- Composición (`Persona` contiene una `Direccion`).
- Interfaces (`Registrable`).
- Polimorfismo mediante `ArrayList<Registrable>`.
- Uso de `instanceof`.
- Organización del código en paquetes.
- Uso de colecciones mediante `ArrayList`.
- Lectura de datos desde archivos de texto (`.txt`).
- Manejo básico de excepciones mediante `try-catch`.
- Interfaz gráfica utilizando `JOptionPane`.

---

# Funcionalidades

- Cargar guías turísticos desde un archivo de texto (`guias.txt`).
- Registrar guías turísticos.
- Registrar vehículos.
- Registrar colaboradores externos.
- Almacenar entidades utilizando una colección dinámica (`ArrayList`).
- Mostrar información aplicando polimorfismo.
- Identificar el tipo de entidad mediante `instanceof`.
- Buscar guías turísticos según su idioma.
- Mostrar la información mediante una interfaz gráfica desarrollada con `JOptionPane`.

---

# Ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el archivo `guias.txt` se encuentre dentro del paquete `data`.
3. Ejecutar la clase `Main` ubicada en el paquete `app`.
4. Utilizar el menú para registrar nuevas entidades.
5. Visualizar las entidades registradas y realizar búsquedas de guías turísticos por idioma.
6. La información también se mostrará por consola para evidenciar el uso de polimorfismo e `instanceof`.

---

# Tecnologías utilizadas

- Java
- IntelliJ IDEA
- Programación Orientada a Objetos (POO)
- ArrayList
- JOptionPane
- Git
- GitHub

---

# Autor

**Mariana Benavides**

Proyecto desarrollado para la **Evaluación Final Transversal** de la asignatura **Desarrollo Orientado a Objetos I**.