package org.example.Colecciones;

import java.util.*;

public class padel {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        // 1. Leer el nombre de la categoría (o FIN)
        if (!in.hasNext()) return false;
        String categoria = in.next();

        // 2. ¿Es el caso que marca el final?
        if (categoria.equals("FIN")) {
            return false;
        }

        // Estructura para guardar puntos: Nombre -> Puntos
        Map<String, Integer> tabla = new HashMap<>();
        int partidosJugados = 0;

        // Bucle para leer partidos hasta encontrar FIN
        while (true) {
            String equipoLocal = in.next();
            if (equipoLocal.equals("FIN")) break;

            int setsLocal = in.nextInt();
            String equipoVisitante = in.next();
            int setsVisitante = in.nextInt();

            partidosJugados++;

            // Inicializar equipos en el mapa si no existen
            tabla.putIfAbsent(equipoLocal, 0);
            tabla.putIfAbsent(equipoVisitante, 0);

            // Asignar puntos según resultado
            if (setsLocal > setsVisitante) {
                tabla.put(equipoLocal, tabla.get(equipoLocal) + 2);
                tabla.put(equipoVisitante, tabla.get(equipoVisitante) + 1);
            } else {
                tabla.put(equipoLocal, tabla.get(equipoLocal) + 1);
                tabla.put(equipoVisitante, tabla.get(equipoVisitante) + 2);
            }
        }

        // Determinar ganador y verificar empate
        String ganador = "";
        int maxPuntos = -1;
        boolean empate = false;
        int numParejas = tabla.size();

        for (Map.Entry<String, Integer> entry : tabla.entrySet()) {
            if (entry.getValue() > maxPuntos) {
                maxPuntos = entry.getValue();
                ganador = entry.getKey();
                empate = false;
            } else if (entry.getValue() == maxPuntos) {
                empate = true;
            }
        }

        // Calcular partidos no jugados (Liga ida y vuelta: N * (N-1))
        int partidosTotales = numParejas * (numParejas - 1);
        int noJugados = partidosTotales - partidosJugados;

        // Salida
        if (empate) {
            System.out.println("EMPATE " + noJugados);
        } else {
            System.out.println(ganador + " " + noJugados);
        }

        return true;
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba());
    }
}
