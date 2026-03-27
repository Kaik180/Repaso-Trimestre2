package org.example.lambda;

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

