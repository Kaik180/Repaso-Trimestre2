package org.example.Colecciones;

import java.util.Deque;
import java.util.LinkedList;

public class Palindromos {
    public static boolean esPalindromo(Deque<Character> palabra) {

        while (palabra.size() > 1) {
            Character primero = palabra.removeFirst();
            Character ultimo = palabra.removeLast();

            if (Character.toLowerCase(primero) != Character.toLowerCase(ultimo)) {
                return false;
            }
        }


        return true;
    }

    public static void main(String[] args) {
        Deque<Character> miPalabra = new LinkedList<>();
        miPalabra.add('R');
        miPalabra.add('A');
        miPalabra.add('D');
        miPalabra.add('A');
        miPalabra.add('R');

        if (esPalindromo(miPalabra)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
    }
}
