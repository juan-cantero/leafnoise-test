package io.leaftnoise.javatest.plantanuclear;

import io.leaftnoise.javatest.plantanuclear.empleados.EmpleadoControl;

public class PlantaNuclear {
    public EmpleadoControl empleadoDeControl;
    public Integer cantidadDeUranio = 0;
    public Burns duenio = new Burns();
    

    public void agregarUranio(Integer uranio) {
        cantidadDeUranio += uranio;
    }

    public boolean estaEnPeligro() {
        return (empleadoDeControl.estaDistraido() && this.cantidadDeUranio > 1000)
                || duenio.estaPobre();
    }


}
