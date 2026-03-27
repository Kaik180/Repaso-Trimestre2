package org.example.Ejemplos;

import java.util.HashMap;
import java.util.Map;

public class AnalizadorChatbot {

    public static void main(String[] args) {
        String historialText = "Hola hola quiero ir a la excursion porque la excursion es guay";

        Map<String, Integer> contador = contarFrecuencia(historialText);

        // Imprimir resultados
        contador.forEach((palabra, frecuencia) -> {
            System.out.println(palabra + ": " + frecuencia);
        });
    }

    public static Map<String, Integer> contarFrecuencia(String texto) {
        Map<String, Integer> mapaFrecuencia = new HashMap<>();

        // 1. Normalizar y dividir
        String[] palabras = texto.toLowerCase().split(" ");

        // 2. LÓGICA DE CONTEO (Tu reto)
        for (String p : palabras) {
            if (p.isEmpty()) continue; // Por si hay espacios dobles

            if (mapaFrecuencia.containsKey(p)) {
                // Ya existe: recupero valor actual y sumo 1
                int cuentaActual = mapaFrecuencia.get(p);
                mapaFrecuencia.put(p, cuentaActual + 1);
            } else {
                // No existe: es la primera vez que la vemos
                mapaFrecuencia.put(p, 1);
            }
        }

        return mapaFrecuencia;
    }
}
