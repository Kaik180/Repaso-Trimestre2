package org.example.Practica1;

import org.example.Practica1.Cadena;
import org.example.Practica1.Empleado;
import org.example.Practica1.Invitado;
import org.example.Practica1.Programa;

import java.util.Scanner;

public class AppProgramas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Crear cadenas
        Cadena antena3 = new Cadena("Antena 3");
        Cadena telecinco = new Cadena("Telecinco");

        // Crear directores
        Empleado director1 = new Empleado("Pablo Motos", "director", null);
        Empleado director2 = new Empleado("Jorge Javier", "director", null);

        // Crear programas
        Programa hormiguero = new Programa("El Hormiguero", antena3, 5, director1);
        Programa salvame = new Programa("Sálvame Deluxe", telecinco, 3, director2);

        // Añadir empleados
        Empleado e1 = new Empleado("Laura", "presentador", hormiguero.getDirector());
        Empleado e2 = new Empleado("Carlos", "técnico", salvame.getDirector());
        hormiguero.addEmpleado(e1);
        salvame.addEmpleado(e2);

        // Añadir invitados (con fecha por teclado)
        System.out.println("Creando invitado para El Hormiguero:");
        Invitado i1 = new Invitado("actor", "Mario Casas", 5);
        hormiguero.addInvitado(i1);

        System.out.println("Creando invitado para Sálvame Deluxe:");
        Invitado i2 = new Invitado("actor", "Mario Casas", 3);
        salvame.addInvitado(i2);

        Invitado i3 = new Invitado("cantante", "Aitana", 5);
        hormiguero.addInvitado(i3);

        // Probar invitadosTemporada
        System.out.println("\n--- Invitados temporada 5 en El Hormiguero ---");
        hormiguero.invitadosTemporada(5);

        // Probar vecesInvitado
        System.out.println("\n--- Veces que Mario Casas ha sido invitado en El Hormiguero ---");
        System.out.println("Veces: " + hormiguero.vecesInvitado("Mario Casas"));

        // Probar rastrearInvitado
        System.out.println("\n--- Rastrear Mario Casas en El Hormiguero ---");
        hormiguero.rastrearInvitado("Mario Casas");

        // Probar buscarInvitado
        System.out.println("\n--- Buscar Aitana en Sálvame ---");
        boolean encontrado = salvame.buscarInvitado("Aitana");
        System.out.println("¿Está Aitana en Sálvame? " + encontrado);

        // Probar invitadoAntes
        System.out.println("\n--- ¿Dónde estuvo primero Mario Casas? ---");
        Programa.invitadoAntes("Mario Casas", hormiguero, salvame);
    }
}

