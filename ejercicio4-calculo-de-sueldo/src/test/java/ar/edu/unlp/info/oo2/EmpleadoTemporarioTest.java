package ar.edu.unlp.info.oo2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmpleadoTemporarioTest {
    @Test
    public void getSueldoTest() {
        EmpleadoTemporario empleadoTemporario = new EmpleadoTemporario(false, 0, 0);

        Assertions.assertEquals(empleadoTemporario.getSueldo(), 17400);
    }

    @Test
    public void getSueldoConHorasTrabajadas() {
        EmpleadoTemporario empleadoTemporario = new EmpleadoTemporario(false, 0, 10);

        Assertions.assertEquals(empleadoTemporario.getSueldo(), 20010);
    }

    @Test
    public void getSueldoDeEmpleadoCasado() {
        EmpleadoTemporario empleadoTemporario = new EmpleadoTemporario(true, 0, 0);

        Assertions.assertEquals(empleadoTemporario.getSueldo(), 22150);
    }

    @Test
    public void getSueldoDeEmpleadoCasadoYConHijos() {
        EmpleadoTemporario empleadoTemporario = new EmpleadoTemporario(true, 3, 0);

        Assertions.assertEquals(empleadoTemporario.getSueldo(), 27850);
    }
}
