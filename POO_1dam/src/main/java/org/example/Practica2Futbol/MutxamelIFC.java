package org.example.Practica2Futbol;

public abstract class MutxamelIFC implements FuncionesIntegrantes {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public MutxamelIFC(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    private String nombre;
    private int edad;
}
