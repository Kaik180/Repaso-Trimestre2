package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class ListaCompra {
    static void main() {
        ArrayList<String> listadelacompra = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        System.out.println("lista vacia?: "+ listadelacompra.isEmpty());

        listadelacompra.add("atun");
        System.out.println("lista vacia?: "+ listadelacompra.isEmpty());
        listadelacompra.addAll(Arrays.asList("atun","leche","huevos","beacon","queso"));
        System.out.println(listadelacompra);
        listadelacompra.add(2,"Queso");
        System.out.println("La leche esta en la posicion: "+ listadelacompra.indexOf("leche"));

        System.out.println("que quieres meter a la lista?");
        String palabra = teclado.next();
        if (InsertarElemento(palabra,listadelacompra) != -1){
        listadelacompra.add(palabra);
        }else {
            System.out.println("la palabra ya esta en la lista");
        }
        System.out.println("numero de elementos de la lista: "+ listadelacompra.size());
        ArrayList<String> copia = new ArrayList<>(listadelacompra);
        copia.clear();
        System.out.println("lista vacia?: "+ copia.isEmpty());
        System.out.println("las dos listas son iguales: "+ copia.equals(listadelacompra));
        listadelacompra.addAll(Arrays.asList("chocolate","pan"));
        ArrayList<String> faltantes = new ArrayList<>(listadelacompra);

        Random aleatorio = new Random();
        faltantes.removeAll(Arrays.asList(copia));
        ArrayList<Integer> precios = new ArrayList<>();

        for (String comida : listadelacompra){
            precios.add(aleatorio.nextInt(0,10));
        }
        System.out.println(listadelacompra);
        System.out.println(precios);

    }
    public static int InsertarElemento (String a, ArrayList<String> listadelacompra){
        return listadelacompra.indexOf(a);
    }
}
