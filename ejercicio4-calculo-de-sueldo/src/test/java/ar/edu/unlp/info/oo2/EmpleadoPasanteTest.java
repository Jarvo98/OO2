package ar.edu.unlp.info.oo2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmpleadoPasanteTest {
    @Test
    public void getSueldoTest() {
        EmpleadoPasante empleadoPasante = new EmpleadoPasante(5);

        Assertions.assertEquals(empleadoPasante.getSueldo(), 26900);
    }

    @Test
    public void getSueldoTestSinExamenes() {
        EmpleadoPasante empleadoPasante = new EmpleadoPasante(0);

        Assertions.assertEquals(empleadoPasante.getSueldo(), 17400);
    }
}
