package org.example;

import java.util.Scanner;

public class PacienteB {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Paciente paciente1 = new Paciente("juan",27,'M',70,160);
        paciente1.Imprimirpaciente();

        System.out.println(paciente1.calcularimc());

        if (paciente1.esMayorDeEdad()){
            System.out.println( "es mayor");
        }else {
            System.out.println( "es menor");
        }
        System.out.println( "dime nombre");
        String nombre = teclado.nextLine();
        System.out.println( "dime edad");
        int edad = teclado.nextInt();
        System.out.println( "dime genero (H-M)");
        char genero = teclado.next().charAt(0);
        System.out.println( "dime peso");
        int peso = teclado.nextInt();
        System.out.println( "dime altura");
        int altura = teclado.nextInt();
        Paciente pepe = new Paciente(nombre,edad,genero,peso,altura);
        System.out.println(pepe.calcularimc());

        if (pepe.esMayorDeEdad()){
            System.out.println( "es mayor");
        }else {
            System.out.println( "es menor");
        }
        pepe.Imprimirpaciente();
        Paciente juan = new Paciente("juan",27,'M',0,0);
        System.out.println(juan.calcularimc());

        if (juan.esMayorDeEdad()){
            System.out.println( "es mayor");
        }else {
            System.out.println( "es menor");
        }
        juan.Imprimirpaciente();

        Paciente carlos = new Paciente();
        carlos.setNombre("carlos");
        carlos.setPeso(60);
        carlos.setAltura(160);
        carlos.setEdad(20);
        carlos.setGenero('M');
        carlos.Imprimirpaciente();
        if (carlos.esMayorDeEdad()){
            System.out.println( "es mayor");
        }else {
            System.out.println( "es menor");
        }
        System.out.println(carlos.calcularimc());
    }

}
