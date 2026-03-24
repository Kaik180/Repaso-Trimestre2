package org.example.Ejemplos;
import java.util.*;

public class HashsetyTreeset {

         static void main(String[] args) {
            // --- HASHSET ---
            Set<String> hashSet = new HashSet<>();
            hashSet.add("Java");
            hashSet.add("Python");
            hashSet.add("C++");
            hashSet.add("Java"); // No se añade, ya existe

            System.out.println("¿Contiene Java?: " + hashSet.contains("Java"));
            System.out.println("Tamaño: " + hashSet.size());
            hashSet.remove("C++");

            // Operaciones de conjunto (Bulk Operations)
            Set<String> otros = new HashSet<>(Arrays.asList("Rust", "Python"));
            hashSet.addAll(otros); // Unión
            hashSet.retainAll(otros); // Intersección (deja solo lo que coincida)

            System.out.println("HashSet final: " + hashSet);
            hashSet.clear(); // Vacía el set
            System.out.println("¿Está vacío?: " + hashSet.isEmpty());

            // --- TREESET (Ordenado y Navegable) ---
            TreeSet<Integer> numeros = new TreeSet<>();
            numeros.addAll(Arrays.asList(10, 50, 30, 80, 20));

            System.out.println("TreeSet ordenado: " + numeros); // [10, 20, 30, 50, 80]
            System.out.println("Primero: " + numeros.first());
            System.out.println("Último: " + numeros.last());
            System.out.println("Menor o igual a 35: " + numeros.floor(35)); // 30
            System.out.println("Mayor a 30: " + numeros.higher(30)); // 50
            System.out.println("Subconjunto (20 a 60): " + numeros.subSet(20, 60));
            System.out.println("Descendente: " + numeros.descendingSet());

            numeros.pollFirst(); // Elimina el primero (10)
            numeros.pollLast();  // Elimina el último (80)
        }

}
