package org.example.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B {
    static void main() {
        List<String> nombres = Arrays.asList("Ibai", "Illojuan", "Falete", "kevin" );

        List<String> nombresMinusculas = nombres.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println(nombresMinusculas);
    }
}
