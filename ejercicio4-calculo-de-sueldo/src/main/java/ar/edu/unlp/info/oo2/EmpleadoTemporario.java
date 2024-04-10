package ar.edu.unlp.info.oo2;

public class EmpleadoTemporario extends EmpleadoFamiliar {
    private int horasTrabajadas;

    public EmpleadoTemporario(boolean estaCasado, int cantidadDeHijos, int horasTrabajadas) {
        super(estaCasado, cantidadDeHijos);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    protected double getBasico() {
        return 20000 + (this.horasTrabajadas * 300);
    }
}
