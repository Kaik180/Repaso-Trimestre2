package org.example.Ejemplos;

import java.util.*;
class Estudiante {
    String nombre;
    double nota;
    int edad;

    Estudiante(String n, double nt, int e) { nombre = n; nota = nt; edad = e; }
    @Override
    public String toString() { return nombre + ":" + nota + " (" + edad + "a)"; }
}

public class comparator {
    public static void main(String[] args) {
        List<Estudiante> lista = new ArrayList<>(Arrays.asList(
                new Estudiante("Ana", 9.5, 20),
                new Estudiante("Pedro", 7.0, 22),
                new Estudiante("Ana", 8.0, 19) // Mismo nombre, distinta nota/edad
        ));

        // 1. Comparación simple (por nota)
        Comparator<Estudiante> porNota = Comparator.comparingDouble(e -> e.nota);
        lista.sort(porNota);

        // 2. Comparación Reversa
        lista.sort(porNota.reversed());

        // 3. Encadenamiento (ThenComparing): Ordenar por nombre, y si son iguales, por edad
        lista.sort(Comparator.comparing((Estudiante e) -> e.nombre)
                .thenComparingInt(e -> e.edad));

        // 4. Manejo de nulos (NullsFirst / NullsLast)
        Comparator<Estudiante> seguro = Comparator.nullsLast(porNota);

        System.out.println("Lista final: " + lista);
    }
}