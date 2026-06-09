package app;

import model.Direccion;
import model.GuiaTuristico;
import model.Persona;

public class Main {

    public static void main(String[] args) {

        Direccion direccion1 = new Direccion(
                "Teniente Merino 635",
                "Llanquihue");

        Direccion direccion2 = new Direccion(
                "San Martin 541",
                "Llanquihue");

        Direccion direccion3 = new Direccion(
                "Balmaceda 117",
                "Llanquihue");

        Persona cliente = new Persona(
                "17.456.789-2",
                "Mariana Benavides",
                direccion1);

        GuiaTuristico guia1 = new GuiaTuristico(
                "7.345.618-0",
                    "Luis Werner",
                direccion2,
                "Inglés");

        GuiaTuristico guia2 = new GuiaTuristico(
                "15.980.654-7",
                "Carla Jara",
                direccion3,
                "Español");

        System.out.println("=== CLIENTE ===");
        System.out.println(cliente);

        System.out.println("\n=== GUÍA TURÍSTICO 1 ===");
        System.out.println(guia1);

        System.out.println("\n=== GUÍA TURÍSTICO 2 ===");
        System.out.println(guia2);
    }
}