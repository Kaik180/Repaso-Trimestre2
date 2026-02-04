package org.example.Practica1;

import java.time.LocalDate;
import java.util.Scanner;

public class Invitado {

    private String profesion;
    private String nombre;
    private LocalDate fecha;
    private int temporada;

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public Invitado(String profesion, String nombre, int temporada) {
        this.profesion = profesion;
        this.nombre = nombre;
        this.temporada = temporada;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el año de visita:");
        int anio = teclado.nextInt();
        System.out.println("Introduce el mes de visita:");
        int mes = teclado.nextInt();
        System.out.println("Introduce el día de visita:");
        int dia = teclado.nextInt();
        LocalDate fechaVisita = LocalDate.of(anio, mes, dia);
        setFecha(fechaVisita);
    }



}
