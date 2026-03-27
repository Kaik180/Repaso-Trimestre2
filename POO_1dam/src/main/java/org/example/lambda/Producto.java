package org.example.lambda;

import java.util.ArrayList;
import java.util.List;

class Producto {
    String nombre;
    double precio;
    String categoria;

    Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Precio: " + precio;
    }
}

@FunctionalInterface
interface FiltroProducto {
    boolean filtrar(Producto producto);
}
