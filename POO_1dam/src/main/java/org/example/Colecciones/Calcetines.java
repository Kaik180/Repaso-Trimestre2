package org.example.Colecciones;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Calcetines {
    static Scanner teclado = new Scanner(System.in);

    public static boolean resolverCaso() {
        if (!teclado.hasNextInt()) return false;
        int n = teclado.nextInt();

        if (n == 0) return false;

        Set<Integer> mesa = new HashSet<>();
        int maximoEnMesa = 0;

        for (int i = 0; i < n; i++) {
            int idCalcetin = teclado.nextInt();

            // Si el calcetín ya está en la mesa, lo quitamos (pareja formada)
            if (mesa.contains(idCalcetin)) {
                mesa.remove(idCalcetin);
            } else {
                // Si no está, lo dejamos en la mesa esperando a su pareja
                mesa.add(idCalcetin);
            }

            // Actualizamos el récord de calcetines simultáneos
            if (mesa.size() > maximoEnMesa) {
                maximoEnMesa = mesa.size();
            }
        }
        
        System.out.println(maximoEnMesa);

        return true;
    }

    public static void main(String[] args) {
        // El bucle llama a resolverCaso() hasta que este devuelve false (cuando lee un 0)
        while (resolverCaso());
    }
}
