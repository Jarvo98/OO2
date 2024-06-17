package ar.edu.unlp.info.oo2;

public class Juego {
    private Jugador jugador;

    public Juego(Jugador jugador) {
        this.jugador = jugador;
    }

    public void incrementar() {
        this.jugador.incrementar();
    }

    public void decrementar() {
        this.jugador.decrementar();
    }
}
