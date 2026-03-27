package org.example.lambda;

import java.util.ArrayList;
import java.util.List;

public class FiltrarProducto {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Smartphone", 150.0, "Electrónica"));
        productos.add(new Producto("Laptop", 900.0, "Electrónica"));
        productos.add(new Producto("Tablet", 200.0, "Electrónica"));
        productos.add(new Producto("Camisa", 25.0, "Ropa"));
        productos.add(new Producto("Teclado", 50.0, "Electrónica"));

        FiltroProducto miFiltro = p -> p.categoria.equals("Electrónica") && p.precio > 100;

        List<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (miFiltro.filtrar(p)) {
                filtrados.add(p);
            }
        }

        System.out.println("Productos filtrados (Electrónica y precio > 100):");
        for (Producto p : filtrados) {
            System.out.println(p);
        }
    }
}
