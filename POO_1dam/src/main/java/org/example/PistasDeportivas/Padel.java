package org.example.PistasDeportivas;

public class Padel extends Pista{
    private String tipo;
    private String identificador;
    private Paredes paredes;

    public Padel(String tipo, String identificador,Paredes paredes) {
        super(tipo, identificador);
        this.paredes=paredes;
    }
}
