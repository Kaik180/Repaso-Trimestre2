package org.example.Practica2Futbol;

import org.example.PruebasExcepcionesPerso.EdadValida;

import java.util.Scanner;

public class AppMutxamelFC {
    static Scanner teclado = new Scanner(System.in);
    static void main() {

        System.out.println("=== App de mantenimiento del MUTXAMEL FC ===");
        System.out.println("1. Mantenimiento de jugadores");
        System.out.println("    Dentro podremos añadir jugadores, modificar datosy  añadir acompañantes (solo senior)");
        System.out.println("2. Mantenimiento de entrenadores y modificar sus datos");
        System.out.println("    Dentro podremos añadir entrenadores y modificar sus datos");
        System.out.println("3. Mantenimiento de masajistas (añadir-modificar datos-salir");
        System.out.println("    Dentro podemos añadir masajistas y modificar sus datos");
        System.out.println("4. Mantenimiento de masajistas (añadir-modificar datos-salir");
        System.out.println("    Dentro se deben listar los tipos de equipos del club y elegir uno");
        System.out.println("X. Salir");
        System.out.println("==========================================================================================");
        System.out.println("Selecciona una opción -->");
        try {
            throw new EdadValida();
        }catch (EdadValida e) {
            e.getMessage();

        }


    }
}
