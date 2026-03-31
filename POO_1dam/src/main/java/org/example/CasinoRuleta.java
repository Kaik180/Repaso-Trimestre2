package org.example;


import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CasinoRuleta {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        List<String> coloresValidos = Arrays.asList("rojo", "negro");
        List<String> opcionesParidad = Arrays.asList("par", "impar");

        System.out.print("Elige un número (0-36): ");
        int numeroUsuario = teclado.nextInt();
        teclado.nextLine();

        if (numeroUsuario < 0 || numeroUsuario > 36) {
            System.out.println("ERROR y salida del programa.");
            return;
        }

        String colorUsuario = "";
        String paridadUsuario = "";

        if (numeroUsuario != 0) {
            System.out.print("Elige color (rojo/negro): ");
            colorUsuario = teclado.nextLine().toLowerCase();
            if (!coloresValidos.contains(colorUsuario)) {
                System.out.println("ERROR");
                return;
            }

            System.out.print("¿Par o impar?: ");
            paridadUsuario = teclado.nextLine().toLowerCase();
            if (!opcionesParidad.contains(paridadUsuario)) {
                System.out.println("ERROR");
                return;
            }
        }

        int numeroRuleta = random.nextInt(37);
        String colorRuleta = coloresValidos.get(random.nextInt(2));
        String paridadRuleta = (numeroRuleta % 2 == 0) ? "par" : "impar";

        System.out.println("\nResultado de la ruleta: " + numeroRuleta + " " + colorRuleta + " (" + paridadRuleta + ")");
        
        if (numeroUsuario == numeroRuleta) {
            if (numeroUsuario == 0) {
                System.out.println("¡HA GANADO! (El 0 gana y los demás pierden)");
            } else {
                System.out.println("¡HA GANADO! Ha acertado el número.");
            }
        } else if (colorUsuario.equals(colorRuleta)) {
            System.out.println("Ha acertado el color.");
        } else if (paridadUsuario.equals(paridadRuleta) && numeroUsuario != 0) {
            System.out.println("Ha acertado la paridad (" + paridadUsuario + ").");
        } else {
            System.out.println("Ha perdido.");
        }
    }
}
