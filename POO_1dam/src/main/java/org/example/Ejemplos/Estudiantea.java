package org.example.Ejemplos;


import java.util.Objects;

public class Estudiantea {
    private String apellidos;
    private String nombre;
    private String curso;
    private int edad;

    public Estudiantea(String apellidos, String nombre, String curso, int edad) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.curso = curso;
        this.edad = edad;
    }

    // Getters necesarios para el Comparator
    public String getApellidos() { return apellidos; }
    public String getNombre() { return nombre; }
    public String getCurso() { return curso; }
    public int getEdad() { return edad; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estudiantea)) return false;
        Estudiantea that = (Estudiantea) o;
        return Objects.equals(apellidos, that.apellidos) &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(curso, that.curso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apellidos, nombre, curso);
    }

    @Override
    public String toString() {
        return apellidos + ", " + nombre + " (" + edad + " años). Curso: " + curso;
    }
}
