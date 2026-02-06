package org.example.BancoMutxamel;

public class Cliente {

    private static int contadorId = 1;

    private int id;
    private String nombre;
    private String apellidos;

    public Cliente(String nombre, String apellidos) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return id + ". " + nombre + " " + apellidos;
    }
}

