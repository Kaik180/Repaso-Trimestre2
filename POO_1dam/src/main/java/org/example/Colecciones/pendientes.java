package org.example.Colecciones;

import java.util.Arrays;

public class pendientes { // Asume fichero llamado solution.java

    static java.util.Scanner in;

    public static boolean casoDePrueba() {

        // 1. Leer caso de prueba
        if (!in.hasNext()) return false;
        int p = in.nextInt();

        // 2. ¿Es el caso que marca el final?
        if (p == 0) {
            return false;
        } else {
            // 3. CÓDIGO PRINCIPAL AQUÍ
            int[] pendientes = new int[p];
            for (int i = 0; i < p; i++) {
                pendientes[i] = in.nextInt();
            }

            // Ordenamos para que las parejas queden juntas
            Arrays.sort(pendientes);

            int parejas = 0;
            int i = 0;

            // Recorremos buscando elementos iguales contiguos
            while (i < p - 1) {
                if (pendientes[i] == pendientes[i + 1]) {
                    parejas++;
                    i += 2; // Pareja formada, saltamos ambos
                } else {
                    i++; // No son iguales, pasamos al siguiente
                }
            }

            System.out.println(parejas);
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
            // Se ejecuta hasta que casoDePrueba devuelva false
        }
    } // main
} // class solution