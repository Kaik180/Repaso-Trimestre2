package org.example.Repaso;

import java.util.Scanner;
import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declaramos el HashMap: la Clave es el nombre (String) y el Valor es el stock (Integer)
        java.util.HashMap<String, Integer> inventario = new java.util.HashMap<>();

        // Añadimos algunos productos iniciales
        inventario.put("Manzanas", 50);
        inventario.put("Pan", 20);
        inventario.put("Leche", 15);

        int opcion;
        do {
            System.out.println("\n--- GESTIÓN DE TIENDA (HASHMAP) ---");
            System.out.println("1. Ver inventario completo");
            System.out.println("2. Buscar stock de un producto");
            System.out.println("3. Añadir/Actualizar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\nLista de productos:");
                    // Usamos un bucle para recorrer el Mapa (clave y valor)
                    for (Map.Entry<String, Integer> entrada : inventario.entrySet()) {
                        System.out.println("- " + entrada.getKey() + ": " + entrada.getValue() + " unidades");
                    }
                    break;

                case 2:
                    System.out.print("¿Qué producto buscas?: ");
                    String buscar = teclado.nextLine();
                    // containsKey() comprueba si la clave existe
                    if (inventario.containsKey(buscar)) {
                        System.out.println("Stock disponible de " + buscar + ": " + inventario.get(buscar));
                    } else {
                        System.out.println("El producto '" + buscar + "' no existe en la base de datos.");
                    }
                    break;

                case 3:
                    System.out.print("Nombre del producto: ");
                    String nombre = teclado.nextLine();
                    System.out.print("Cantidad: ");
                    int cantidad = teclado.nextInt();
                    // put() añade si no existe, y sobreescribe si ya existía
                    inventario.put(nombre, cantidad);
                    System.out.println("Producto actualizado.");
                    break;

                case 4:
                    System.out.print("Nombre del producto a eliminar: ");
                    String eliminar = teclado.nextLine();
                    if (inventario.remove(eliminar) != null) {
                        System.out.println("Producto eliminado correctamente.");
                    } else {
                        System.out.println("No se pudo eliminar: el producto no existe.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
            }
        } while (opcion != 5);
    }
}
