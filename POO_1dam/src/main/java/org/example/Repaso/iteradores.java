package org.example.Repaso;

import java.util.*;

class Producto {
    String nombre;
    int stock;

    Producto(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }

    @Override
    public String toString() { return nombre + " (" + stock + ")"; }
}

public class iteradores {
    public static void main(String[] args) {
        // 1. Creamos una lista de productos
        List<Producto> inventario = new ArrayList<>();
        inventario.add(new Producto("Teclado", 10));
        inventario.add(new Producto("Mouse", 0));      // <--- Queremos eliminar este
        inventario.add(new Producto("Monitor", 5));
        inventario.add(new Producto("Cable HDMI", 0));  // <--- Y este
        inventario.add(new Producto("Webcam", 2));

        System.out.println("Inventario inicial: " + inventario);

        // 2. Obtenemos el Iterador
        Iterator<Producto> it = inventario.iterator();

        // 3. Recorremos usando el iterador
        while (it.hasNext()) {
            // Obtenemos el siguiente producto
            Producto p = it.next();

            // Si el stock es 0, lo eliminamos de forma segura
            if (p.stock == 0) {
                System.out.println("Eliminando producto agotado: " + p.nombre);
                it.remove(); // Elimina el elemento actual de la lista original
            }
        }

        // 4. Resultado final
        System.out.println("Inventario limpio: " + inventario);

        // --- EXTRA: ListIterator (Solo para Listas) ---
        // Permite ir hacia atrás y modificar elementos sobre la marcha
        ListIterator<Producto> listIt = inventario.listIterator();
        if (listIt.hasNext()) {
            Producto primero = listIt.next();
            listIt.set(new Producto(primero.nombre, 100)); // Cambia el elemento
        }
        System.out.println("Después de ListIterator (update): " + inventario);
    }
}
