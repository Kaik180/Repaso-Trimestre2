package org.example.Ejemplos;

import java.util.*;

public class EjercicioListas {
    public static void main(String[] args) {
        // ARRAYLIST: Ideal para buscar libros por índice (acceso aleatorio)
        List<String> catalogo = new ArrayList<>();
        catalogo.add("Don Quijote");
        catalogo.add("El Principito");
        catalogo.add("1984");
        System.out.println("Libro en posición 1: " + catalogo.get(1)); // O(1)

        // LINKEDLIST: Ideal para insertar/eliminar al inicio (libros recién devueltos)
        LinkedList<String> devueltos = new LinkedList<>();
        devueltos.addFirst("Rayuela");
        devueltos.addFirst("Fahrenheit 451"); // Inserción rápida al inicio O(1)
        System.out.println("Último devuelto: " + devueltos.peekFirst());
    }
}
