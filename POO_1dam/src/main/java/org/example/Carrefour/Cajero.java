package org.example.Carrefour;

import java.util.Scanner;

public class Cajero extends Persona {
    static  Scanner teclado = new Scanner(System.in);

    private int cajero;

    public int getCajero() {
        return cajero;
    }

    public void setCajero() {
        System.out.println("introducir la caja registradora:");
        cajero = teclado.nextInt();
        teclado.nextLine();
    }

    @Override
    public String toString() {
        return "Cajero{" +
                "cajero=" + cajero +
                '}';
    }
    @Override
    public void mostrarInfo(){
      super.mostrarInfo();
        System.out.println("Cajero que trabaja es"+ cajero);
    }

    @Override
    public void trabajar() {
        System.out.println("estar en el cajero");
    }


    public Cajero(int codigo, String nombre, int sueldo) {
        super(codigo, nombre, sueldo);
        setCajero();
    }
}
