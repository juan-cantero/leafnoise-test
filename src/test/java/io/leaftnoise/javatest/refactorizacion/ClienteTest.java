package io.leaftnoise.javatest.refactorizacion;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ClienteTest {
    EmpleadoTablaDB empleadoTablaDB;
    Cliente cliente;
    @BeforeMethod
    public void setUp() {
        empleadoTablaDB = new EmpleadoTablaDB();
        cliente = new Cliente();
    }

    @Test
    public void testObtenerEmpleadoNuevo() {
        //arrange
        empleadoTablaDB.setNombre("juan");
        empleadoTablaDB.setApellido("cantero");
        //act
        Empleado empleado = cliente.obtenerEmpleado(empleadoTablaDB);
        //assert
        Assert.assertNotNull(empleado);
    }


}