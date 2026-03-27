package org.example.lambda;

public class Eje {
    static void main() {

        Ejecutor comparador = (n) -> n > 10;

        // Pruebas
        int[] valores = {15, 5};
        for (int v : valores) {
            System.out.println("Comparando para " + v + ":");
            System.out.println(comparador.ejecutar(v));
        }
    }
}
