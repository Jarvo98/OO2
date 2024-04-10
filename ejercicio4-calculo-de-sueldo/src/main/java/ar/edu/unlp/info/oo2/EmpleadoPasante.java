package ar.edu.unlp.info.oo2;

public class EmpleadoPasante extends Empleado {
    private int examenesRendidos;

    public EmpleadoPasante(int examenesRendidos) {
        this.examenesRendidos = examenesRendidos;
    }

    @Override
    protected double getBasico() {
        return 20000;
    }

    @Override
    protected double getAdicional() {
        return this.examenesRendidos * 2000;
    }
}
