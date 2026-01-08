package org.example;

import static org.example.Recursividad3.sumar;

public class EjMedirTiempoMemoria {
    static void main() {
        System.gc(); //Limpia lo que pueda antes de medir

        long inicioEjecucion = System.nanoTime();
        long memoriaAntes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        sumar(1);

        long finEjecucion = System.nanoTime();
        long memoriaDespues = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.println("Tiempo: " + (finEjecucion - inicioEjecucion) + " ns");
        System.out.println("Memoria consumida: " + (memoriaDespues - memoriaAntes) + " bytes");
    }
}
