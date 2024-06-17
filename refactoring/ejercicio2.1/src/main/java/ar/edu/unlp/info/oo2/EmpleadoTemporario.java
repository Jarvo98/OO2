package ar.edu.unlp.info.oo2;

public class EmpleadoTemporario extends EmpleadoConHijos {
    private double horasTrabajadas = 0;

    public double sueldo() {
        return super.sueldo() + (this.horasTrabajadas * 500);
    }

    @Override
    protected double getBonoPorHijo() {
        return 1000;
    }
}
