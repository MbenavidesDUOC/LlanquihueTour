package app;

import model.Direccion;
import model.Persona;
import model.GuiaTuristico;
import service.GuiaService;
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

        String rutaArchivo = "src/data/guias.csv";

        ArrayList<GuiaTuristico> guias =
                ArchivoUtil.cargarGuias(rutaArchivo);

        GuiaService guiaService = new GuiaService();

        System.out.println();
        guiaService.mostrarGuias(guias);

        guiaService.buscarPorIdioma(guias, "Inglés");
    }
}