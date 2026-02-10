package org.example.Carrefour;

import java.util.Scanner;

public class Reponedor extends Persona {
    static Scanner teclado = new Scanner(System.in);
    public int getPasillo() {
        return pasillo;
    }

    public void setPasillo() {
        System.out.println("introducir la caja registradora:");
        pasillo = teclado.nextInt();
        teclado.nextLine();
    }

    public Reponedor(int codigo, String nombre, int sueldo) {
        super(codigo, nombre, sueldo);
        setPasillo();
    }

    @Override
    public String toString() {
        return "Reponedor{" +
                "pasillo=" + pasillo +
                '}';
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Pasillo en el que trabaja:"+ pasillo);
    }

    private int pasillo;
}
