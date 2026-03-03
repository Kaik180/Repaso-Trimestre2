package org.example.Colecciones;

import java.util.ArrayList;
import java.util.Stack;

public class Colecciones {
    static void main() {
        ArrayList<Integer> listaNum = new ArrayList<>();
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(3);
        pila.push(12);
        System.out.println(pila.peek());
        pila.pop();
        System.out.println(pila.peek());
    }
}
