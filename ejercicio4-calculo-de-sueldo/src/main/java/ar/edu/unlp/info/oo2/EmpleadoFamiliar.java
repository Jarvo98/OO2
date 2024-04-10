package ar.edu.unlp.info.oo2;

public abstract class EmpleadoFamiliar extends Empleado {
    private boolean estaCasado;
    private int cantidadDeHijos;

    protected EmpleadoFamiliar(boolean estaCasado, int cantidadDeHijos) {
        this.estaCasado = estaCasado;
        this.cantidadDeHijos = cantidadDeHijos;
    }

    @Override
    protected double getAdicional() {
        return this.calcularBonoPorCasado() + this.calcularBonoPorHijos();
    }

    private double calcularBonoPorCasado() {
        return this.estaCasado ? 5000 : 0;
    }

    private double calcularBonoPorHijos() {
        return this.cantidadDeHijos * 2000;
    }
}
