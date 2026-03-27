package org.example.lambda;

@FunctionalInterface
interface Ejecutor {
    boolean ejecutar(int num);
}

public class Eje {
    public static void main(String[] args) {
        // Implementación de la lambda
        Ejecutor comparador = (n) -> n > 10;

        // Pruebas
        int[] valores = {15, 5};
        for (int v : valores) {
            System.out.println("Comparando para " + v + ":");
            System.out.println(comparador.ejecutar(v));
        }
    }
}
