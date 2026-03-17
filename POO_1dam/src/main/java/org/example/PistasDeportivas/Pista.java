package org.example.PistasDeportivas;

public abstract class Pista {
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }


    public Pista(String tipo, String identificador) {
        this.tipo = tipo;
        this.identificador = identificador;
    }

    private String tipo;
    private String identificador;
}
