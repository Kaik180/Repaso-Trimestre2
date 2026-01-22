package org.example;

public class Estudiante {
    private static int contador_estudiantes = 0;
    private static String CORREO_FORMATO = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";

    private String nombre;
    private String curso;
    private int nia;
    private String email;
    private Libro libro;

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
    public Libro getLibro() {
        return libro;
    }
    public void setLibro(Libro libroprestado) {
        this.libro = libroprestado;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Estudiante(String nombre, String curso, String email) {
        this.nombre = nombre;
        this.curso = curso;
        this.nia = contador_estudiantes+1;
        this.email = email;
        libro = null;
    }
    public Estudiante(String nombre) {
        this(nombre,"","");
    }
    @Override
    public String toString(){
        return "Estudiante [nombre: "+ nombre + " curso: "+ curso + " nia: "+ nia + " email: "+ email+ "libro prestado: "+ libro+" ]" ;

    }
    public static int obtenertotalestudiantes(){

        return contador_estudiantes;
    }
    public static boolean validarcorreo(String email){
        if(email.matches(CORREO_FORMATO)){
            return true;
        }else
            return false;
    }

}
