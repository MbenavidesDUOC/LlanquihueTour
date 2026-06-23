package service;

import model.GuiaTuristico;

import java.util.ArrayList;

public class GuiaService {

    public void mostrarGuias(ArrayList<GuiaTuristico> guias) {
        System.out.println("Listado de guías turísticos:");

        for (GuiaTuristico guia : guias) {
            System.out.println("-----------------------------");
            System.out.println(guia);
        }
    }

    public void buscarPorIdioma(ArrayList<GuiaTuristico> guias, String idioma) {
        System.out.println("\n Búsqueda por idioma: " + idioma + ":");

        boolean encontrado = false;

        for (GuiaTuristico guia : guias) {
            if (guia.getIdioma().equalsIgnoreCase(idioma)) {
                System.out.println("-----------------------------");
                System.out.println(guia);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron guías con ese idioma.");
        }
    }
}