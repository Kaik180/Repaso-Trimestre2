package org.example.Iteradores;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class MariaTeclado {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Character> list = new ArrayList<>();
        ListIterator<Character> it = list.listIterator();

        String frase = teclado.nextLine();

        for (Character caracter : frase.toCharArray()){
            switch (caracter){
                case '<':
                    if (it.hasPrevious()){
                        it.previous();
                    }
                break;
                case '>':
                    if (it.hasNext()){
                        it.next();
                    }
                    break;
                case '#':
                    if (it.hasPrevious()){
                        it.previous();
                        it.remove();
                    }
                    break;
                default:
                    it.add(caracter);

            }

        }
        for (Character caracter : list){
            System.out.print(caracter);
        }
    }
}
