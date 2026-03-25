package org.example.Colecciones;

import java.util.*;

public class Parentesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String linea = sc.nextLine();
            Stack<Character> pila = new Stack<>();
            boolean ok = true;

            for (char c : linea.toCharArray()) {
                if (c == '(') {
                    pila.push(c);
                } else if (c == ')') {
                    if (pila.isEmpty()) {
                        ok = false;
                        break;
                    }
                    pila.pop();
                }
            }

            if (!pila.isEmpty()) ok = false;

            System.out.println(ok ? "YES" : "NO");
        }

        sc.close();
    }
}

