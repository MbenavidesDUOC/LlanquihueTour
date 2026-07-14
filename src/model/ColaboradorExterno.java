package model;

public class ColaboradorExterno extends Persona implements Registrable {

    private String empresa;

    public ColaboradorExterno(String rut,
                              String nombre,
                              Direccion direccion,
                              String empresa) {

        super(rut, nombre, direccion);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String mostrarResumen() {
        return "Colaborador: " + getNombre() +
                " | Empresa: " + empresa;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEmpresa: " + empresa;
    }
}