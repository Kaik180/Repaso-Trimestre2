package org.example.PistasDeportivas;

import java.util.ArrayList;

public class Usuario {
    ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    private String nombre;
    private String id;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }



}
