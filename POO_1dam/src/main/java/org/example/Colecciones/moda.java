package org.example.Colecciones;

import java.util.Arrays;

public class moda {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext()) return false;

        int n = in.nextInt();

        // El caso 0 marca el final
        if (n == 0) {
            return false;
        } else {
            int[] valores = new int[n];
            for (int i = 0; i < n; i++) {
                valores[i] = in.nextInt();
            }

            // Ordenamos para agrupar los números iguales
            Arrays.sort(valores);

            int moda = valores[0];
            int maxRepeticiones = 0;

            int actualRepeticiones = 0;
            int valorActual = valores[0];

            for (int i = 0; i < n; i++) {
                if (valores[i] == valorActual) {
                    // Seguimos en el mismo bloque de números
                    actualRepeticiones++;
                } else {
                    // Nuevo número encontrado, comprobamos si el bloque anterior era la moda
                    if (actualRepeticiones > maxRepeticiones) {
                        maxRepeticiones = actualRepeticiones;
                        moda = valorActual;
                    }
                    // Reiniciamos para el nuevo número
                    valorActual = valores[i];
                    actualRepeticiones = 1;
                }
            }

            // Comprobación final para el último bloque de números
            if (actualRepeticiones > maxRepeticiones) {
                moda = valorActual;
            }

            System.out.println(moda);
            return true;
        }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba());
    }
}
