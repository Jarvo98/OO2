package ar.edu.unlp.info.oo2;

public abstract class Empleado {

    public double getSueldo() {
        return (this.getBasico() - this.getDescuentoABasico()) + (this.getAdicional() - this.getDescuentoAAdicional());
    }

    protected abstract double getBasico();

    protected abstract double getAdicional();

    private double getDescuentoABasico() {
        return this.getBasico() * 0.13;
    }

    private double getDescuentoAAdicional() {
        return this.getAdicional() * 0.05;
    }
}
