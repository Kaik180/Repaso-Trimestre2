package org.example;

public class Libro {
    private static int cantidadlibros=0;
    private static int librosdisponibles=0;
    private String titulo;
    private String Autor;
    private String id;
    private boolean disponible;
    private Estudiante estudiantePrestado;
    private Editorial editoriallibro;

    public Editorial getEditoriallibro() {
        return editoriallibro;
    }

    public void setEditoriallibro(Editorial editoriallibro) {
        editoriallibro = editoriallibro;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }


    public Libro(String titulo, String autor, Editorial editoriallibros) {
        this.titulo = titulo;
        Autor = autor;
        this.id = calcularid();
        this.disponible = true;
        estudiantePrestado = null;
        editoriallibro = editoriallibros;
        cantidadlibros++;
        librosdisponibles++;
    }
    private String calcularid(){
        return "LIB"+cantidadlibros;

    }
    public void prestar(Estudiante estudiante){
        if (disponible && estudiante.getLibro() != null){
            System.out.println("el libro"+ titulo+" ha sido prestado con exito a "+ estudiantePrestado.getNombre()+ "del curso de"+ estudiantePrestado.getCurso());
            librosdisponibles--;
            disponible=false;
            estudiantePrestado = estudiante;
            estudiante.setLibro(this);
        }else if (estudiante.getLibro() == null){
            System.out.println("el estudiante "+ estudiante.getNombre()+" ya tiene un libro prestado");
        }else{
            System.out.println("No se puede prestar");
        }
    }
    public void devolver(){
        if (disponible==false){
            System.out.println("el libro ha sido devuelto con exito");
            librosdisponibles++;
            disponible=true;
            estudiantePrestado = null;
            estudiantePrestado.setLibro(null);
        }else{
            System.out.println("No se puede devolver");
        }
    }
    public static int estadisponible(){
          return cantidadlibros;

    }
    public static int getlibrosdisponibles(){
        return librosdisponibles;

    }
    public String toString(){
        return "libro [titulo: "+ titulo + " ,autor: "+ Autor + " ,id: "+ id + " ,disponible: "+ disponible +" ,Estudiante: "+estudiantePrestado.getNombre()+" Editorial:"+editoriallibro+" ]";

    }

}
