package org.example;

import java.util.Scanner;

public class SopaLetras {
     static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Filas: ");
        int M = teclado.nextInt();
        System.out.print("Columnas: ");
        int N = teclado.nextInt();
        teclado.nextLine();

        char[][] m = new char[M][N];

        for (int i = 0; i < M; i++) {
            System.out.print("Fila " + (i + 1) + ": ");
            String fila = teclado.nextLine();

            if (fila.length() != N || !fila.matches("[a-zA-Z]+")) {
                System.out.println("ERROR. Introduce datos válidos: " + N + " letras.");
                return;
            }
            m[i] = fila.toLowerCase().toCharArray();
        }

        System.out.print("Palabra: ");
        String p = teclado.nextLine().toLowerCase();
        int len = p.length();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {

                if (j + len <= N) {
                    boolean ok = true;
                    for (int k = 0; k < len; k++)
                        if (m[i][j + k] != p.charAt(k)) ok = false;

                    if (ok) {
                        System.out.println("Encontrada!!! En la posición " + i + " " + j);
                        return;
                    }
                }

                if (i + len <= M) {
                    boolean ok = true;
                    for (int k = 0; k < len; k++)
                        if (m[i + k][j] != p.charAt(k)) ok = false;

                    if (ok) {
                        System.out.println("Encontrada!!! En la posición " + i + " " + j); // [cite: 100, 102]
                        return;
                    }
                }
            }
        }
    }
}
