package org.example.Practica2Futbol;

import org.example.PracticaInterfaz.Superheroe;
import org.example.PracticaInterfaz.Superman;

import java.util.ArrayList;

public class AppMutxameIFC2 {
    static void main() {
       Jugador portero = new Jugador("Juan", 20, Equipos.SENIOR,1,Posiciones.PORTERO);
        Jugador defensa = new Jugador("kevin", 21, Equipos.SENIOR,2,Posiciones.DEFENSA);
        Jugador delantero = new Jugador("Marcos", 22, Equipos.SENIOR,3,Posiciones.DELANTERO);
        Entrenador entrenador = new Entrenador("Lucas",30,Equipos.SENIOR,"1-1-1");
        Acompañante acompañante1 = new Acompañante("Maria",20,portero,"Novia");
        Acompañante acompañante2 = new Acompañante("javi",23,defensa,"Amigo");
        Masajista masajista = new Masajista("Carlos",25,"Profesional",5);
        Masajista masajista2 = new Masajista("Laura",22,"Profesional",3);
        ArrayList<MutxamelIFC>listaequipo= new ArrayList<>();
        listaequipo.add(portero);
        listaequipo.add(defensa);
        listaequipo.add(delantero);
        listaequipo.add(entrenador);
        listaequipo.add(acompañante1);
        listaequipo.add(acompañante2);
        listaequipo.add(masajista);
        for (MutxamelIFC a : listaequipo){
           a.concentrarse();
            if (a instanceof Entrenador || a instanceof Jugador) {
                ((AccionesDeportivas) a).entrenar();
            }
            if (a instanceof Masajista){
                ((Masajista) a).darMasaje(portero);
            }
            a.viajar("Madrid");
            if (a instanceof Entrenador) {
                ((Entrenador) a).planificarEntrenamiento();
            }
            if (a instanceof Entrenador || a instanceof Jugador) {
                ((AccionesDeportivas) a).entrenar();
            }
            if ( a instanceof Jugador) {
                ((Jugador) a).descansar();
                ((Jugador) a).calentar();
            }
            if (a instanceof Entrenador || a instanceof Jugador) {
                ((AccionesDeportivas) a).jugadorPartido("Equipo Z");
            }
            if (a instanceof Acompañante) {
                ((Acompañante) a).animarEquipo();
            }
            if (a instanceof Entrenador) {
                ((Entrenador) a).hacerCambios();
            }
            if ( a instanceof Jugador) {
                ((Jugador) a).marcarGol();
            }
            a.celebrarGol();
            if (a instanceof Masajista){
                ((Masajista) a).darMasaje(delantero);
                ((Masajista) a).darMasaje(defensa);
            }
            a.viajar("Mutxamel");
            if ( a instanceof Jugador) {
                ((Jugador) a).descansar();
            }
        }



    }
}
