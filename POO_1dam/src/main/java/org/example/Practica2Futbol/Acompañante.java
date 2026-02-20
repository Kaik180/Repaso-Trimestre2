package org.example.Practica2Futbol;

import java.util.Scanner;

public class Acompañante extends MutxamelIFC {
    static Scanner teclado = new Scanner(System.in);
    public Jugador getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    private Jugador integrante;
    private String parentesco;

    public Acompañante(String nombre, int edad, Jugador jugador, String parentesco) {
        super(nombre, edad);
        this.integrante=jugador;
        this.parentesco=parentesco;
    }

    public void animarEquipo(){
        System.out.println("Mucha suerte equipo!!!");

    }

    @Override
    public void concentrarse() {
        System.out.println("El acompañante"+getNombre()+"Se concentra al maximo");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El acompañante"+getNombre()+" Viaja a la ciudad: "+ ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("El acompañante"+getNombre()+ " Celebra el gol gol gol gol");
    }
}
