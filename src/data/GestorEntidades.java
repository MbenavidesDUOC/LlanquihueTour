package data;

import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Registrable;
import model.Vehiculo;

import java.util.ArrayList;

public class GestorEntidades {

    private ArrayList<Registrable> entidades;

    public GestorEntidades() {
        entidades = new ArrayList<>();
    }

    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }

    public void mostrarEntidades() {

        for (Registrable entidad : entidades) {

            System.out.println(entidad.mostrarResumen());

            if (entidad instanceof GuiaTuristico) {
                System.out.println("→ Es un guía turístico.");
            } else if (entidad instanceof Vehiculo) {
                System.out.println("→ Es un vehículo.");
            } else if (entidad instanceof ColaboradorExterno) {
                System.out.println("→ Es un colaborador externo.");
            }

            System.out.println("----------------------------");
        }
    }

    public String obtenerResumen() {

        StringBuilder resumen = new StringBuilder();

        for (Registrable entidad : entidades) {

            resumen.append(entidad.mostrarResumen());

            if (entidad instanceof GuiaTuristico) {
                resumen.append(" (Guía turístico)");
            } else if (entidad instanceof Vehiculo) {
                resumen.append(" (Vehículo)");
            } else if (entidad instanceof ColaboradorExterno) {
                resumen.append(" (Colaborador externo)");
            }

            resumen.append("\n\n");
        }

        if (resumen.length() == 0) {
            return "No hay entidades registradas.";
        }

        return resumen.toString();
    }
}