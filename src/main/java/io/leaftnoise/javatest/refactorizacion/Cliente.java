package io.leaftnoise.javatest.refactorizacion;

public class Cliente {


    public Empleado obtenerEmpleado(EmpleadoTablaDB empleadoDB) {
        if (empleadoDB.getTipo() == TipoEmpleado.Malo) {
            EmpleadoMalo homero = new EmpleadoMalo();
            homero.setNombre(empleadoDB.getNombre());
            homero.setApellido(empleadoDB.getApellido());
            homero.setSoloEmpleadoMalo(empleadoDB.getSoloEmpleadoMalo());
            return homero;
        } else if (empleadoDB.getTipo() == TipoEmpleado.Bueno) {
            EmpleadoBueno smithers = new EmpleadoBueno();
            smithers.setNombre(empleadoDB.getNombre());
            smithers.setApellido(empleadoDB.getApellido());
            smithers.setSoloEmpleadoBueno(empleadoDB.getSoloEmpleadoBueno());
            return smithers;
        }
        EmpleadoNuevo nuevo = new EmpleadoNuevo();
        nuevo.setNombre(empleadoDB.getNombre());
        nuevo.setApellido(empleadoDB.getApellido());
        return nuevo;



    }

}


