package app;

import data.GestorEntidades;
import model.ColaboradorExterno;
import model.Direccion;
import model.GuiaTuristico;
import model.Persona;
import model.Vehiculo;
import service.GuiaService;
import ui.MenuGUI;
import util.ArchivoUtil;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Direccion direccionCliente = new Direccion(
                "Teniente Merino 635",
                "Llanquihue");

        Persona cliente = new Persona(
                "17.456.789-2",
                "Juanito Pérez",
                direccionCliente);

        System.out.println("Cliente:");
        System.out.println(cliente);


        String rutaArchivo = "src/data/guias.txt";

        ArrayList<GuiaTuristico> guias =
                ArchivoUtil.cargarGuias(rutaArchivo);

        GuiaService guiaService = new GuiaService();

        System.out.println();
        guiaService.mostrarGuias(guias);

        guiaService.buscarPorIdioma(guias, "Inglés");


        GestorEntidades gestor = new GestorEntidades();


        for (GuiaTuristico guia : guias) {
            gestor.agregarEntidad(guia);
        }


        Vehiculo vehiculo = new Vehiculo(
                "ABCD12",
                "Toyota Hilux");

        gestor.agregarEntidad(vehiculo);


        Direccion direccionColaborador = new Direccion(
                "Av. Los Lagos 250",
                "Puerto Varas");

        ColaboradorExterno colaborador =
                new ColaboradorExterno(
                        "11.111.111-1",
                        "Pedro González",
                        direccionColaborador,
                        "Turismo Austral");

        gestor.agregarEntidad(colaborador);


        System.out.println("\n=== ENTIDADES REGISTRADAS ===");
        gestor.mostrarEntidades();


        MenuGUI menu = new MenuGUI();
        menu.iniciar();
    }
}