package org.example.PartidoTenis;

public class APPtenis {
    static void main() {
        Jugador Juan = new Jugador("Juan",1);
        Jugador Carlos = new Jugador("Carlos",2);
        Partido torneo = new Partido(Juan,Carlos);
    }
}
