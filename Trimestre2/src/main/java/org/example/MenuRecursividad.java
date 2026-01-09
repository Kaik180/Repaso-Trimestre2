package org.example;
import java.util.Scanner;

public class MenuRecursividad {
    static boolean control = false;
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        do {
            System.out.println("*** Bateria de ejercicios sobre recursividad ***");
            System.out.println("Selecciona a continuacion el modo que quieras ejecutar");
            System.out.println("1 - Digitos");
            System.out.println("2 - Potencias");
            System.out.println("3 - Del Revés");
            System.out.println("4 - Binario");
            System.out.println("5 - A Binario");
            System.out.println("6 - Orden alfabético");
            System.out.println("7 - Mostrar Suma");
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Elige el numero que quieras utilizar");
                    numero = teclado.nextInt();
                    System.out.println(Digitos(numero));
                    break;
                case 2:
                    System.out.println("Elige el numero que quieras utilizar");
                    int numero1 = teclado.nextInt();
                    System.out.println("Elige el numero que quieras utilizar como exponente");
                    int numero2 = teclado.nextInt();
                    System.out.println(Potencias(numero1, numero2));
                    break;
                case 3:
                    System.out.println("Quieres invertir 1-numeros o 2-cadena?");
                    int elegir = teclado.nextInt();
                    if (elegir==1){
                        System.out.println("que numero quieres invertir?");
                        numero = teclado.nextInt();
                        InvertirNumero(numero);
                    }else {
                        System.out.println("que frase quieres invertir?");
                        String frase = teclado.next();
                        char[]frase_char = frase.toCharArray();
                        InvenrtirCadena(frase_char.length-1, frase_char );
                    }


                    break;
                case 4:
                    System.out.println("Elige el numero que quieras comprobar si es binario");
                    String frase = teclado.next();
                    char[]frase_char = frase.toCharArray();
                    boolean decision = comprobarbinario(frase_char.length-1, frase_char );
                    if (decision == true ){
                        System.out.println("El numero es binario");
                    }else {
                        System.out.println("El numero no es binario");
                    }
                    break;

                case 5:
                    System.out.println("Dime el numero que quieres pasar a binario");
                    numero = teclado.nextInt();
                    String binario = "";
                    pasarabinariom2(numero);

                    break;
                case 6:

                    break;
                case 7:
                    System.out.println("Dime el numero que quieres ir sumando hasta ese");
                    numero = teclado.nextInt();
                    break;

                default:
                    ;
            }
            System.out.println("Elige una opcion: ");
            System.out.println("[M] - Volver al menú principal");
            System.out.println("[X] - Salir");
            String opcion2 = teclado.next();
            if (opcion2.equalsIgnoreCase("X")){
                control=true;
            }
        }while(control ==false);



    }
    public static int Digitos(int inicio) {
        if (inicio < 10) {
            return inicio;
        } else {
            int resultado = inicio/10;
            return 1 + Digitos(resultado);
        }

    }
    public static int Potencias(int numero, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return numero*Potencias(numero, exponente-1);
        }

    }
    public static void InvenrtirCadena(int posicion, char[] frase) {
        if (posicion>= 0) {
            System.out.println(frase[posicion]);
            InvenrtirCadena(posicion-1,frase);
        }

    }
    public static void InvertirNumero(int numero) {
        if ( numero < 10) {
            System.out.println(numero);
        } else {
            System.out.println(numero%10);
            InvertirNumero(numero/10);
        }

    }
    public static boolean comprobarbinario(int posicion, char[] frase) {
        if (posicion < 0) {
            return true;
        }

        if (frase[posicion] != '0' && frase[posicion] != '1') {
            return false;
        }

        return comprobarbinario(posicion - 1, frase);
    }
    public static void pasarabinario(int numero) {
        if (numero < 2) {
            System.out.print(numero);
        } else{
            pasarabinario(numero / 2);
            System.out.print(numero % 2);

        }

    }
    public static String pasarabinariom2(int numero) {
        if (numero < 2) {
            return Integer.toString(numero);
        } else{
            return pasarabinariom2(numero / 2)+numero%2;

        }

    }
    public static int sumatorio(int numero) {
        if (numero <= numero) {
            return ;
        } else{
            return sumatorio(numero / 2)+numero%2;

        }

    }

}
