package org.example;

public class Estudiante {
    private static int contador_estudiantes = 0;

    private String nombre;
    private String curso;
    private int nia;
    private String email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNia() {
        return nia;
    }

    public void setNia(int nia) {
        this.nia = nia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Estudiante(String nombre, String curso, String email) {
        this.nombre = nombre;
        this.curso = curso;
        this.nia = contador_estudiantes+1;
        this.email = email;
    }
    @Override
    public String toString() {
        return super.toString();
    }


}
