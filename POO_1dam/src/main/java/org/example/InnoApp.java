package org.example;

public class InnoApp {
    static void main() {
        Casa pisito = new Casa("calle falsa 123");

        System.out.println( pisito.getPropietario());

        pisito.crearHabitacion("cocina", 20);
        pisito.crearHabitacion("baño", 7);

        System.out.println(pisito.getListaHabitaciones());
        pisito.mostrarHabitaciones();


    }
}
