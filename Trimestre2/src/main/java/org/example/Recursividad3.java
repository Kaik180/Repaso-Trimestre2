package org.example;

public class Recursividad3 {
    static int inicio = 1;

    public static void main(String[] args) {
        System.out.println(sumar(inicio));
    }

    public static int sumar(int inicio) {
        if (inicio == 10) {
            return 10;
        } else {
            return inicio + sumar(inicio + 1);
        }

    }

}