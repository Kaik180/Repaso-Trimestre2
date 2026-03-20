package org.example.StringBuilder;

import java.util.Random;

public class Bus {

    public static final int TAM = 97;

    static void main() throws InterruptedException {

        int a1 = 0;
        int a2 = 0;
        Random rand = new Random();

        System.out.println("\n<<<<<<<<<< ¡GRAN CARRERA DE AUTOBUSES! >>>>>>>>>>");
        Thread.sleep(3000);


        while (a1 < TAM && a2 < TAM) {


            if (rand.nextBoolean()) {
                a1++;
            }else {
                a2++;
            }

            limpiarPantalla();
            System.out.println(dibujarCarrera(a1));
            System.out.println(dibujarCarrera(a2));
            Thread.sleep(70);
        }


        if ( a2 >= TAM) {
            System.out.println("\033[36m" + "¡EL BUS 2 HA GANADO LA CARRERA!" + "\033[0m");
        } else if (a1 >= TAM) {
            System.out.println("\033[32m" + "¡EL BUS 1 HA GANADO LA CARRERA!" + "\033[0m");
        }
    }

    public static String dibujarCarrera(int n1) {
        StringBuilder sb = new StringBuilder();

        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n1)).append("________________    ").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|   IES MUTXAMEL  |)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append("_".repeat(117));

        return sb.toString();
    }

    public static void limpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}
