package ui;

import data.GestorEntidades;
import model.*;

import javax.swing.JOptionPane;

public class MenuGUI {

    private GestorEntidades gestor;

    public MenuGUI() {
        gestor = new GestorEntidades();
    }

    public void iniciar() {

        int opcion;

        do {

            String menu = """
                    LLANQUIHUE TOUR
                    
                    1. Agregar guía turístico
                    2. Agregar vehículo
                    3. Mostrar entidades
                    4. Salir
                    """;

            String respuesta = JOptionPane.showInputDialog(menu);

            if (respuesta == null) {
                break;
            }

            try {
                opcion = Integer.parseInt(respuesta);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Debe ingresar una opción entre 1 y 4.");
                opcion = 0;
                continue;
            }

            switch (opcion) {

                case 1:
                    agregarGuia();
                    break;

                case 2:
                    agregarVehiculo();
                    break;

                case 3:
                    mostrarEntidades();
                    break;

            }

        } while (opcion != 4);

    }

    private void agregarGuia() {

        String rut = JOptionPane.showInputDialog("Rut");
        String nombre = JOptionPane.showInputDialog("Nombre");
        String calle = JOptionPane.showInputDialog("Calle");
        String ciudad = JOptionPane.showInputDialog("Ciudad");
        String idioma = JOptionPane.showInputDialog("Idioma");

        Direccion direccion =
                new Direccion(calle, ciudad);

        GuiaTuristico guia =
                new GuiaTuristico(
                        rut,
                        nombre,
                        direccion,
                        idioma);

        gestor.agregarEntidad(guia);

    }

    private void agregarVehiculo() {

        String patente =
                JOptionPane.showInputDialog("Patente");

        String modelo =
                JOptionPane.showInputDialog("Modelo");

        Vehiculo vehiculo =
                new Vehiculo(patente, modelo);

        gestor.agregarEntidad(vehiculo);

    }

    private void mostrarEntidades() {

        gestor.mostrarEntidades();

        JOptionPane.showMessageDialog(
                null,
                "Las entidades fueron mostradas en la consola.");

    }

}