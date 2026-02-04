package org.example;

public class Estudianteb {
    static void main() {
        Estudiante jorge = new Estudiante("jorge","1DAM","jorge@iesmutxamel.com");
        System.out.println(jorge.getNia());

        Estudiante raul = new Estudiante("kevin", "raul");

        System.out.println(Estudiante.obtenertotalestudiantes());
    }
}
