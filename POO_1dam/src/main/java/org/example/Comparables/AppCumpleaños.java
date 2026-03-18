package org.example.Comparables;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AppCumpleaños {


    static void main() {
        ArrayList<Invitado> invitados = new ArrayList<>();
        invitados.add(new Invitado(15, "juan"));
        invitados.add(new Invitado(13, "Carlos"));
        invitados.add(new Invitado(13, "Maria"));
        Collections.sort(invitados, new OrdenarPorEdadNombreHora());

        System.out.println(invitados);
    }
}
