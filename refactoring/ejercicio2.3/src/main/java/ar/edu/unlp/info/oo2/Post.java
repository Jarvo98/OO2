package ar.edu.unlp.info.oo2;

import java.time.LocalDateTime;

public class Post {
    private String texto;
    private LocalDateTime fecha;
    private Usuario usuario;

    public Post(String texto, Usuario usuario) {
        this.texto = texto;
        this.usuario = usuario;
        this.fecha = LocalDateTime.now();
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public LocalDateTime getFecha() {
        return this.fecha;
    }
}
