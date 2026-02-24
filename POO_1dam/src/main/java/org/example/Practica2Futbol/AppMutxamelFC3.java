package org.example.Practica2Futbol;

public class AppMutxamelFC3 {
    static void main() {
        try {

            Jugador portero = new Jugador("Juan", 20, Equipos.BENJAMIN,1,Posiciones.PORTERO);
            Jugador portero2 = new Jugador("Juan", 20, Equipos.SENIOR,1,Posiciones.PORTERO);

        }catch (DorsalIncorrectaException e){
            System.out.println("Error "+ e.getMessage() );
        }

    }
}
