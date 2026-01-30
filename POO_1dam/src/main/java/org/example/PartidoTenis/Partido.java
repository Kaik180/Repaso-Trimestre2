package org.example.PartidoTenis;

import java.util.ArrayList;

public class Partido {
    private Jugador j1;
    private Jugador j2;
    private ArrayList<Set> listSet;
    private Jugador Rival;
    public Jugador getRival() {
        return Rival;
    }

    public void setRival(Jugador rival) {
        Rival = rival;
    }



    public ArrayList<Set> getListSet() {
        return listSet;
    }

    public void setListSet(ArrayList<Set> listSet) {
        this.listSet = listSet;
    }


    public Jugador getJ1() {
        return j1;
    }

    public void setJ1(Jugador j1) {
        this.j1 = j1;
    }

    public Jugador getJ2() {
        return j2;
    }

    public void setJ2(Jugador j2) {
        this.j2 = j2;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "j1=" + j1 +
                ", j2=" + j2 +
                ", listSet=" + listSet +
                '}';
    }

    public Partido(Jugador j1, Jugador j2) {
        this.j1 = j1;
        this.j2 = j2;
        this.listSet = new ArrayList<>();
        this.j1.setRival(j2);
        this.j2.setRival(j1);
    }
    public void insertarSet(){

    }



}
