package ar.edu.unlp.info.oo2;

public abstract class EmpleadoConHijos extends Empleado {
    private int cantidadHijos = 0;

    protected abstract double getBonoPorHijo();

    public double sueldo() {
        return super.sueldo() + (this.getBonoPorHijo() * this.cantidadHijos);
    }
}
