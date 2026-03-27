package org.example.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Pruebas_streams {
    static void main() {
        Stream<String> pruebaStream =Stream.of("Ibai", "Illojuan", "Falete", "kevin" )
        .filter(persona -> persona.startsWith("I"))
        .filter(persona -> persona.contains("o"))
                .map(persona -> persona.toUpperCase());


        boolean pruebaStrea2 =Stream.of("Ibai", "Illojuan", "Falete", "kevin" )
                .anyMatch(persona -> persona.equals("Illojuan"));



        List<String> lista = pruebaStream.toList();
        System.out.println(lista);

    }
}
