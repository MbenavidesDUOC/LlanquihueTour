package model;

public class Vehiculo implements Registrable {

    private String patente;
    private String modelo;

    public Vehiculo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String mostrarResumen() {
        return "Vehículo: " + modelo + " | Patente: " + patente;
    }

    @Override
    public String toString() {
        return "Vehículo" +
                "\nModelo: " + modelo +
                "\nPatente: " + patente;
    }
}