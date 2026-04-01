package org.example.Repaso;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class HashMap2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Creamos una Lista para guardar los nombres que introduzca el usuario
        List<String> listaNombres = new ArrayList<>();

        System.out.println("Introduce nombres (escribe 'fin' para terminar):");
        while (true) {
            String nombre = teclado.nextLine();
            if (nombre.equalsIgnoreCase("fin")) break;
            listaNombres.add(nombre);
        }

        // 2. Creamos el HashMap para contar las apariciones
        // Clave: Nombre (String), Valor: Contador (Integer)
        HashMap<String, Integer> contador = new HashMap<>();

        for (String nombre : listaNombres) {
            if (contador.containsKey(nombre)) {
                // Si el nombre ya está, le sumamos 1 al valor actual
                contador.put(nombre, contador.get(nombre) + 1);
            } else {
                // Si es la primera vez que aparece, lo ponemos con valor 1
                contador.put(nombre, 1);
            }
        }

        // 3. Mostramos los resultados finales
        System.out.println("\n--- Recuento de nombres ---");
        for (Map.Entry<String, Integer> entrada : contador.entrySet()) {
            System.out.println(entrada.getKey() + " aparece " + entrada.getValue() + " veces.");
        }

        // 4. Ejemplo: Buscar un nombre específico
        System.out.print("\n¿Qué nombre quieres consultar?: ");
        String busqueda = teclado.nextLine();

        // El método getOrDefault devuelve el valor si existe, o 0 si no está
        int veces = contador.getOrDefault(busqueda, 0);
        System.out.println("El nombre '" + busqueda + "' aparece " + veces + " veces.");
    }
}
