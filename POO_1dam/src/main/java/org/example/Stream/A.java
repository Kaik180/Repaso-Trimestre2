package org.example.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class A {
    static void main() {
        List<String> nombres = Arrays.asList("Ibai", "Illojuan", "Falete", "kevin" );

        nombres.stream()
                .filter(nombre -> nombre.length() > 4)
                .forEach(System.out::println);

    }
}
