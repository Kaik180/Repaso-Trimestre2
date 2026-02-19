package org.example.PruebasExcepcionesPerso;

import java.util.Scanner;

public class CuentaBancaria {
    public CuentaBancaria() {
        this.saldo = 0;
    }

    private int saldo;

    public void ingresarDinero() throws dineroValido {
        System.out.println("caunto dinero quieres ingresar?");
        Scanner teclado = new Scanner(System.in);
        int ingreso = teclado.nextInt();
        if (ingreso>3000){
            throw new dineroValido("Demasiado dinero ingresado");
        }else if (ingreso>0){
            saldo=saldo+ingreso;
        }else {
            throw new dineroValido("El dinero debe ser mayor a 0");
        }

    }
    public void sacarDinero() throws dineroValido {
        System.out.println("caunto dinero quieres sacar?");
        Scanner teclado = new Scanner(System.in);
        int sacar = teclado.nextInt();
        if (saldo<sacar){
            throw new dineroValido("No tienes dinero suficiente para sacar");
        }else if (sacar>0){
            saldo=saldo-sacar;
        }else {
            throw new dineroValido("debes sacar mas de 0");
        }

    }
    public void consultarDinero(){
        System.out.println("cantidad de dinero: "+ saldo);
    }


}
