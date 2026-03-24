package org.example.Ejemplos;

import java.util.*;

public class hashmapytreemap {
    public static void main(String[] args) {
        // --- HASHMAP ---
        Map<String, Integer> stock = new HashMap<>();

        // Comandos de inserción y acceso
        stock.put("Manzanas", 50);
        stock.put("Peras", 30);
        stock.putIfAbsent("Naranjas", 100); // Solo añade si no existe la clave

        // Comandos de recuperación
        System.out.println("Stock de Manzanas: " + stock.get("Manzanas"));
        System.out.println("Si no existe, dame 0: " + stock.getOrDefault("Plátanos", 0));

        // Comandos de procesamiento (Java 8+)
        stock.replace("Peras", 30, 35); // Reemplaza solo si el valor coincide
        stock.replaceAll((k, v) -> v + 10); // Sube el stock de todo en 10
        stock.compute("Manzanas", (k, v) -> (v == null) ? 1 : v + 5); // Incrementa
        stock.merge("Uvas", 20, Integer::sum); // Si existe suma 20, si no, lo crea

        // Vistas del mapa
        System.out.println("Claves: " + stock.keySet());
        System.out.println("Valores: " + stock.values());

        // Iteración completa
        stock.forEach((k, v) -> System.out.println(k + " -> " + v));

        // --- TREEMAP (Ordenado por clave) ---
        TreeMap<String, String> agenda = new TreeMap<>();
        agenda.put("Carlos", "123-456");
        agenda.put("Ana", "999-888");
        agenda.put("Zoe", "555-444");

        System.out.println("Agenda ordenada: " + agenda);
        System.out.println("Primera clave: " + agenda.firstKey());
        System.out.println("Entrada menor a Carlos: " + agenda.lowerEntry("Carlos"));
        System.out.println("Mapa del principio hasta Carlos: " + agenda.headMap("Carlos", true));

        agenda.pollFirstEntry(); // Elimina a Ana (la primera)
    }
}
