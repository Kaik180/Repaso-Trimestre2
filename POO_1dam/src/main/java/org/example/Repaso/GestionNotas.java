package org.example.Repaso;

import java.util.Scanner;
import java.util.Arrays;

public class GestionNotas {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Definir tamaño del vector por teclado
        System.out.print("¿Cuántos alumnos hay en clase?: ");
        int numAlumnos = teclado.nextInt();

        // Declaración del vector
        double[] notas = new double[numAlumnos];

        // 2. Llenado del vector con validación (0 a 10)
        for (int i = 0; i < notas.length; i++) {
            double notaIntroducida;
            do {
                System.out.print("Introduce la nota del alumno " + (i + 1) + ": ");
                notaIntroducida = teclado.nextDouble();
                if (notaIntroducida < 0 || notaIntroducida > 10) {
                    System.out.println("Error: La nota debe estar entre 0 y 10.");
                }
            } while (notaIntroducida < 0 || notaIntroducida > 10);

            notas[i] = notaIntroducida;
        }

        // 3. Cálculos estadísticos (Media, Max, Min)
        double suma = 0;
        double notaMax = notas[0];
        double notaMin = notas[0];
        int aprobados = 0;

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i]; // Acumulador para la media

            if (notas[i] > notaMax) notaMax = notas[i]; // Buscar el mayor
            if (notas[i] < notaMin) notaMin = notas[i]; // Buscar el menor

            if (notas[i] >= 5) aprobados++; // Contador de aprobados
        }

        double promedio = suma / notas.length;

        // 4. Mostrar resultados
        System.out.println("\n--- RESULTADOS DEL ANÁLISIS ---");
        System.out.println("Notas introducidas: " + Arrays.toString(notas));
        System.out.printf("Nota media de la clase: %.2f%n", promedio);
        System.out.println("Nota más alta: " + notaMax);
        System.out.println("Nota más baja: " + notaMin);
        System.out.println("Total de alumnos aprobados: " + aprobados);

        // 5. Ordenación (Uso de la librería Arrays)
        Arrays.sort(notas);
        System.out.println("Notas ordenadas de menor a mayor: " + Arrays.toString(notas));

        // 6. Búsqueda de una nota específica
        System.out.print("\n¿Desea buscar si alguien sacó una nota específica?: ");
        double buscar = teclado.nextDouble();
        boolean encontrada = false;

        for (double n : notas) {
            if (n == buscar) {
                encontrada = true;
                break;
            }
        }

        if (encontrada) {
            System.out.println("Sí, al menos un alumno tiene un " + buscar);
        } else {
            System.out.println("No se encontró esa nota en el registro.");
        }
    }
}
