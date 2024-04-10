package ar.edu.unlp.info.oo2;

public class EmpleadoDePlanta extends EmpleadoFamiliar {
    private double anosTrabajados;

    protected EmpleadoDePlanta(boolean estaCasado, int cantidadDeHijos, double anosTrabajados) {
        super(estaCasado, cantidadDeHijos);
        this.anosTrabajados = anosTrabajados;
    }

    @Override
    protected double getBasico() {
        return 50000;
    }

    @Override
    protected double getAdicional() {
        return super.getAdicional() + (this.anosTrabajados * 2000);
    }
}
