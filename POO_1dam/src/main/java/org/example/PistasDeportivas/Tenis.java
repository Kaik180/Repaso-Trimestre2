package org.example.PistasDeportivas;

public class Tenis extends Pista{
    private String tipo;
    private String identificador;
    private Superficie superficie;

    public Tenis(String tipo, String identificador, Superficie superficie) {
        super(tipo, identificador);
        this.superficie=superficie;
    }
}
