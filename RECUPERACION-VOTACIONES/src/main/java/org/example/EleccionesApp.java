package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class EleccionesApp {
    static double matriz[][] = new double[10][10];
    static HashMap<String,Integer> votosPorPueblos = new HashMap<>();
    static HashSet<Votante> yaHanVotado = new HashSet<>();

    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*** ELECCION APP ***");
        System.out.println("Intorduce la poblacion:");
        String poblacion = teclado.nextLine();

        System.out.println("Empieza la votacion en"+ poblacion+"!!!");
        boolean bucle= true;
        System.out.println("introduce el tipo de documento a validar [DNI, NIE] o SALIR para finalizar la votacion:");
        String documento = teclado.nextLine();
            if (validarDocumentacion(documento)){
                System.out.println("introducido correctamente el documento");
            }

            while (bucle){
                System.out.println("Votante Nacional con DNI"+ documento+ " realizando voto...");
                System.out.println("¿SI o NO a la guerra? [SI, NO]");
                String decision = teclado.nextLine().toLowerCase();
                if (decision.equals("SI" )|| decision.equals("NO")){
                    System.out.println("Respuesta registrada. Gracias.");
                    break;
                }

            }



    }
    static boolean validarDocumentacion(String documentacion){
        Scanner teclado = new Scanner(System.in);
        boolean bucle=false;
        while (bucle==true){
            if (documentacion.matches("[1-9]{8}[A-Z]")){
                return true;

            }else{
                System.out.println("El DNI/NIE no es correcto");
                System.out.println("introduce el tipo de documento a validar [DNI, NIE] o SALIR para finalizar la votacion:");
                String documento = teclado.nextLine();
            }
        }
        return bucle;
    }
    static void verificarEmpodronamiento(Votante votante){
    }
    static void comprobarFreaude(Votante votante){
        System.out.println("comprobando datos...");
        if (votante.isVotado()){
            throw new FraudeExcepcion("¡AVISO A LA GUARDIA CIVIL! intento de doble voto detectado");
        }else {
            System.out.println(votante.getNombre() +" puede votar");
        }
    }
}
