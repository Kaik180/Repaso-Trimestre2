package org.example.Iteradores;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class TecladoEstropeado {
    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext())
            return false;
        else {
            Scanner teclado = new Scanner(System.in);
            ArrayList<Character> list = new ArrayList<>();
            ListIterator<Character> it = list.listIterator();

            String frase = teclado.nextLine();

            for (Character caracter : frase.toCharArray()){
                switch (caracter){
                    case '-':
                        while (it.hasPrevious()){
                            it.previous();
                        }
                        break;
                    case '+':
                        while (it.hasNext()){
                            it.next();
                        }
                        break;
                    case '*':
                        if (it.hasNext()){
                            it.next();
                        }
                        break;
                    case '3':
                        if (it.hasNext()){
                            it.next();
                            it.remove();
                        }
                        break;
                    default:
                        it.add(caracter);

                }

            }
            ArrayList<Character> palabra = new ArrayList<>();
            for (Character caracter : list){
                palabra.add(caracter);
            }
            for (Character a : palabra){
                System.out.print(a);
            }
            return true;
        }
    }

    static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}
