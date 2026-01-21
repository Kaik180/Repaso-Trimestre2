package org.example;

public class libro {
    private static int cantidadlibros=0;
    private static int librosdisponibles=0;
    private String titulo;
    private String Autor;
    private int id;
    private boolean disponible;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public libro(String titulo, String autor, int id) {
        this.titulo = titulo;
        Autor = autor;
        this.id = id;
        this.disponible = true;
        cantidadlibros++;
        librosdisponibles++;
    }
    private String calcularid(){
        return "LIB"+cantidadlibros;

    }
    public void prestar(){
        if (disponible==true){
            System.out.println("el libro ha sido prestado con exito");
            librosdisponibles--;
            disponible=false;
        }else{
            System.out.println("No se puede prestar");
        }


    }
    public void devolver(){
        if (disponible==false){
            System.out.println("el libro ha sido devuelto con exito");
            librosdisponibles++;
            disponible=true;
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
        return "libro [titulo: "+ titulo + " autor: "+ Autor + " id: "+ id + " disponible: "+ disponible +"]";

    }

}
