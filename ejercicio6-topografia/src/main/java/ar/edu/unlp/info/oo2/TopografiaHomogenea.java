package ar.edu.unlp.info.oo2;

public abstract class TopografiaHomogenea implements Topografia {
    @Override
    public boolean equals(Topografia topografia) {
        return this.calcularProporcion() == topografia.calcularProporcion();
    }
}
