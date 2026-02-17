package org.example.PracticaInterfaz;

import java.util.ArrayList;

public class VoladoresAPP {
    static void main() {
        Superman clark = new Superman();
        Pajaro piolin = new Pajaro();

        clark.volar();
        piolin.volar();
        Spiderman peter = new Spiderman();
        ArrayList<Superheroe> listaheroes = new ArrayList<>();
        listaheroes.add(clark);
        listaheroes.add(peter);
        for (Superheroe heroe : listaheroes){
            if (heroe instanceof Superman){
                ((Superman) heroe).rayolaser();
            }else {

            }
        }
    }
}
