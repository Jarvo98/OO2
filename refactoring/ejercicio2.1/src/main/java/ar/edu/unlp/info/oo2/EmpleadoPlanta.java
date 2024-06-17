package ar.edu.unlp.info.oo2;

public class EmpleadoPlanta extends EmpleadoConHijos {
    @Override
    protected double getBonoPorHijo() {
        return 2000;
    }
}
