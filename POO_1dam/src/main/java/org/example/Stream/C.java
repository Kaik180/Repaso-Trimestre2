package org.example.Stream;

import java.util.Arrays;
import java.util.List;

public class C {
    static void main() {
        List<String> nombres = Arrays.asList("Ibai", "Illojuan", "Ana", "kevin" );

        long cantidad = nombres.stream()
                .filter(nombre -> nombre.startsWith("A"))
                .count();

        System.out.println("Nombres que empiezan con 'A': " + cantidad);
    }

}
