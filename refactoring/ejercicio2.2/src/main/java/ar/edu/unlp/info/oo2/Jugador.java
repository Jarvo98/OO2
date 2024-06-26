package ar.edu.unlp.info.oo2;

public class Jugador {
    private String nombre;
    private String apellido;
    private int puntuacion;

    public Jugador(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puntuacion = 0;
    }

    public void incrementar() {
        this.puntuacion += 100;
    }

    public void decrementar() {
        this.puntuacion -= 50;
    }
}
