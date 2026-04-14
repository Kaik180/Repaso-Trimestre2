package org.example;

public abstract class Votante {
    public String getProblacion() {
        return problacion;
    }

    public void setProblacion(String problacion) {
        this.problacion = problacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVotado() {
        return votado;
    }

    public void setVotado(boolean votado) {
        this.votado = votado;
    }

    public Votante(String problacion, String nombre) {
        this.problacion = problacion;
        this.nombre = nombre;
    }

    private String problacion;
    private String nombre;
    private boolean votado;

    public String votar;
    static int encuestaSatisfaccion;
}
