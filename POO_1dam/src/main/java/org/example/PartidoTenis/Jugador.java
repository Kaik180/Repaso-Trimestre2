package org.example.PartidoTenis;

public class Jugador {

    private String nombre;
    private int ranking;
    private Jugador Rival;

    public Jugador getRival() {
        return Rival;
    }

    public void setRival(Jugador rival) {
        Rival = rival;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public Jugador(String nombre, int ranking) {
        this.nombre = nombre;
        this.ranking = ranking;
        this.Rival = null;
    }


}
