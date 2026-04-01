package org.example.Repaso;

import java.util.Stack;
import java.util.Scanner;

public class HistorialNavegador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Creamos la pila para almacenar las URLs (Strings)
        Stack<String> historial = new Stack<>();

        int opcion;

        do {
            System.out.println("\n--- SIMULADOR DE NAVEGADOR ---");
            // peek() muestra el elemento de arriba sin borrarlo
            String paginaActual = historial.isEmpty() ? "Ninguna (Pestaña vacía)" : historial.peek();
            System.out.println("Página actual: " + paginaActual);

            System.out.println("1. Visitar nueva web");
            System.out.println("2. Botón 'Atrás'");
            System.out.println("3. Ver cuántas páginas hay en el historial");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la URL de la web: ");
                    String url = teclado.nextLine();
                    // push() añade un elemento arriba de la pila
                    historial.push(url);
                    System.out.println("Visitando: " + url);
                    break;

                case 2:
                    // Es vital usar isEmpty() antes de un pop() para no romper el programa
                    if (!historial.isEmpty()) {
                        // pop() saca y devuelve el elemento superior
                        String paginaEliminada = historial.pop();
                        System.out.println("Cerrando: " + paginaEliminada);

                        if (!historial.isEmpty()) {
                            System.out.println("Volviendo a: " + historial.peek());
                        } else {
                            System.out.println("Ya no hay más páginas en el historial.");
                        }
                    } else {
                        System.out.println("No hay páginas para retroceder.");
                    }
                    break;

                case 3:
                    // size() nos dice cuántos elementos hay
                    System.out.println("Tienes " + historial.size() + " páginas guardadas.");
                    break;

                case 4:
                    System.out.println("Cerrando navegador...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }
}
