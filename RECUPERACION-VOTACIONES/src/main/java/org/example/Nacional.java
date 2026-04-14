package org.example;

public class Nacional extends Votante{
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    private String dni;

    public Nacional(String problacion,String nombre, String dni) {
        super(problacion, nombre);
        this.dni=dni;

    }
}
