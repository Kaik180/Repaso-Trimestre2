package org.example;
import java.util.Scanner;
import java.lang.classfile.instruction.SwitchCase;

public class MenuRecursividad {
    static boolean control = false;
    static void main() {
        Scanner teclado = new Scanner(System.in);
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
                    int numero = teclado.nextInt();
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
                        System.out.println(InvertirNumero(numero));
                    }else {
                        System.out.println("que frase quieres invertir?");
                        String frase = teclado.next();
                        System.out.println(InvenrtirCadena(frase));
                    }


                    break;
                case 4:

                    break;

                case 5:

                    break;
                case 6:

                    break;
                case 7:

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
    public static int InvenrtirCadena(String frase) {
        if (exponente == 0) {
            return 1;
        } else {
            return numero*Potencias(numero, exponente-1);
        }

    }
    public static int InvertirNumero(int numero) {
        if (exponente == 0) {
            return 1;
        } else {
            return numero*Potencias(numero, exponente-1);
        }

    }
}
