package org.example;

public class Recursividad2 {
    static int limite = 10;
    public static void main(String[] args){

        imprimir(1);
    }
    public static void imprimir(int inicio){
        if (inicio > limite){
            return;
        }else{
            System.out.println(inicio);
            imprimir(inicio+1);
        }
    }
}
