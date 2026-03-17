package org.example.PistasDeportivas;

import java.time.LocalDateTime;

public class Reserva {
    private Usuario usuario;
    private Pista pista;
    private LocalDateTime fechaHora;


    public Reserva(Usuario usuario, Pista pista) {
        this.usuario = usuario;
        this.pista = pista;
        this.fechaHora = LocalDateTime.now() ;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Pista getPista() {
        return pista;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "usuario=" + usuario +
                ", pista=" + pista +
                ", fechaHora=" + fechaHora +
                '}';
    }
}

