package org.example.PruebasExcepcionesPerso;

import java.util.Scanner;

public class MenuAppCajero {
    static void main() throws dineroValido {
        Scanner teclado = new Scanner(System.in);
        boolean repetir = false;
        CuentaBancaria miCuenta = new CuentaBancaria();

        while (repetir != true){
            menu();
            String decision = pedir();
            switch (decision){
                case "1":
                    miCuenta.consultarDinero();
                    break;
                case "2":
                    miCuenta.ingresarDinero();
                    break;
                case "3":
                    miCuenta.sacarDinero();
                    break;
                case "x":
                    repetir=true;
                    break;
                default:
                    System.out.println("No has elegido una de las opciones");
                    break;
            }

        }
    }
    public static void menu(){
        System.out.println("=== CAJERO AUTOMATICO ===");
        System.out.println("1. consultar saldo");
        System.out.println("2. Ingresar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("X. Salir");
    }
    public static String pedir(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Que opcion quieres?");
        String opcion = teclado.next();
        return opcion;
    }

}
