package org.example;

public class Extranjero extends Votante{
    public String getNie() {
        return nie;
    }

    public void setNie(String nie) {
        this.nie = nie;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    private String nie;
    private String pais;

    public Extranjero(String problacion, String nombre,String nie, String pais) {
        super(problacion, nombre);
        this.pais=pais;
        this.nie=nie;
    }
}
