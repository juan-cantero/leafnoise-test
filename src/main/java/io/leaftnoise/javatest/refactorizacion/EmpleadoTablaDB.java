package io.leaftnoise.javatest.refactorizacion;

public class EmpleadoTablaDB {
    private String nombre;
    private String apellido;
    private TipoEmpleado tipo;
    private String soloEmpleadoBueno;
    private String soloEmpleadoMalo;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public TipoEmpleado getTipo() {
        return tipo;
    }

    public void setTipo(TipoEmpleado tipo) {
        this.tipo = tipo;
    }

    public String getSoloEmpleadoBueno() {
        return soloEmpleadoBueno;
    }

    public void setSoloEmpleadoBueno(String soloEmpleadoBueno) {
        this.soloEmpleadoBueno = soloEmpleadoBueno;
    }

    public String getSoloEmpleadoMalo() {
        return soloEmpleadoMalo;
    }

    public void setSoloEmpleadoMalo(String soloEmpleadoMalo) {
        this.soloEmpleadoMalo = soloEmpleadoMalo;
    }
}
