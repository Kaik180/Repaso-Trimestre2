package org.example;

public class librob {
    static void main() {
        Libro Divina_comedia = new Libro("Divina_comedia", "Kevin Muñoz Corcoles");
        System.out.println(Divina_comedia);
        Estudiante jorge = new Estudiante("jorge","1DAM","jorge@iesmutxamel.com");
        Divina_comedia.prestar(jorge);
        System.out.println(Divina_comedia);

    }
}
