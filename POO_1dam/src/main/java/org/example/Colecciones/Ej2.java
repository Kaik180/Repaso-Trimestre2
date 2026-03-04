package org.example.Colecciones;

import java.util.Scanner;
import java.util.Stack;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();


        System.out.print("Introduce el primer número: ");
        pila.push(teclado.nextInt());

        System.out.print("Introduce el segundo número: ");
        pila.push(teclado.nextInt());

        System.out.print("Introduce el tercer número: ");
        pila.push(teclado.nextInt());

        System.out.println("Números en orden inverso:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
    }
}
