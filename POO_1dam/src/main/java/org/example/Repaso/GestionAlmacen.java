package org.example.Repaso;

import java.util.Scanner;
import java.util.Arrays;

public class GestionAlmacen {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Declaración e Inicialización directa
        // Representa 3 pasillos con 4 estanterías cada uno
        int[][] stock = {
                {15, 0, 8, 20},  // Pasillo 0
                {5, 30, 12, 0},  // Pasillo 1
                {0, 10, 45, 7}   // Pasillo 2
        };

        System.out.println("--- ESTADO ACTUAL DEL INVENTARIO ---");
        imprimirMatriz(stock);

        // 2. Cálculo del total (Recorrido completo)
        int totalProductos = 0;
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                totalProductos += stock[i][j];
            }
        }
        System.out.println("\nTotal de productos en almacén: " + totalProductos);

        // 3. Búsqueda de valores específicos (Ubicaciones vacías)
        System.out.print("Alerta! Estanterías vacías en: ");
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                if (stock[i][j] == 0) {
                    System.out.print("[" + i + "," + j + "] ");
                }
            }
        }
        System.out.println();

        // 4. Encontrar el valor máximo (Ubicación con más stock)
        int maximo = stock[0][0];
        int filaMax = 0, colMax = 0;
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                if (stock[i][j] > maximo) {
                    maximo = stock[i][j];
                    filaMax = i;
                    colMax = j;
                }
            }
        }
        System.out.println("Ubicación con mayor stock: Pasillo " + filaMax + ", Estantería " + colMax + " (" + maximo + " unidades)");

        // 5. Modificación de un dato (Actualización por teclado)
        System.out.println("\n--- ACTUALIZAR STOCK ---");
        System.out.print("Introduce Pasillo (0-2): ");
        int p = teclado.nextInt();
        System.out.print("Introduce Estantería (0-3): ");
        int e = teclado.nextInt();

        if (p >= 0 && p < stock.length && e >= 0 && e < stock[0].length) {
            System.out.print("Nueva cantidad: ");
            stock[p][e] = teclado.nextInt();
            System.out.println("Stock actualizado correctamente.");
        } else {
            System.out.println("Error: Ubicación inexistente.");
        }

        System.out.println("\n--- INVENTARIO FINALIZADO ---");
        imprimirMatriz(stock);
    }

    // Método para imprimir usando for-each (más limpio)
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }
}
