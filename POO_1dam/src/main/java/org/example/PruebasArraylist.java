package org.example;

import java.util.ArrayList;

public class PruebasArraylist {
    static void main() {
        ArrayList<Integer> listanotas = new ArrayList<>();

        listanotas.add(5);
        listanotas.add(10);
        listanotas.add(1);

       System.out.println("elementos en la lista: "+listanotas.size());

        listanotas.add(2, 3);

        System.out.println("elementos en la lista: "+listanotas.size());

        System.out.println("nota de la posicion 1 : "+ listanotas.get(1));

        listanotas.remove(1);

        System.out.println(listanotas);

        System.out.println("El 10 esta en la posicion: "+ listanotas.indexOf(10));

        System.out.println("las notas de Raúl: ");
        for (Integer nota : listanotas){

            System.out.println("nota de la asignatura: "+ nota);
        }
        for (int i =0; i<listanotas.size(); i++){
            System.out.println("nota de la asignatura"+ (i+1)+ ": "+ listanotas.get(i));
        }
        listanotas.set(0,10);
        System.out.println(listanotas);

        ArrayList<Integer> copia = new ArrayList<>(listanotas);

        listanotas.clear();
        System.out.println("lista vacia?: "+ listanotas.isEmpty());

        System.out.println(listanotas);
    }


}
