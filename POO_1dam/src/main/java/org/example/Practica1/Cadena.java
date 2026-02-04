package org.example.Practica1;

import java.util.ArrayList;

public class Cadena {
    private String nombre;
    private ArrayList<Programa> listaProgramas;


    @Override
    public String toString() {
        return "Cadena{" +
                "nombre='" + nombre + '\'' +
                ", listaProgramas=" + listaProgramas +
                '}';
    }

    public Cadena(String nombre) {
        this.nombre = nombre;
        this.listaProgramas = new ArrayList<>();
    }



    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addPrograma(Programa p) {
        listaProgramas.add(p);
    }
    public void removePrograma(Programa p) {
        listaProgramas.remove(p);
    }


}
