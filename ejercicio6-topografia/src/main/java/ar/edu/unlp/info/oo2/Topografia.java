package ar.edu.unlp.info.oo2;

public abstract class Topografia {
    abstract double calcularProporcion();

    public boolean equals(Topografia topografia) {
        return this.calcularProporcion() == topografia.calcularProporcion();
    }
}
