package org.example;

public class librob {
    static void main() {
        Editorial Capcoon = new Editorial("Capcoon", "España");
        Libro Divina_comedia = new Libro("Divina_comedia", "Kevin Muñoz Corcoles", Capcoon);
        Estudiante jorge = new Estudiante("jorge","1DAM","jorge@iesmutxamel.com");
        Prestamo p1 = Divina_comedia.prestar(jorge);
        System.out.println(p1);

    }
}
