package org.example.Practica1;

import java.time.LocalDate;
import java.time.LocalDateTime;

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

    public Invitado(String profesion, String nombre, LocalDateTime fecha, int temporada) {
        this.profesion = profesion;
        this.nombre = nombre;
        this.fecha = LocalDate.now();
        this.temporada = temporada;
    }


}
