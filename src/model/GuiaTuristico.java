package model;

public class GuiaTuristico extends Persona implements Registrable {

    private String idioma;

    public GuiaTuristico(String rut, String nombre, Direccion direccion, String idioma) {
        super(rut, nombre, direccion);
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nIdioma: " + idioma;
    }
    @Override
    public String mostrarResumen() {
        return "Guía: " + getNombre() +
                " | Idioma: " + idioma;
    }
}