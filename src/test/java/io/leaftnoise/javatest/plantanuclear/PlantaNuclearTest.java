package io.leaftnoise.javatest.plantanuclear;

import io.leaftnoise.javatest.plantanuclear.empleados.EmpleadoControl;
import io.leaftnoise.javatest.plantanuclear.empleados.Homero;
import io.leaftnoise.javatest.plantanuclear.empleados.PatoBalancin;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PlantaNuclearTest {

    EmpleadoControl homero;
    EmpleadoControl patoBalancin;
    Burns duenio;
    PlantaNuclear plantaNuclear;

    @BeforeMethod
    public void setUp() {
        homero = new Homero();
        patoBalancin = new PatoBalancin();
        duenio = new Burns();
        plantaNuclear = new PlantaNuclear();


    }

    @Test
    public void homeroEstaEnLaPlantaDeberiaDevolverTrue() {
        //arrange
        plantaNuclear.empleadoDeControl = homero;
        plantaNuclear.agregarUranio(2000);
        //act
        var expected = plantaNuclear.estaEnPeligro();
        //assert
        assertTrue(expected);
    }

    @Test
    public void empleadoNoEstaDistraidoDeberiaDevolverFalse() {
        //arrage
        plantaNuclear.empleadoDeControl = patoBalancin;
        plantaNuclear.agregarUranio(1001);
        //act
        var expected = plantaNuclear.estaEnPeligro();
        //assert
        assertFalse(expected);
    }

    @Test
    public void burnsEstaPobreDeberiaDevolverTrue() {
        //arrage
        plantaNuclear.empleadoDeControl = patoBalancin;
        plantaNuclear.agregarUranio(10);
        plantaNuclear.duenio.estaPobre = true;
        //act
        var expected = plantaNuclear.estaEnPeligro();
        //assert
        assertTrue(expected);
    }


}