package org.example.Colecciones;

import java.util.Stack;

public class Ej1 {
    public static void main(String[] args) {

        Stack<Character> pila = new Stack<>();


        pila.push('A');
        pila.push('B');
        pila.push('C');
        pila.push('D');
        pila.push('E');


        System.out.println("¿La pila está vacía? " + pila.isEmpty());


        System.out.println("Número de elementos en la pila: " + pila.size());


        System.out.println("Elemento en la cima (peek): " + pila.peek());


        System.out.println("Extrayendo elementos (pop):");
        while (!pila.isEmpty()) {
            char elemento = pila.pop();
            System.out.println(elemento);
        }


        System.out.println("¿La pila está vacía al final? " + pila.isEmpty());
    }
}
