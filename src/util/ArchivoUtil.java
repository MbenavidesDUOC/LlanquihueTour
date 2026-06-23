package util;

import model.Direccion;
import model.GuiaTuristico;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ArchivoUtil {

    public static ArrayList<GuiaTuristico> cargarGuias(String rutaArchivo) {
        ArrayList<GuiaTuristico> guias = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length < 5) {
                    continue;
                }

                String rut = datos[0];
                String nombre = datos[1];
                String calle = datos[2];
                String ciudad = datos[3];
                String idioma = datos[4];

                Direccion direccion = new Direccion(calle, ciudad);
                GuiaTuristico guia = new GuiaTuristico(rut, nombre, direccion, idioma);

                guias.add(guia);
            }

        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return guias;
    }
}