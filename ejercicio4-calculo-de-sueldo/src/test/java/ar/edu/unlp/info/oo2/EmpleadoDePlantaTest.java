package ar.edu.unlp.info.oo2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmpleadoDePlantaTest {
    @Test
    public void getSueldoTest() {
        EmpleadoDePlanta empleadoDePlanta = new EmpleadoDePlanta(false, 0, 1);

        Assertions.assertEquals(empleadoDePlanta.getSueldo(), 45400);
    }

    @Test
    public void getSueldoTestCasado() {
        EmpleadoDePlanta empleadoDePlanta = new EmpleadoDePlanta(true, 0, 1);

        Assertions.assertEquals(empleadoDePlanta.getSueldo(), 50150);
    }

    @Test
    public void getSueldoTestCasadoConHijos() {
        EmpleadoDePlanta empleadoDePlanta = new EmpleadoDePlanta(true, 3, 1);

        Assertions.assertEquals(empleadoDePlanta.getSueldo(), 55850);
    }
}
